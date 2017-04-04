package StaffMS;



public class Secretory extends Employee {
	
	private double bonus;
	
	public Secretory(int id,String fullname,String bdate,String gender
			,String address,int telephone,String joindate,String education,double salary,double bonus){
		
		super( id,fullname,bdate, gender,address,telephone,joindate,education, salary);
		this.bonus=bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
