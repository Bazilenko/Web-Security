package chnu.edu.websecurity.service;

/*
  @author   kifuk
  @project   web-security
  @class  ItemService
  @version  1.0.0 
  @since 9/8/2026 - 13.04
*/
import chnu.edu.websecurity.model.Restaurant;
import chnu.edu.websecurity.repository.RestaurantRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;
    private List<Restaurant> restaurants = new ArrayList<>();

    {
        restaurants.add(new Restaurant("1", "name1", "description1"));
        restaurants.add(new Restaurant("2", "name2", "description2"));
        restaurants.add(new Restaurant("3", "name3", "description3"));
    }

    @PostConstruct
    void init(){
        restaurantRepository.deleteAll();
        restaurants.forEach(this::createRestaurant);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
    public Restaurant createRestaurant(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }

    public Restaurant getRestaurant(String id){
        return restaurantRepository.findById(id).orElse(null);
    }

    public Restaurant updateRestaurant(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }

    public void deleteRestaurant(String id){
        restaurantRepository.deleteById((id));
    }
}
