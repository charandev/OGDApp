package com.mindtree.tripadvisor.searchhotel.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface HotelService {

	String uploadHotelData(MultipartFile file) throws IOException;

}
