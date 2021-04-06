class Order {
	private int orderId;
	private Food orderedFoods;
	private double totalPrice;
	private String status;
	public Order(int orderId, Food orderedFoods) {
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Food getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(Food orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

class Food {
	private String foodName;
	private String cuisine;
	private String foodType;
	private int quantityAvailable;
	private double unitPrice;
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getQuantityAvailable() {
		return quantityAvailable;
	}
	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
public class Aggregation{
public static void main(String[] args) { 
	Food food = new Food(); 
	food.setFoodName("Pizza Margherita"); 
	food.setCuisine("Italian"); 
	food.setFoodType("Veg"); 
	food.setQuantityAvailable(10); 
	food.setUnitPrice(8.0); 
	Order order = new Order(101, food); 
	 
	System.out.println("Order placed successfully!"); 
	System.out.println("You have ordered: "+ order.getOrderedFoods().getFoodName()); 
	System.out.println("Order status: "+ order.getStatus());
} 
}