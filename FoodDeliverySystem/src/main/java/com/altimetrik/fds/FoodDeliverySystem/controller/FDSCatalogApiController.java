package com.altimetrik.fds.FoodDeliverySystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.fds.FoodDeliverySystem.foodDevlSysVO.FoodMap;

@RestController
@RequestMapping("/browse")
public class FDSCatalogApiController {
	@Autowired
	 private FDSCatalogServiceDefImpl service;
	 
	
	@RequestMapping("/catalog")
	public List<FoodMap> Catalog() {
		
		return service.catalog();
	}
}
