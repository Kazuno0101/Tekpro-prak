package praktikum7;

public class Executive extends Employee {
	private double bonus;

	public Executive (String eName, String eAddress, String ePhone,String sosSecNumber, double rate) {
	    super (eName, eAddress, ePhone, sosSecNumber, rate);
	    
	    bonus = 0; //bonus has yet a to be awarded
	}

	public void awardBonus(double execBonus) {
	    bonus = execBonus;
	}

	public double pay()
	{
	    double payment = super.pay() + bonus;
	    
	    bonus = 0;
	    
	    return payment;
	}
}