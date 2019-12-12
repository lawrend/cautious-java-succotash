//package M12HW;
import java.util.*;
import java.util.concurrent.*;

public class CookThread implements Runnable {
	
	private BlockingQueue<Food> foodQueue;
	private List<Food> foodList;
	
	public CookThread(BlockingQueue<Food> foodQueue, List<Food> foodList) {
		this.foodQueue = foodQueue;
		this.foodList = foodList;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < foodList.size(); i++) {
			Food f = foodList.get(i);
		  try { 
			  foodQueue.put(f);
			  System.out.println("Cooking: " + f.getName());
			  Thread.sleep(f.getCookTime() * 1000);
			  
		  } catch(InterruptedException ex) {}
		}
		System.out.println("Cooks go home!");
	}
	

}
