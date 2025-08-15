package java_practice;

public class Car implements Runnable{
		private String brand;
	    
	    public Car(String brand) {
	        this.brand = brand;
	    }
	    @Override
	    public void run() {
	        System.out.println(brand + " cars on the road.");
	    }
	    
	    public String getBrand() {
	        return brand;
	    }
	    
	    public void setBrand(String brand) {
	        this.brand = brand;
	    }
	    
}
