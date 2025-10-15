package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderService {
	boolean addNewCustomer();
	Map<Customer,List<Item>> displayAll();
	
	Map.Entry<Customer, List<Item>> findByCustomerId(int cid);
	
	boolean deleteById(int cid);
	
	boolean deleteItemFromCust(int cid, int iid);
	
	boolean addNewItemInCust(int cid, int iid, String iname, int quan, double price);
}
