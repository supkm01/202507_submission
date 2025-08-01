package week3_oushigou.practice3;

public class Order {
	
	    private static int nextId = 1;
	    private int orderId;
	    private Product product;
	    private int quantity;
	    private String customerName;

	    public Order(Product product, int quantity, String customerName) {
	        this.orderId = nextId++;
	        this.product = product;
	        this.quantity = quantity;
	        this.customerName = customerName;
	    }

	    public void processOrder() {
	        double totalCost = product.getPrice() * quantity;
	        if (product.getStock() >= quantity) {
	            System.out.println("Order placed by customer: " + customerName);
	            System.out.printf("Order ID: %d, Product: %s, Quantity: %d, Total Cost: %.2f%n", 
	                              orderId, product.getName(), quantity, totalCost);
	            product.decreaseStock(quantity);
	        } else {
	            System.out.println("Order placed by customer: " + customerName);
	            System.out.printf("Insufficient stock for order ID: %d, Product: %s%n", 
	                              orderId, product.getName());
	            System.out.println("Remaining stock for " + product.getName() + ": " + product.getStock());
	        }
	    }
	}
	

