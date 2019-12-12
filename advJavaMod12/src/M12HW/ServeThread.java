//package M12HW;
import java.util.concurrent.*;

public class ServeThread implements Runnable {
	private BlockingQueue<Food> foodQueue;
	private int foodListSize; 
	
	public ServeThread(BlockingQueue<Food> foodQueue, int foodListSize) {
		this.foodQueue = foodQueue;
		this.foodListSize = foodListSize;
	}
		
	@Override
	public void run() {
		for (int i = 0; i < foodListSize; i++) {
		  try { 
			  Food f = foodQueue.take();
			  System.out.println("Serving: " + f.getName());
			  Thread.sleep(f.getServeTime() * 1000);
		  } catch(InterruptedException ex) {}
		}
		System.out.println("Servers go home!");
	}
	

}
