package tn.esprit.examen.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "restaurents")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Restaurent {
  @Id
  private String idRestaurent;
  private RestaurentCategory restaurentCategory;
  private String Localisation;
  private List<Staff> staffList; // Embedded
  private List<Dishes> dishesList; // Embedded
  private List<Supplier> supplierList; // Embedded

}
