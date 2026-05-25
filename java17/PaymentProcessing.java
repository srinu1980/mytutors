package com.cts.java17;

//Record class for CreditCardPayment
record CreditCardPayment(String cardNumber) {}


//Record class for PayPalPayment
record PayPalPayment(String email) {}

public class PaymentProcessing {

  private static void processPayment(Object payment) 
  {
  
	  String result = switch (payment) 
			  {
	  
          case CreditCardPayment cc ->
               "Processing Credit Card payment with card number: " + cc.cardNumber();
      
          case PayPalPayment pp -> "Processing PayPal payment with email: " + pp.email();
          
          case Integer amount -> "Processing Cash payment of $" + amount;
          
          case null -> "Invalid payment method: null";
          
          default -> "Unknown payment method.";
      };
      System.out.println(result);
  }

  public static void main(String[] args) 
  {
  
	  processPayment(new CreditCardPayment("1234-5678-9876-5432"));
      
	  processPayment(new PayPalPayment("username@cognizant.com"));
      
	  processPayment(500); 
      
	  processPayment(null); 
  }
}

