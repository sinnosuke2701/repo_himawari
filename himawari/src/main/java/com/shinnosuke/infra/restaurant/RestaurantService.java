package com.shinnosuke.infra.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantDao RestaurantDao;
		List<RestaurantDto> selectList(){
			List<RestaurantDto> restaurants = RestaurantDao.selectList();
			return restaurants;
		}
	
}
