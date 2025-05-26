package compiletime;

public class PaymentGateway {
	public void pay(int amount) {
		System.out.println("Payment Done by Cash On Delivery");
	}
	public void pay(int amount, int cardNumber) {
		System.out.println("Payment Done by Card");
	}
	public void pay(int amount, String upiId) {
		System.out.println("Payment Done by Wallet");
	}
	public void pay(int amount, int accountNumber, int CVV) {
		System.out.println("Payment Done by Net Banking");
	}
	public void pay(int amount, int pin, String upiId) {
		System.out.println("Payment Done by UPI");
	}
}
