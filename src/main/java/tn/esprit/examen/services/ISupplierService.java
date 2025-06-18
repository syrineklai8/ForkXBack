package tn.esprit.examen.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Product;
import tn.esprit.examen.entities.Supplier;

import java.util.List;

public interface ISupplierService  {
  public Supplier createSupplier(Supplier supplier);
  public List<Supplier> getAllSuppliers() ;
  public Supplier updateSupplier(String id, Supplier newSupplier) ;
  public void deleteSupplier(String id) ;
  }
