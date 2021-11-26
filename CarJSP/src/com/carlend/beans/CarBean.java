package com.carlend.beans;

public class CarBean {
   private String CarNo,CarName,Model;
   private int NoOfCars,lentCars,rent;
   
   public CarBean() {}

public CarBean(String carNo, String carName, String model, int noOfCars,int rent) {
	super();
	CarNo = carNo;
	CarName = carName;
	Model = model;
	NoOfCars = noOfCars;
	this.rent=rent;
}

public int getRent() {
	return rent;
}

public void setRent(int rent) {
	this.rent = rent;
}

public int getLentCars() {
	return lentCars;
}

public void setLentCars(int lentCars) {
	this.lentCars = lentCars;
}

public String getCarNo() {
	return CarNo;
}

public void setCarNo(String carNo) {
	CarNo = carNo;
}

public String getCarName() {
	return CarName;
}

public void setCarName(String carName) {
	CarName = carName;
}

public String getModel() {
	return Model;
}

public void setModel(String model) {
	Model = model;
}

public int getNoOfCars() {
	return NoOfCars;
}

public void setNoOfCars(int noOfCars) {
	NoOfCars = noOfCars;
}
   
   
}
