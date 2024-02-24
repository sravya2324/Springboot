package com.rest.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Charges {
	private String category;
	private double discount;
	private double gst;
	private double deliverycharge;
	public Charges() {
		super();
	}
	public Charges(String category, double discount, double gst, double deliverycharge) {
		super();
		this.category = category;
		this.discount = discount;
		this.gst = gst;
		this.deliverycharge = deliverycharge;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDeliverycharge() {
		return deliverycharge;
	}
	public void setDeliverycharge(double deliverycharge) {
		this.deliverycharge = deliverycharge;
	}
	@Override
	public String toString() {
		return "Discount [category=" + category + ", discount=" + discount + ", gst=" + gst + ", deliverycharge="
				+ deliverycharge + "]";
	}
}
