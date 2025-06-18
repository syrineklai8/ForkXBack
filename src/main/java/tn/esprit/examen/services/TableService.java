package tn.esprit.examen.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Table;
import tn.esprit.examen.repositories.TableRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TableService implements  ITableService{
private  final TableRepository tableRepository;
  public Table createTable(Table table) {
    return tableRepository.save(table);
  }

  public List<Table> getAllTables() {
    return tableRepository.findAll();
  }

  public Table updateTable(String id, Table newTable) {
    Table table = tableRepository.findById(id).orElseThrow();
    table.setCapacity(newTable.getCapacity());
    table.setIsAvailable(newTable.getIsAvailable());
    table.setPaidstatus(newTable.getPaidstatus());
    table.setOrderList(newTable.getOrderList());
    return tableRepository.save(table);
  }

  public void deleteTable(String id) {
    tableRepository.deleteById(id);
  }

}
