import java.util.*;

class GuessingGame{
	public static void main(String[] args){
		System.out.println("Welcom to GuessingGame!");

		Scanner scannerName = new Scanner(System.in);
		System.out.print("Enter username: ");

		String username = scannerName.nextLine();
		System.out.println("Hello " + username);

		Scanner scannerYesOrNo = new Scanner(System.in);
		System.out.print("Are you ready to start? (Y/N): ");

		String YesOrNo = scannerYesOrNo.nextLine();
		System.out.println(YesOrNo);

		if (YesOrNo.equals("Y")){
			Random randomNumber = new Random();
			int guessingNumber = randomNumber.nextInt(10);
			int count = 0;


			for (int i = 0; i < 5; i++){
				Scanner scannerUserInputNumber = new Scanner(System.in);
				System.out.print("Enter your number: ");

				int userInputNumber = scannerUserInputNumber.nextInt();

				if (userInputNumber > guessingNumber){
					System.out.println("Guess lower");
				} else if (userInputNumber < guessingNumber){
					System.out.println("Guess higher");
				} else{
					System.out.println("You got it!");
					break;
				}

				count++;
			}
			if (count == 5){
				System.out.println("Game over");
			}
		}
	}
}