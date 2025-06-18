package tn.esprit.examen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Restaurent;
import tn.esprit.examen.services.IRestaurentService;

import java.util.List;

@RestController
@RequestMapping("/restaurent")
@RequiredArgsConstructor
public class RestaurentController {
  private final IRestaurentService restaurentService;
  @PostMapping("/create")
  public ResponseEntity<Restaurent> createRestaurent(@RequestBody Restaurent restaurent) {
    return ResponseEntity.ok(restaurentService.createRestaurent(restaurent));
  }

  @GetMapping("/getall")
  public ResponseEntity<List<Restaurent>> getAllRestaurents() {
    return ResponseEntity.ok(restaurentService.getAllRestaurents());
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Restaurent> updateRestaurent(@PathVariable String id, @RequestBody Restaurent restaurent) {
    return ResponseEntity.ok(restaurentService.updateRestaurent(id, restaurent));
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Void> deleteRestaurent(@PathVariable String id) {
    restaurentService.deleteRestaurent(id);
    return ResponseEntity.noContent().build();
  }
}
