/**
 * 
 */
package com.mindtree.tripadvisor.searchhotel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author M1056135
 *
 */
@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long hotelId;
	//address	
	private String area;
	private String city;
	private String country;
	@Column(name="hotel_description")
	private String hotelDescription;
	@Column(name="hotel_facilities")
	private String hotelFacilities;
	@Column(name="hotel_star_rating")
	private String hotelStarRating;
	@Column(name="image_urls")
	private String imageUrls;
	private String landmark;
	private String locality;
	private String pageurl;
	@Column(name="property_name")
	private String propertyName;
	@Column(name="property_type")
	private String propertyType;
	@Column(name="room_count")
	private String roomCount;
	@Column(name="room_facilities")
	private String roomFacilities;
	private String state;
	@Column(name="review_count")
	private String reviewCount;
	@Column(name="review_rating")
	private String reviewRating;
	@Column(name="stay_review_rating")
	private String stayReviewRating;
	@Column(name="tripadvisor_seller_rating")
	private String tripadvisorSellerRating;
	private String address;
	/**
	 * 
	 */
	public Hotel() {
	}
	public Hotel(long hotelId, String area, String city, String country, String hotelDescription,
			String hotelFacilities, String hotelStarRating, String imageUrls, String landmark, String locality,
			String pageurl, String propertyName, String propertyType, String roomCount, String roomFacilities,
			String state, String reviewCount, String reviewRating, String stayReviewRating, String tripadvisorSellerRating,
			String address) {
		super();
		this.hotelId = hotelId;
		this.area = area;
		this.city = city;
		this.country = country;
		this.hotelDescription = hotelDescription;
		this.hotelFacilities = hotelFacilities;
		this.hotelStarRating = hotelStarRating;
		this.imageUrls = imageUrls;
		this.landmark = landmark;
		this.locality = locality;
		this.pageurl = pageurl;
		this.propertyName = propertyName;
		this.propertyType = propertyType;
		this.roomCount = roomCount;
		this.roomFacilities = roomFacilities;
		this.state = state;
		this.reviewCount = reviewCount;
		this.reviewRating = reviewRating;
		this.stayReviewRating = stayReviewRating;
		this.tripadvisorSellerRating = tripadvisorSellerRating;
		this.address = address;
	}
	public long getHotelId() {
		return hotelId;
	}
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHotelDescription() {
		return hotelDescription;
	}
	public void setHotelDescription(String hotelDescription) {
		this.hotelDescription = hotelDescription;
	}
	public String getHotelFacilities() {
		return hotelFacilities;
	}
	public void setHotelFacilities(String hotelFacilities) {
		this.hotelFacilities = hotelFacilities;
	}
	public String getHotelStarRating() {
		return hotelStarRating;
	}
	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}
	public String getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(String imageUrls) {
		this.imageUrls = imageUrls;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getPageurl() {
		return pageurl;
	}
	public void setPageurl(String pageurl) {
		this.pageurl = pageurl;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getRoomCount() {
		return roomCount;
	}
	public void setRoomCount(String roomCount) {
		this.roomCount = roomCount;
	}
	public String getRoomFacilities() {
		return roomFacilities;
	}
	public void setRoomFacilities(String roomFacilities) {
		this.roomFacilities = roomFacilities;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(String reviewCount) {
		this.reviewCount = reviewCount;
	}
	public String getReviewRating() {
		return reviewRating;
	}
	public void setReviewRating(String reviewRating) {
		this.reviewRating = reviewRating;
	}
	public String getStayReviewRating() {
		return stayReviewRating;
	}
	public void setStayReviewRating(String stayReviewRating) {
		this.stayReviewRating = stayReviewRating;
	}
	public String getTripadvisorSellerRating() {
		return tripadvisorSellerRating;
	}
	public void setTripadvisorSellerRating(String tripadvisorSellerRating) {
		this.tripadvisorSellerRating = tripadvisorSellerRating;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
