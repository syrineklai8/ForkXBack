package tn.esprit.examen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Dishes;
import tn.esprit.examen.services.IDishesService;

import java.util.List;

@RestController
@RequestMapping("/dishes")
@RequiredArgsConstructor
public class DishesController {
  private final IDishesService dishesService;

  @PostMapping("/create")
  public ResponseEntity<Dishes> create(@RequestBody Dishes dish) {
    return ResponseEntity.ok(dishesService.createDish(dish));
  }

  @GetMapping("/getall")
  public ResponseEntity<List<Dishes>> getAll() {
    return ResponseEntity.ok(dishesService.getAllDishes());
  }



  @PutMapping("/{id}")
  public ResponseEntity<Dishes> update(@PathVariable String id, @RequestBody Dishes dish) {
    return ResponseEntity.ok(dishesService.updateDish(id, dish));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable String id) {
    dishesService.deleteDish(id);
    return ResponseEntity.noContent().build();
  }
  // Sample JSON for Restaurent:
  // {
  //   "restaurentCategory": "FASTFOOD",
  //   "localisation": "Downtown",
  //   "staffList": [],
  //   "dishesList": [],
  //   "supplierList": []
  // }

  // Sample JSON for Staff:
  // {
  //   "nameStaff": "John Doe",
  //   "email": "john@example.com",
  //   "birthdate": "1990-01-01",
  //   "address": "123 Street",
  //   "phoneNumber": 12345678,
  //   "roleStaff": "WAITER",
  //   "password": "pass123",
  //   "orders": [],
  //   "products": []
  // }

  // Sample JSON for Supplier:
  // {
  //   "nameSupplier": "FreshFoods",
  //   "numberSupplier": 99887766,
  //   "email": "supplier@example.com",
  //   "productSupplied": "Tomatoes",
  //   "address": "Market Street"
  // }

  // Sample JSON for Table:
  // {
  //   "paidstatus": false,
  //   "capacity": 4,
  //   "isAvailable": true,
  //   "orderList": []
  // }
}
