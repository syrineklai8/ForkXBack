package tn.esprit.examen.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tables")
@Data

public class Table {
  @Id
  private Integer idTable;
}
