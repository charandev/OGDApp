/**
 * 
 */
package com.mindtree.tripadvisor.searchhotel.service.impl;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mindtree.tripadvisor.searchhotel.entity.Hotel;
import com.mindtree.tripadvisor.searchhotel.repository.HotelRepository;
import com.mindtree.tripadvisor.searchhotel.service.HotelService;

/**
 * @author M1056135
 *
 */
/**
 * @param hotelId
 * @param area
 * @param city
 * @param country
 * @param hotelDescription
 * @param hotelFacilities
 * @param hotelStarRating
 * @param imageUrls
 * @param landmark
 * @param latitude
 * @param locality
 * @param longitude
 * @param pageurl
 * @param propertyName
 * @param propertyType
 * @param roomCount
 * @param roomFacilities
 * @param state
 * @param reviewCount
 * @param reviewRating
 * @param stayReviewRating
 * @param tripadvisorSellerRating
 * @param address
 */
@Service
public class HotelServiceImpl implements HotelService{
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public String uploadHotelData(MultipartFile file) throws IOException {
		
		Workbook hotelWorkbook = new XSSFWorkbook(file.getInputStream());
		Sheet sheet = hotelWorkbook.getSheetAt(0);
		for (Row row : sheet) {
			Hotel hotel = new Hotel();			
			hotel.setArea(row.getCell(0).getStringCellValue());
			hotel.setCity(row.getCell(1).getStringCellValue());
			hotel.setCountry(row.getCell(2).getStringCellValue());
			hotel.setHotelDescription(row.getCell(3).getStringCellValue());
			hotel.setHotelFacilities(row.getCell(4).getStringCellValue());
			hotel.setHotelStarRating(row.getCell(5).getStringCellValue());
			hotel.setImageUrls(row.getCell(6).getStringCellValue());
			hotel.setLandmark(row.getCell(7).getStringCellValue());
			hotel.setLocality(row.getCell(8).getStringCellValue());
			hotel.setPageurl(row.getCell(9).getStringCellValue());
			hotel.setPropertyName(row.getCell(10).getStringCellValue());
			hotel.setPropertyType(row.getCell(11).getStringCellValue());
			hotel.setRoomCount(row.getCell(12).getStringCellValue());
			hotel.setRoomFacilities(row.getCell(13).getStringCellValue());
			hotel.setState(row.getCell(14).getStringCellValue());
			hotel.setReviewCount(row.getCell(15).getStringCellValue());
			hotel.setReviewRating(row.getCell(16).getStringCellValue());
			hotel.setStayReviewRating(row.getCell(17).getStringCellValue());
			hotel.setTripadvisorSellerRating(row.getCell(18).getStringCellValue());
			hotel.setAddress(row.getCell(19).getStringCellValue());
			hotelRepository.save(hotel);
			
		}
		
		
		return "success";
	}

}

