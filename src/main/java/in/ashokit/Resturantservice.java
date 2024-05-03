package in.ashokit;

public class Resturantservice 
{
	private Ipayment payment;
	
	
	public Resturantservice()
	{
		System.out.println("resturant -constructor");
		
	}
	public void setPayment(Ipayment pay)
	{
		System.out.println("setter constructor");
		this.payment=pay;
	}
	public void billpayment(double money)
	{
		boolean status = payment.paybill(money);
		if(status)
		{
			System.out.println("payment is success");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
