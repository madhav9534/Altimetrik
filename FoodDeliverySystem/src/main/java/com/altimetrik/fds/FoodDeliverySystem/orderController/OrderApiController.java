package com.altimetrik.fds.FoodDeliverySystem.orderController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.fds.FoodDeliverySystem.foodDevlSysVO.*;


@RestController
@RequestMapping("/order")
public class OrderApiController {

	@Autowired
	private OrderServiceDefImpl service;
	
	@PostMapping("/add")
	public String  addFood(@RequestBody  Request beans){
		return service.addFood(beans);
	}
	
	@PostMapping("/update")
	public String  updateFood(@RequestBody  Request beans){
		return service.updateFood(beans);
	}
	@GetMapping("/get")
	public List<Order>  get(){
		return service.get();
	}
	@RequestMapping("/delete")
	public String  delete(@RequestBody  Request beans){
		return service.delete(beans);
	}



}
