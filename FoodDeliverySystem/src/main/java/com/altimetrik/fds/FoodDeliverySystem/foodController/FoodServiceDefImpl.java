package com.altimetrik.fds.FoodDeliverySystem.foodController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.altimetrik.fds.FoodDeliverySystem.foodDevlSysVO.*;
@Service
public class FoodServiceDefImpl {
	@Autowired
	private FoodRepo fdrepo;
	
	public String  addFood(@RequestBody  Request beans){
		Food f=new Food();
		f.setFoodName(beans.getFoodName());
		f.setCreateTs(new Date());
		f.setUpdateTs(new Date());
		fdrepo.save(f);
		return f.getId()+" with id food is created";
	}
	
	
	public String  updateFood(@RequestBody  Request beans){
		Food f=new Food();
		f.setFoodName(beans.getFoodName());
		f.setDescription(beans.getDescription());
		f.setUpdateTs(new Date());
		fdrepo.delete(f);
		return f.getId()+" with id food is delete";
	}
	
	public List<Food>  get(){
		List<Food> list=new ArrayList<Food>();
		fdrepo.findAll().forEach(list::add);
		return list;
	}
	
	public String  delete(@RequestBody  Request beans){
		Food f=new Food();
		f.setId(beans.getId());
		fdrepo.deleteById(f.getId());
		return "deleted";
	}

}
