package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import java.util.HashMap;
import java.util.ArrayList;
 
public class OrderDaoImp implements OrderDao {
	static Map<Customer,List<Item>> hm;
	static {
		hm = new HashMap<>();
		Customer c1 = new Customer(101,"Sakshi","12345");
		List<Item> list1 = new ArrayList<>();
		list1.add(new Item(1,"Shoes",50,5000));
		list1.add(new Item(2,"Shirt",20,3000));
		list1.add(new Item(3,"T-Shirt",30,2000));
		hm.put(c1, list1);
		
		Customer c2 = new Customer(102,"Sanika","56345");
		List<Item> list2 = new ArrayList<>();
		list2.add(new Item(4,"Jeans",50,5500));
		list2.add(new Item(5,"Hoodie",20,3500));
		list2.add(new Item(6,"Jacket",30,2500));
		hm.put(c2, list2);
	}

	@Override
	public boolean addNewCustomer(Customer c, List<Item> list) {
		if(!hm.containsKey(c)) {
			hm.put(c, list);
			return true;
		}
		return false;
	}

	@Override
	public Map<Customer, List<Item>> displayAll() {
		return hm;
	}

	@Override
	public Entry<Customer, List<Item>> findByCustomerId(int cid) {
		Set<Map.Entry<Customer, List<Item>>> eset= hm.entrySet();
		
		for(Map.Entry<Customer, List<Item>> e : eset) {
			if(e.getKey().getCid() == cid) {
				return e;
			}
		}
		return null;
	}

	@Override
	public boolean deleteById(int cid) {
		List<Item> lst = hm.remove(new Customer(cid));
		
		if(lst!=null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteItemFromCust(int cid, int iid) {
		List<Item> list = hm.get(new Customer(cid));
		if(list!=null) {
			return list.remove(new Item(iid));
		}
		return false;
	}

	@Override
	public boolean addNewItemInCust(int cid, int iid, String iname, int quan, double price) {
		List<Item> lst = hm.get(new Customer(cid));
		if(lst!=null) {
			lst.add(new Item(iid,iname,quan,price));
			return true;
		}
		return false;
	}
}
