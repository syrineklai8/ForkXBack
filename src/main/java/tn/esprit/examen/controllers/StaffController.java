package tn.esprit.examen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Staff;
import tn.esprit.examen.services.IStaffService;

import java.util.List;

@RestController
@RequestMapping("/staff")
@RequiredArgsConstructor
public class StaffController {
  private IStaffService staffService;
  @PostMapping("/create")
  public ResponseEntity<Staff> createStaff(@RequestBody Staff staff) {
    return ResponseEntity.ok(staffService.createStaff(staff));
  }

  @GetMapping("/getall")
  public ResponseEntity<List<Staff>> getAllStaff() {
    return ResponseEntity.ok(staffService.getAllStaff());
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Staff> updateStaff(@PathVariable String id, @RequestBody Staff staff) {
    return ResponseEntity.ok(staffService.updateStaff(id, staff));
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Void> deleteStaff(@PathVariable String id) {
    staffService.deleteStaff(id);
    return ResponseEntity.noContent().build();
  }

}
