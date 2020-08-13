package com.altimetrik.fds.FoodDeliverySystem.foodService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import com.altimetrik.fds.FoodDeliverySystem.foodDevlSysVO.*;

@Service
public class FoodMapServiceDefIpl {
	@Autowired
	private FoodMapRepo fdmaprepo;
	
	public String  addFood(@RequestBody  Request beans){
		FoodMap f=new FoodMap();
		f.setFoodId(beans.getFoodId());
		f.setRestId(beans.getRestId());
		f.setPrice(beans.getPrice());
		f.setCreateTs(new Date());
		f.setUpdateTs(new Date());
		fdmaprepo.save(f);
		return f.getId()+" with id foodMap is created";
	}
	
	public String  updateFood(@RequestBody  Request beans){
		FoodMap f=new FoodMap();
		f.setFoodId(beans.getFoodId());
		f.setRestId(beans.getRestId());
		f.setPrice(beans.getPrice());
		f.setUpdateTs(new Date());
		fdmaprepo.delete(f);
		return f.getId()+" with id foodMap is update";
	}
	
	public List<FoodMap>  get(){
		List<FoodMap> list=new ArrayList<FoodMap>();
		fdmaprepo.findAll().forEach(list::add);
		return list;
	}
	
	public String  delete(@RequestBody  Request beans){
		FoodMap f=new FoodMap();
		f.setId(beans.getId());
		fdmaprepo.deleteById(f.getId());
		return "deleted";
	}


	

	
}
