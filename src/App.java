
public class App {

	public static void main(String[] args) {
		float itemPrice = 24.99f;
		float walletBalance = 50.00f;
		int totalFriends = 100;
		int ageInYears = 31;
		String firstName = "Robert";
		String lastName = "Ochi";
		char middleInitial = 'A';
		
		// wallet after purchase
		if (itemPrice <= (walletBalance - 20.00)) {
			float moneyAfterPurchase = walletBalance - itemPrice;
			System.out.println("After purchasing the item, " + "you will have $" + moneyAfterPurchase);
		}
		
		// number of friends per year
		float friendsPerYear = ageInYears*totalFriends;
		System.out.println("Friends per year rate: " + friendsPerYear + " friends per year.");
		
		// full name
		String fullName = firstName + " " + middleInitial + " " + lastName;
		System.out.println("Full Name: " + fullName);
		
		System.out.println("Other Variables: ");
		System.out.println(itemPrice);
		System.out.println(walletBalance);
		System.out.println(totalFriends);
		System.out.println(ageInYears);
		System.out.println(firstName);
		System.out.println(middleInitial);
		System.out.println(lastName);
	}

}


