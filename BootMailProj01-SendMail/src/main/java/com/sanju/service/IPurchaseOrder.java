package com.sanju.service;

public interface IPurchaseOrder {
	String purchase(String[] items, double[] prices, String[] emails) throws Exception;
}
 