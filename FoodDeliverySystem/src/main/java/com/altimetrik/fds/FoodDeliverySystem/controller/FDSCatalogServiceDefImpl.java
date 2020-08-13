package com.altimetrik.fds.FoodDeliverySystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.altimetrik.fds.FoodDeliverySystem.foodDevlSysVO.*;
import com.altimetrik.fds.FoodDeliverySystem.controller.*;
import com.altimetrik.fds.FoodDeliverySystem.foodService.FoodMapServiceDefIpl;
@Service
public class FDSCatalogServiceDefImpl {
	@Autowired
	private FoodMapServiceDefIpl ser;
	public List<FoodMap> catalog(){
		List<FoodMap> list=null;
		return ser.get();
		
		
	}

}
