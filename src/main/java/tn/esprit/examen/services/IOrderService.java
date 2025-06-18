package tn.esprit.examen.services;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.examen.entities.Order;
import tn.esprit.examen.entities.Product;

import java.util.List;

public interface IOrderService {
  public Order createOrder(Order order) ;
  public List<Order> getAllOrders() ;
  public Order updateOrder(String id, Order newOrder) ;
  public void deleteOrder(String id) ;
  }
