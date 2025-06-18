package tn.esprit.examen.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "tables")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Table {
  @Id
  private String idTable;
  private Boolean paidstatus;
  private Integer Capacity;
  private Boolean isAvailable;
  private List<Order> orderList; // Embedded


}
