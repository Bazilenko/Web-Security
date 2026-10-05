package chnu.edu.websecurity.controller;

/*
  @author   kifuk
  @project   web-security
  @class  ItemController
  @version  1.0.0 
  @since 9/8/2026 - 13.06
*/
import chnu.edu.websecurity.model.Restaurant;
import chnu.edu.websecurity.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurants")
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService restaurantService;

    @GetMapping
    public List<Restaurant> getAll(String id){
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurant(@PathVariable String id){
        return restaurantService.getRestaurant(id);
    }

    @PostMapping
    public Restaurant createRestaurant(@RequestBody Restaurant item){
        return restaurantService.createRestaurant(item);
    }

    @PutMapping
    public Restaurant updateRestaurant(@RequestBody Restaurant item){
        return restaurantService.updateRestaurant(item);
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable String id){
        restaurantService.deleteRestaurant(id);
    }

}
