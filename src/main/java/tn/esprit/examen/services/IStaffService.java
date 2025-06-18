package tn.esprit.examen.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Product;
import tn.esprit.examen.entities.Staff;

import java.util.List;

public interface IStaffService  {
  public Staff createStaff(Staff staff) ;
  public List<Staff> getAllStaff() ;
  public Staff updateStaff(String id, Staff newStaff) ;
  public void deleteStaff(String id) ;
  }
