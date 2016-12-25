package com.mithun.code;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mithun.code.model.Shop; 

@Controller
public class JsonController {

	//@RequestMapping(value="/mithun", method= RequestMethod.GET)
	@RequestMapping(value="/mithun/{name}", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@PathVariable String name, Model model) {
		System.out.println("in here");
		Shop shop = new Shop();
		shop.setName("mithun");
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
		model.addAttribute("mithun", "mohan");
		return shop;

	}	
	
}
