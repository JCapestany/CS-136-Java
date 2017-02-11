public class Pet{
	
	//Initializing instance variables
	private String nickname;
	private String DOB;
	private String type;
	
	//This object can be initialized with or without a nickname input.
	public  Pet(){
		nickname = null;
		DOB = null;
		type = null;
	}
	
	public Pet(String Nickname){
		nickname = Nickname;
		DOB = null;
		type = null;
	}
	
	//Setters and getters for the fields of the class.
	public void setNickname(String Nickname){
		nickname = Nickname;
	}
	
	public void setDOB(String dob){
		DOB = dob;
	}
	
	public void setType(String Type){
		type = Type;
	}
	
	public String getNickname(){
		return nickname;
	}
	
	public String getDOB(){
		return DOB;
	}
	
	public String getType(){
		return type;
	}
}