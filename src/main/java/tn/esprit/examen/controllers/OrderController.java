package tn.esprit.examen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Dishes;
import tn.esprit.examen.entities.Order;
import tn.esprit.examen.services.IOrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
  private  final IOrderService orderService;
  @PostMapping("/create")
  public ResponseEntity<Order> create(@RequestBody Order order) {
    return ResponseEntity.ok(orderService.createOrder(order));
  }

  @GetMapping("/getall")
  public ResponseEntity<List<Order>> getAll() {
    return ResponseEntity.ok(orderService.getAllOrders());
  }



  @PutMapping("/{id}")
  public ResponseEntity<Order> update(@PathVariable String id, @RequestBody Order order) {
    return ResponseEntity.ok(orderService.updateOrder(id, order));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable String id) {
    orderService.deleteOrder(id);
    return ResponseEntity.noContent().build();
  }
}
