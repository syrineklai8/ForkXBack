package tn.esprit.examen.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "orders")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
  @Id
  private String idOrder;
  private OrderStatus orderStatus;
  private String notes;
  private float price;
  private String tableId;
  private List<Dishes> dishesList; // Embedded


}
