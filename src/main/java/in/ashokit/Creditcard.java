package in.ashokit;

public class Creditcard implements Ipayment{

	public Creditcard()
	{
		System.out.println("credit-constructor");
	}
	@Override
	public boolean paybill(double money) {
	System.out.println("credit is processing");
		return true;
	}
	

}
