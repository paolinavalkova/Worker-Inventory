
public class Cloth implements Sizeable {
	private String model;
	private String size;
	private int price;
	public Cloth(String model, String size, int price) {
		
		this.model = model;
		this.size = size;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String getClothingSize() {
		return size;
	}
	
}
