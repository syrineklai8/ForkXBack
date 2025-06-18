package tn.esprit.examen.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Document(collection = "dishes")
@Data

public class Dishes {
  @Id
  private Integer idDishes;
}
