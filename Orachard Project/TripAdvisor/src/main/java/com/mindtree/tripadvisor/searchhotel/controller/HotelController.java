/**
 * 
 */
package com.mindtree.tripadvisor.searchhotel.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mindtree.tripadvisor.searchhotel.service.HotelService;

/**
 * @author M1056135
 *
 */
@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;
	
	@PostMapping("/addhotels")
	public String uploadHotelData(@RequestParam("file") MultipartFile file) {
		String successString = null;
		if(!file.isEmpty()) {
		try {
			successString = hotelService.uploadHotelData(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		else {
		successString = "not succeeded";
		}
		return successString;
		
	}
}
