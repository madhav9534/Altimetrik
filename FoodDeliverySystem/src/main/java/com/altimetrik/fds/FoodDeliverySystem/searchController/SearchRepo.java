package com.altimetrik.fds.FoodDeliverySystem.searchController;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.altimetrik.fds.FoodDeliverySystem.foodDevlSysVO.*;

public interface SearchRepo extends CrudRepository<FoodMap, Integer>{
	
	@Query(value="SELECT fm.* FROM foodmap fm " + 
			"INNER JOIN restaurent r ON r.id=fm.rest_id WHERE r.rating >= :rating AND fm.price >= :price",nativeQuery = true)
	  public  List<FoodMap> findrest(@Param("rating") int name,@Param("price")double price);

}
