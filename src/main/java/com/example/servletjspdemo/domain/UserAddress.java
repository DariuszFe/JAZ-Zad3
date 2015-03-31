package com.example.servletjspdemo.domain;

import com.example.servletjspdemo.domain.Unit;

public class UserAddress extends Unit{

	private String username ="";
	private String addressType ="";
	private String province ="";
	private String city ="";
	private String postcode ="";
	private String street ="";
	private String housenr ="";
	
	public UserAddress(){
		super();
	}
	
	public UserAddress(String username, String addressType, String province, String city, String postcode, String street, String housenr){
		super();
		setUsername(username);
		setAddressType(addressType);
		setProvince(province);
		setCity(city);
		setPostcode(postcode);
		setStreet(street);
		setHousenr(housenr);
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHousenr() {
		return housenr;
	}
	public void setHousenr(String housenr) {
		this.housenr = housenr;
	}
	
	
}
