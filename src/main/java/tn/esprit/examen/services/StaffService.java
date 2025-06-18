package tn.esprit.examen.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Staff;
import tn.esprit.examen.repositories.StaffRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StaffService implements IStaffService{
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

}
