package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderDao {
	boolean addNewCustomer(Customer c, List<Item> list);

	Map<Customer, List<Item>> displayAll();

	Entry<Customer, List<Item>> findByCustomerId(int cid);

	boolean deleteById(int cid);

	boolean deleteItemFromCust(int cid, int iid);

	boolean addNewItemInCust(int cid, int iid, String iname, int quan, double price);
}
