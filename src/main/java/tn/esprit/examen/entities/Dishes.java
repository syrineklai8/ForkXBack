package tn.esprit.examen.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import java.util.List;

@Document(collection = "dishes")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dishes {
  @Id
  private String idDishes;
  private String nameDishe;
  private DishesCategory dishesCategory;
  private float price;
  private List<Product> productList; // Embedded


}
