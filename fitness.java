package queueassignment;

public class fitness {
	private String reg_num;
	private String lisc_plate;
	private String vehicle_type;
	
	public fitness() {
		
		reg_num="";
		lisc_plate="";
		vehicle_type="";
		
	}
	
	public fitness(String reg_num,String lisc_plate, String vehicle_type) {
		this.reg_num = reg_num;
		this.lisc_plate = lisc_plate;
		this.vehicle_type= vehicle_type;	
		
	}

	public String getReg_num() {
		return reg_num;
	}

	public void setReg_num(String reg_num) {
		this.reg_num = reg_num;
	}

	public String getLisc_plate() {
		return lisc_plate;
	}

	public void setLisc_plate(String lisc_plate) {
		this.lisc_plate = lisc_plate;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	

}
