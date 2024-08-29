package com.shinnosuke.infra.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantController {

	@Autowired
	RestaurantService RestaurantService;

	@RequestMapping(value = "/xdm/v1/infra/restaurant/RestaurantXdm")
	public String RestaurantXdm(Model model) {
		List<RestaurantDto> restaurants = RestaurantService.selectList();

		model.addAttribute("list4", restaurants);
		
		
//		for (RestaurantDto restaurantdto : restaurants) {
//			System.out.println(restaurantdto.getSeq() + " | " + restaurantdto.getRes_Type() + " | "
//					+ restaurantdto.getRes_Name() + " | " + restaurantdto.getRes_Open() + " | "
//					+ restaurantdto.getRes_Close() + " | " + restaurantdto.getRes_Tel() + " | "
//					+ restaurantdto.getRes_Address() + " | " + restaurantdto.getRes_Parking() + " | "
//					+ restaurantdto.getRes_Reservation() + " | " + restaurantdto.getRes_Corkage() + " | "
//					+ restaurantdto.getRes_Introduction() + " | " + restaurantdto.getRes_ReDate() + " | "
//					+ restaurantdto.getRes_MoDate() + " | " + restaurantdto.getRes_DelNY());
//		}

		return "/xdm/v1/infra/restaurant/RestaurantXdm";
	}

}
