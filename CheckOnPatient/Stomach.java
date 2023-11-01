public class Stomach extends Organ{
	public Stomach(String name, String medicalCondition){
		super(name, medicalCondition);
	}

	public void digest(){
		System.out.println("Digesting begin...");
	}
}