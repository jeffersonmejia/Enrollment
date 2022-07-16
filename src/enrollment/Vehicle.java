package enrollment;

public class Vehicle {

	private String plate;
	private int year;
	private String type;
	private String color;
	private float appraisal;

	//INITIALIZE ATTRIBUTES
	public Vehicle(String plate, int year, String type, String color, float appraisal) {
		this.plate = plate;
		this.year = year;
		this.type = type;
		this.color = color;
		this.appraisal = appraisal;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String tipoVehiculo) {
		this.type = tipoVehiculo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getAppraisal() {
		return appraisal;
	}

	public void setAppraisal(float avaluo) {
		this.appraisal = avaluo;
	}

}
