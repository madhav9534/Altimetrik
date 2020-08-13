package com.altimetrik.fds.FoodDeliverySystem.searchController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.altimetrik.fds.FoodDeliverySystem.foodDevlSysVO.*;

@Service
public class SearchRestaurantServiceImpl {
	
	@Autowired
	private SearchRepo srepo;
	
	public List<FoodMap> findrest(int rating,double price){
		return srepo.findrest(rating, price);
		
	}
	
	
}
