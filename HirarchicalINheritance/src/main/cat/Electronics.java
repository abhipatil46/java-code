package main.cat;

import main.product.Product;

public class Electronics extends Product {
	protected String deviceType;

	public Electronics(String deviceType) {
		super("Electroniccs");
		this.deviceType=deviceType;
	}

}
