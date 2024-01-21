//class cs03B
//Eric Ayala

import java.util.Scanner;

public class CardReading {

	public static void main(String[] argu) {
		Scanner usersInput = new Scanner(System.in);
		int userNumber;
		System.out.println("Enter a number from 1-52");
		userNumber = usersInput.nextInt();//takes in user input
		String card=" ";
		if(userNumber>=1 && userNumber <=13) {//checks for all cards that are Clubs
			switch(userNumber) {
			case 1:
				card = "Ace of Clubs";//updates the cards information according the number it is and also card type
				break;
			case 2:
				card = "2 of Clubs";
				break;
			case 3:
				card = "3 of Clubs";
				break;
			case 4:
				card = "4 of Clubs";
				break;
			case 5:
				card = "5 of Clubs";
				break;
			case 6:
				card = "6 of Clubs";
				break;
			case 7:
				card = "7 of Clubs";
				break;
			case 8:
				card = "8 of Clubs";
				break;
			case 9:
				card = "9 of Clubs";
				break;
			case 10:
				card = "10 of Clubs";
				break;
			case 11:
				card = "Jack of Clubs";
				break;
			case 12:
				card = "Queen of Clubs";
				break;
			case 13:
				card = "King of Clubs";
				break;
			
				
			}
		}else if(userNumber>=14 && userNumber<=26) {//checks for all cards that are Diamonds
			userNumber = userNumber-13;
			switch(userNumber) {
			case 1:
				card = "Ace of Diamonds";
				break;
			case 2:
				card = "2 of Diamonds";
				break;
			case 3:
				card = "3 of Diamonds";
				break;
			case 4:
				card = "4 of Diamonds";
				break;
			case 5:
				card = "5 of Diamonds";
				break;
			case 6:
				card = "6 of Diamonds";
				break;
			case 7:
				card = "7 of Diamonds";
				break;
			case 8:
				card = "8 of Diamonds";
				break;
			case 9:
				card = "9 of Diamonds";
				break;
			case 10:
				card = "10 of Diamonds";
				break;
			case 11:
				card = "Jack of Diamonds";
				break;
			case 12:
				card = "Queen of Diamonds";
				break;
			case 13:
				card = "King of Diamonds";
				break;
			
				
			}
		}else if(userNumber>=27 && userNumber<=39) {//checks for all cards that are Hearts
			userNumber = userNumber-26;
			switch(userNumber) {
			case 1:
				card = "Ace of Hearts";
				break;
			case 2:
				card = "2 of Hearts";
				break;
			case 3:
				card = "3 of Hearts";
				break;
			case 4:
				card = "4 of Hearts";
				break;
			case 5:
				card = "5 of Hearts";
				break;
			case 6:
				card = "6 of Hearts";
				break;
			case 7:
				card = "7 of Hearts";
				break;
			case 8:
				card = "8 of Hearts";
				break;
			case 9:
				card = "9 of Hearts";
				break;
			case 10:
				card = "10 of Hearts";
				break;
			case 11:
				card = "Jack of Hearts";
				break;
			case 12:
				card = "Queen of Hearts";
				break;
			case 13:
				card = "King of Hearts";
				break;
			
				
			}
		}else if(userNumber>=40 && userNumber<=52) {//checks for all cards that are Spades
			userNumber = userNumber-39;//subtracts the rest of cards in order to get the number and face cards 
			switch(userNumber) {
			case 1:
				card = "Ace of Spades";
				break;
			case 2:
				card = "2 of Spades";
				break;
			case 3:
				card = "3 of Spades";
				break;
			case 4:
				card = "4 of Spades";
				break;
			case 5:
				card = "5 of Spades";
				break;
			case 6:
				card = "6 of Spades";
				break;
			case 7:
				card = "7 of Spades";
				break;
			case 8:
				card = "8 of Spades";
				break;
			case 9:
				card = "9 of Spades";
				break;
			case 10:
				card = "10 of Spades";
				break;
			case 11:
				card = "Jack of Spades";
				break;
			case 12:
				card = "Queen of Spades";
				break;
			case 13:
				card = "King of Spades";
				break;
			
				
			}
		}
		
		System.out.println("The card you picked is "+ card);
		usersInput.close();
	}

}
