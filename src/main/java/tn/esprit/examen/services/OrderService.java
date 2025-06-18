package tn.esprit.examen.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Order;
import tn.esprit.examen.repositories.OrderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService implements  IOrderService{
private OrderRepository orderRepository;
  public Order createOrder(Order order) {
    return orderRepository.save(order);
  }

  public List<Order> getAllOrders() {
    return orderRepository.findAll();
  }

  public Order updateOrder(String id, Order newOrder) {
    Order order = orderRepository.findById(id).orElseThrow();
    order.setNotes(newOrder.getNotes());
    order.setPrice(newOrder.getPrice());
    order.setOrderStatus(newOrder.getOrderStatus());
    order.setTableId(newOrder.getTableId());
    return orderRepository.save(order);
  }

  public void deleteOrder(String id) {
    orderRepository.deleteById(id);
  }

}
