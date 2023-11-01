import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Patient patient = new Patient("Tom", 25);
		Eye leftEye = new Eye("Left Eye", "Short sighted", "Blue");
		Eye rightEye = new Eye("Right Eye", "Normal", "Blue");
		Heart heart = new Heart("Heart", "Normal", 65);
		Stomach stomach = new Stomach("Stomach", "PUD");
		Skin skin = new Skin("Skin", "Burned");

		System.out.println("Name: " + patient.getName());
		System.out.println("Age: " + patient.getAge());

		int option = 0;
		while (option != 6 ){
			System.out.println("Choose an Organ:");
			System.out.println("\t" + "1. Left Eye");
			System.out.println("\t" + "2. Right Eye");
			System.out.println("\t" + "3. Heart");
			System.out.println("\t" + "4. Stomach");
			System.out.println("\t" + "5. Skin");
			System.out.println("\t" + "6. Quit");

			Scanner scan = new Scanner(System.in);

			option = scan.nextInt();

			switch (option){
				case 1:
					System.out.println("Name: " + leftEye.getName());
					System.out.println("Medical Conditon: " + leftEye.getMedicalCondition());
					System.out.println("Color: " + leftEye.getColor());
					System.out.println("\t" + "1. Close the Eye");
					int opt1 = scan.nextInt();
					if (opt1 == 1){
						leftEye.closeLeftEye();
					}
					break;

			   case 2:
					System.out.println("Name: " + rightEye.getName());
					System.out.println("Medical Conditon: " + rightEye.getMedicalCondition());
					System.out.println("Color: " + rightEye.getColor());
					System.out.println("\t" + "1. Close the Eye");
					int opt2 = scan.nextInt();
					if (opt2 == 1){
						rightEye.closeRightEye();
					}
					break;
			   case 3:
					System.out.println("Name: " + heart.getName());
					System.out.println("Medical Conditon: " + heart.getMedicalCondition());
					System.out.println("Heart Rate: " + heart.getRate());
					System.out.println("\t" + "1. Change the heart rate");
					int opt3 = scan.nextInt();
					if (opt3 == 1){
						System.out.println("Enter the new heart rate: ");
						int newRate = scan.nextInt();
						heart.setRate(newRate);
						System.out.println("Heart rate changed to: " + heart.getRate());
					}
					break;
			   case 4:
					System.out.println("Name: " + stomach.getName());
					System.out.println("Medical Conditon: " + stomach.getMedicalCondition());
					System.out.println("Need to be fed");
					System.out.println("\t" + "1. Digest");
					int opt4 = scan.nextInt();
					if (opt4 == 1){
						stomach.digest();
					}
					break;
			   case 5:
					System.out.println("Name: " + skin.getName());
					System.out.println("Medical Conditon: " + skin.getMedicalCondition());
					break;
			}
		}
	}
}