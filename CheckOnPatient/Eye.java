public class Eye extends Organ{
	private String color;

	public Eye(String name, String medicalCondition, String color){
		super(name, medicalCondition);
		this.color = color;
	}

	public String getColor(){
		return this.color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public void closeLeftEye(){
		System.out.println("Left Eye Closed");
	}

	public void closeRightEye(){
		System.out.println("Right Eye Closed");
	}
}