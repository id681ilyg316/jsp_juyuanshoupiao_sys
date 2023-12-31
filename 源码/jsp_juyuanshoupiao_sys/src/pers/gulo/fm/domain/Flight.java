package pers.gulo.fm.domain;

import java.util.Date;

public class Flight {
	private int no;
	String name;
	private AirPlane airPlane;
	private String start;
	private String dist;
	private float price;
	private String time;
	private int passengerNumber;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getPassengerNumber() {
		return passengerNumber;
	}
	public void setPassengerNumber(int passengerNumber) {
		this.passengerNumber = passengerNumber;
	}
	public AirPlane getAirPlane() {
		return airPlane;
	}
	public void setAirPlane(AirPlane airPlane) {
		this.airPlane = airPlane;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Flight [no=" + no + ", airPlane=" + airPlane + ", start="
				+ start + ", dist=" + dist + ", price=" + price + ", time="
				+ time + ", passengerNumber=" + passengerNumber + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	

}
