package tn.esprit.examen.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Product;
import tn.esprit.examen.entities.Table;

import java.util.List;

public interface ITableService {
  public Table createTable(Table table) ;
  public List<Table> getAllTables() ;
  public Table updateTable(String id, Table newTable) ;
  public void deleteTable(String id) ;

  }
