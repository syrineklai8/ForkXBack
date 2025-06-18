package tn.esprit.examen.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Supplier;
import tn.esprit.examen.repositories.SupplierRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SupplierService implements  ISupplierService{
  private  final SupplierRepository supplierRepository;
  public Supplier createSupplier(Supplier supplier) {
    return supplierRepository.save(supplier);
  }

  public List<Supplier> getAllSuppliers() {
    return supplierRepository.findAll();
  }

  public Supplier updateSupplier(String id, Supplier newSupplier) {
    Supplier supplier = supplierRepository.findById(id).orElseThrow();
    supplier.setNameSupplier(newSupplier.getNameSupplier());
    supplier.setNumberSupplier(newSupplier.getNumberSupplier());
    supplier.setEmail(newSupplier.getEmail());
    supplier.setProductSupplied(newSupplier.getProductSupplied());
    supplier.setAddress(newSupplier.getAddress());
    return supplierRepository.save(supplier);
  }

  public void deleteSupplier(String id) {
    supplierRepository.deleteById(id);
  }
}
