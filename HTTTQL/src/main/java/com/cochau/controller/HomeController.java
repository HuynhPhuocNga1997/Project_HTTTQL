package com.cochau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cochau.services.KhachHangService;

@Controller
@RequestMapping(value="/Home")
public class HomeController {

	@Autowired
	KhachHangService khachHangService;
	
	@RequestMapping(value="/Index")
	public String Index(ModelMap mm) {
		System.out.println(khachHangService.getAll());
		mm.put("listKH", khachHangService.getAll());
		
		return "Index";
	}
	
	@RequestMapping(value="/quanlynhacungcap")
	public String quanlyNhaCungCap(Model model){
		
	}
	
}
