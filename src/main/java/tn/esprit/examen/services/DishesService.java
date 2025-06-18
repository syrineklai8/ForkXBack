package tn.esprit.examen.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Dishes;
import tn.esprit.examen.repositories.DishesRepository;
import tn.esprit.examen.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishesService implements IDishesService{
  private final DishesRepository dishesRepository;
  private final ProductRepository productRepository;
  // Create
  public Dishes createDish(Dishes dish) {
    return dishesRepository.save(dish);
  }
  // Read All
  public List<Dishes> getAllDishes() {
    return dishesRepository.findAll();
  }
  // Update
  public Dishes updateDish(String id, Dishes newDish) {
    Dishes dish = dishesRepository.findById(id)
      .orElseThrow(() -> new RuntimeException("Dish not found"));

    dish.setNameDishe(newDish.getNameDishe());
    dish.setDishesCategory(newDish.getDishesCategory());
    dish.setPrice(newDish.getPrice());
    return dishesRepository.save(dish);
  }
  // Delete
  public void deleteDish(String id) {
    dishesRepository.deleteById(id);
  }
}
