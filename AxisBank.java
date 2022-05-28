package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("I need to deposit the money in Axis ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axis = new AxisBank();
//		Deposit method is override
		axis.deposit();
		axis.Fixed();
		axis.Saving();
		

	}

}
