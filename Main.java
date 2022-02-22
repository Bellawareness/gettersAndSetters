
	class Main {
		  public static void main(String[] args) {

		    // 1. Create the getters and setters in CreditCard.java


		    // 2. Create a new credit card object
				CreditCard NewCC = new CreditCard();



		    // 3. Set the name to "Annabeth Chase"
		NewCC.setName("Annabeth Chase");

		    // 4. Set the number to "3242542123112744"
		NewCC.setcreditCardNumber ("3242542123112744");
		    
		    // 5. Set the expiration date to "01/25"
		NewCC.setexpirationDate("01/25");

		    // 6. set the CVV to "633"
		NewCC.setcvv(633);

		    // 7. Create a print out using getters that prints out the material in the following way: 
		    // Your card details:
		    // Cardholder Name: Peach Blossom
		    // Card Number: 3242342123112344
		    // Expiration Date: 06/24
		System.out.println("Your card details:" 
				+ "\nCardholder Name: "
				+ NewCC.getName() + "\nCard Number: "
				+ NewCC.getcreditCardNumber() + "\nExpiration Date: " + NewCC.getexpirationDate() + "\nCVV: " + NewCC.getcvv());


		  }
		}

