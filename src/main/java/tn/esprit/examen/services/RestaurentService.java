package tn.esprit.examen.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Restaurent;
import tn.esprit.examen.repositories.RestaurentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurentService implements  IRestaurentService{
  private final RestaurentRepository restaurentRepository;
  public Restaurent createRestaurent(Restaurent restaurent) {
    return restaurentRepository.save(restaurent);
  }

  public List<Restaurent> getAllRestaurents() {
    return restaurentRepository.findAll();
  }

  public Restaurent updateRestaurent(String id, Restaurent newRestaurent) {
    Restaurent r = restaurentRepository.findById(id).orElseThrow();
    r.setLocalisation(newRestaurent.getLocalisation());
    r.setRestaurentCategory(newRestaurent.getRestaurentCategory());
    r.setStaffList(newRestaurent.getStaffList());
    r.setDishesList(newRestaurent.getDishesList());
    r.setSupplierList(newRestaurent.getSupplierList());
    return restaurentRepository.save(r);
  }

  public void deleteRestaurent(String id) {
    restaurentRepository.deleteById(id);
  }

}
