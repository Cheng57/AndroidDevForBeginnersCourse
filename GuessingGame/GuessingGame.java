import java.util.*;

public class GuessingGame{
	public static void main(String[] args){
		System.out.println("Welcome!");

		//only create a single 'Scanner' object and reuse it.
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name:");
		String userName = scanner.nextLine();
		System.out.println("Hello " + userName);

		String yesOrNo = "n";

		//use equals method to compare the contents of the strings instead of "=="
		//because '==' checks for reference equality, not content equality.
		while (!yesOrNo.equals("y")){
			System.out.println("Are you ready? y/n");
			yesOrNo = scanner.nextLine().toLowerCase();
			if (!yesOrNo.equals("n") && !yesOrNo.equals("y")){
				System.out.println("Invalid input");
			}
		}
		if (yesOrNo.equals("y")){
			Random rand = new Random();
			int randNum = rand.nextInt(10) + 1;

			int counter = 0;
			while (counter < 5){
				System.out.println("Please enter a guessing number between 1 and 10:");
				int userNum = scanner.nextInt();

				if (userNum > randNum && counter < 4){
					System.out.println("Guess a lower number");
				}

				if(userNum < randNum && counter < 4){
					System.out.println("Guess a higher number");
				}

				if (userNum == randNum){
					System.out.println("Congrats! You got it.");
					break;
				}

				counter++;
			}

			if (counter == 5) {
				System.out.println("Game Over");
				System.out.println("The guessing number is " + randNum);
			}
		}
		scanner.close();
	}
}