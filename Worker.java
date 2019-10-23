
public class Worker implements Sizeable {
	private String clothingSize;
	private String name;
	private int salary;
	public Worker(String clothingSize, String name, int salary) {
		
		this.clothingSize = clothingSize;
		this.name = name;
		this.salary = salary;
	}
	

	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}


	@Override
	public String getClothingSize() {
		return clothingSize;
	}

}
