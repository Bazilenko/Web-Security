package chnu.edu.websecurity.service;

/*
  @author   kifuk
  @project   web-security
  @class  ItemService
  @version  1.0.0 
  @since 9/8/2026 - 13.04
*/
import chnu.edu.websecurity.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    private List<Restaurant> restaurants = new ArrayList<>();

    {
        restaurants.add(new Restaurant("1", "name1", "description1"));
        restaurants.add(new Restaurant("2", "name2", "description2"));
        restaurants.add(new Restaurant("3", "name3", "description3"));
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurants;
    }
    public Restaurant createRestaurant(Restaurant item){
        restaurants.add(item);
        return item;
    }

    public Restaurant getRestaurant(String id){
        return restaurants.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Restaurant updateRestaurant(Restaurant item){
        Restaurant oldItem = getRestaurant(item.getId());
        restaurants.remove(oldItem);
        restaurants.add(item);
        return oldItem;
    }

    public void deleteRestaurant(String id){
        Restaurant item = getRestaurant(id);
        restaurants.remove(item);
    }
}
