package in.ashokit;

public class Debitcard implements Ipayment{

	public Debitcard()
	{
		System.out.println("debit-constructor");
	}
	@Override
	public boolean paybill(double money) {
	System.out.println("debit is processing");
		return true;
	}

}
