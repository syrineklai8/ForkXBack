package tn.esprit.examen.SpringSecurity;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.DTOSignUp.SigninRequest;
import tn.esprit.examen.DTOSignUp.SignupRequest;
import tn.esprit.examen.entities.Staff;
import tn.esprit.examen.repositories.StaffRepository;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

  private final StaffRepository staffRepository;
  private final PasswordEncoder passwordEncoder;
  private final JwtUtil jwtUtil;

  @PostMapping("/signup")
  public ResponseEntity<String> register(@RequestBody SignupRequest req) {
    if (staffRepository.existsByEmail(req.getEmail())) {
      return ResponseEntity.badRequest().body("Email already exists");
    }

    Staff staff = new Staff();
    staff.setEmail(req.getEmail());
    staff.setPassword(passwordEncoder.encode(req.getPassword()));
    staff.setNameStaff(req.getNameStaff());
    staff.setRoleStaff(req.getRoleStaff());

    staffRepository.save(staff);
    return ResponseEntity.ok("Account created");
  }

  @PostMapping("/signin")
  public ResponseEntity<JwtResponse> login(@RequestBody SigninRequest req) {
    Staff staff = staffRepository.findByEmail(req.getEmail())
      .orElseThrow(() -> new RuntimeException("User not found"));

    if (!passwordEncoder.matches(req.getPassword(), staff.getPassword())) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    String token = jwtUtil.generateToken(staff.getEmail(), staff.getRoleStaff().name());
    return ResponseEntity.ok(new JwtResponse(token, staff.getRoleStaff()));
  }
}
