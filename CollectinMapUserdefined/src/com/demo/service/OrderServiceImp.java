package com.demo.service;

import com.demo.dao.OrderDao;
import com.demo.dao.OrderDaoImp;
import com.demo.beans.Customer;
import com.demo.beans.Item;
import java.util.*;
import java.util.Map.Entry;

public class OrderServiceImp implements OrderService{
	OrderDao odao = new OrderDaoImp();

	@Override
	public boolean addNewCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer id");
		int cid = sc.nextInt();
		System.out.println("Enter Customer name");
		String name = sc.next();
		System.out.println("Enter Customer mob");
		String mob = sc.next();
		Customer c = new Customer(cid,name,mob);
		List<Item> list = new ArrayList<>();
		String ans;
		do {
			System.out.println("Enter item id");
			int iid = sc.nextInt();
			System.out.println("Enter item name");
			String iname = sc.next();
			System.out.println("Enter item quntity");
			int quat = sc.nextInt();
			System.out.println("Enter Price");
			double price = sc.nextDouble();
			list.add(new Item(iid,iname,quat,price));
			System.out.println("Do ypu want to add more items (y/n)");
			ans = sc.next();
		}while(ans.equals("y"));
		
		return odao.addNewCustomer(c,list);
	}

	@Override
	public Map<Customer, List<Item>> displayAll() {
		return odao.displayAll();
	}

	@Override
	public Entry<Customer, List<Item>> findByCustomerId(int cid) {
		return odao.findByCustomerId(cid);
	}

	@Override
	public boolean deleteById(int cid) {
		return odao.deleteById(cid);
	}

	@Override
	public boolean deleteItemFromCust(int cid, int iid) {
		return odao.deleteItemFromCust(cid,iid);
	}

	@Override
	public boolean addNewItemInCust(int cid, int iid, String iname, int quan, double price) {
		return odao.addNewItemInCust(cid,iid,iname,quan,price);
	}
}
