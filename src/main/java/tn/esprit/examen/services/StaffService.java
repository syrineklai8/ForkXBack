package tn.esprit.examen.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Staff;
import tn.esprit.examen.repositories.StaffRepository;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StaffService implements IStaffService , UserDetailsService {
  private  final StaffRepository staffRepository;
  public Staff createStaff(Staff staff) {
    return staffRepository.save(staff);
  }

  public List<Staff> getAllStaff() {
    return staffRepository.findAll();
  }

  public Staff updateStaff(String id, Staff newStaff) {
    Staff staff = staffRepository.findById(id).orElseThrow();
    staff.setNameStaff(newStaff.getNameStaff());
    staff.setEmail(newStaff.getEmail());
    staff.setBirthdate(newStaff.getBirthdate());
    staff.setAddress(newStaff.getAddress());
    staff.setPhoneNumber(newStaff.getPhoneNumber());
    staff.setRoleStaff(newStaff.getRoleStaff());
    staff.setPassword(newStaff.getPassword());
    return staffRepository.save(staff);
  }

  public void deleteStaff(String id) {
    staffRepository.deleteById(id);
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Staff staff = staffRepository.findByEmail(username)
      .orElseThrow(() -> new UsernameNotFoundException("User not found"));

    return new org.springframework.security.core.userdetails.User(
      staff.getEmail(),
      staff.getPassword(),
      Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + staff.getRoleStaff().name()))
    );
  }
}
