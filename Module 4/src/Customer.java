import java.util.*;

public class Customer {
	private String name;
	private ArrayList<Order> orderList;
	public static int customerCount = 0;
	   
	public Customer(String name) {
	    this.name = name;
	    orderList = new ArrayList<Order>();
	    customerCount ++;
	 } 
	
	public Customer(String name, Order ord) {
		this(name);
		orderList.add(ord);
		
	}
	
	public String getName() {
		return name;
	}
	
	public double getTotalOwed() {
		double total = 0.0;
		for(int i = 0; i < orderList.size(); i++) {
			double amt = orderList.get(i).getTotal();
			total += amt;
		}
		return total;
	}
	
	public void addOrder(Order ord) {
		double totalOwed = this.getTotalOwed();
		if(totalOwed < 800) {
		orderList.add(ord);
		}
	}	
	
	public ArrayList<Order> getOrders() {
		return orderList;
	}
	
	public String toString() {
		return "Customer Name: " + name + "\nNumber of Orders: " + orderList.size();
	}
	
	public static int getCustomerCount() {
		return customerCount;
	}
}
