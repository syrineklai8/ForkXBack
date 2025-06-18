package tn.esprit.examen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Table;
import tn.esprit.examen.services.ITableService;

import java.util.List;

@RestController
@RequestMapping("/table")
@RequiredArgsConstructor
public class TableController {
  private ITableService tableService;
  @PostMapping("/create")
  public ResponseEntity<Table> createTable(@RequestBody Table table) {
    return ResponseEntity.ok(tableService.createTable(table));
  }

  @GetMapping("/getall")
  public ResponseEntity<List<Table>> getAllTables() {
    return ResponseEntity.ok(tableService.getAllTables());
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Table> updateTable(@PathVariable String id, @RequestBody Table table) {
    return ResponseEntity.ok(tableService.updateTable(id, table));
  }

  @DeleteMapping("/delete/{id}")
  public ResponseEntity<Void> deleteTable(@PathVariable String id) {
    tableService.deleteTable(id);
    return ResponseEntity.noContent().build();
  }
}
