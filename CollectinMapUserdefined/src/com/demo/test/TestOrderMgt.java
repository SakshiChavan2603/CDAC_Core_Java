package com.demo.test;
import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.service.OrderServiceImp;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class TestOrderMgt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OrderServiceImp oservice = new OrderServiceImp();
		int choice=0;
		
		do {
			System.out.println("1.Add new Customer\n 2.Display All\n 3.Find out list of items on customer\n ");
			System.out.println("4.delete Customer by id\n 5.add new Item in existing order\n 6.delete Item from existing order");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1->{
					boolean status = oservice.addNewCustomer();
					if(status) {
						System.out.println("added suscccessfully");
					}else {
						System.out.println("duplicate");
					}
				}
				
				case 2->{
					Map<Customer,List<Item>> m = oservice.displayAll();
					Set<Map.Entry<Customer,List<Item>>> kset = m.entrySet();
					kset.forEach(e->System.out.println(e.getKey() + "-->" + e.getValue()));
				}
				
				case 3->{
					System.out.println("Enter cid of customer to get list of items");
					int cid = sc.nextInt();
					Map.Entry<Customer,List<Item>> list = oservice.findByCustomerId(cid);
					System.out.println(list);
				}
				
				case 4->{
					System.out.println("Enter customer id");
					int cid = sc.nextInt();
					boolean status = oservice.deleteById(cid);
					if(status) {
						System.out.println("Deleted successfully");
					}else {
						System.out.println("not found");
					}
				}
				
				case 5->{
					System.out.println("Enetr customer id");
					int cid = sc.nextInt();
					System.out.println("Enetr Item id");
					int iid = sc.nextInt();
					System.out.println("Enetr Item name");
					String iname = sc.next();
					System.out.println("Enetr Item Qunatity");
					int quan = sc.nextInt();
					System.out.println("Enetr Item price");
					double price = sc.nextDouble();
					boolean status = oservice.addNewItemInCust(cid,iid,iname,quan,price);
					if(status) {
						System.out.println("Added successfully");
					}else {
						System.out.println("not found");
					}
				}
				
				case 6->{
					System.out.println("Enetr the customer id");
					int cid = sc.nextInt();
					System.out.println("Enter item id");
					int iid = sc.nextInt();
					boolean status = oservice.deleteItemFromCust(cid,iid);
					if(status) {
						System.out.println("Deleted successfully");
					}else {
						System.out.println("not found");
					}
				}
				
				case 7->{
					System.out.println("Thanks for visiting");
					sc.close();
				}
				
				default->{
					System.out.println("Invalid choice");
				}
			}
		}while(choice!=7);
	}
}
