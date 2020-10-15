package model.services;

public class PaypalService implements OnlinePaymentService{
	private static final double PAYMENT_FEE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;
	@Override
	public double paymentFee(Double amount) {
		return amount = amount*PAYMENT_FEE;
	}

	@Override
	public double interest(Double amount, int mounths) {
		return amount * mounths * MONTHLY_INTEREST;
	} 

	
}
