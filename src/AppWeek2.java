
public class AppWeek2 extends App {

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
		float friendsPerYear = totalFriends/ageInYears;
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
		
		
		
		// Week 2
		
		boolean isHotOutside = false;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
		boolean shouldBuyIceCream;
		boolean willGoSwimming;
		boolean isAGoodDay;
		boolean willBuyMilk;
		
		double costOfMilk = 9.99;
		double moneyInWallet = 50.00;
		int thirstLevel = 3;
		
		if (isHotOutside == true && hasMoneyInPocket == true) {
			shouldBuyIceCream = true;
		} else {
			shouldBuyIceCream = false;
		}
		
		if (isHotOutside && !isWeekday) {
			willGoSwimming = true;
		} else {
			willGoSwimming = false;
		}
		
		if (isHotOutside && hasMoneyInPocket && !isWeekday) {
			isAGoodDay = true;
		} else {
			isAGoodDay = false;
		}
		
		if (isHotOutside && thirstLevel >= 3) {
			willBuyMilk = true;
		} else {
			willBuyMilk = false;
		}
	}

}


