package tn.esprit.examen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Supplier;
import tn.esprit.examen.services.ISupplierService;

import java.util.List;

@RestController
@RequestMapping("/supplier")
@RequiredArgsConstructor
public class SupplierController {
  private final ISupplierService supplierService;
  @PostMapping("/create")
  public ResponseEntity<Supplier> createSupplier(@RequestBody Supplier supplier) {
    return ResponseEntity.ok(supplierService.createSupplier(supplier));
  }

  @GetMapping("/getall")
  public ResponseEntity<List<Supplier>> getAllSuppliers() {
    return ResponseEntity.ok(supplierService.getAllSuppliers());
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Supplier> updateSupplier(@PathVariable String id, @RequestBody Supplier supplier) {
    return ResponseEntity.ok(supplierService.updateSupplier(id, supplier));
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Void> deleteSupplier(@PathVariable String id) {
    supplierService.deleteSupplier(id);
    return ResponseEntity.noContent().build();
  }
}
