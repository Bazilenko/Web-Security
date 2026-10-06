package chnu.edu.websecurity.repository;

import chnu.edu.websecurity.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
  @author   kifuk
  @project   web-security
  @class  RestaurantRepository
  @version  1.0.0 
  @since 10/6/2026 - 14.47
*/
@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
}
