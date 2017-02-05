import java.util.Scanner;

public class PetCreator{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		//For pet 1 the object is initiallized with the nickname as the input.
		System.out.println("What is the nickname of your first pet? ");
		String input = in.nextLine();
		Pet pet1 = new Pet(input);
		System.out.println("What is the DOB of your first pet? ");
		input = in.nextLine();
		pet1.setDOB(input);
		System.out.println("What kind of animal is your first pet? ");
		input = in.nextLine();
		pet1.setType(input);
		
		//For pet 2 the object is initiallized, then the nickname is set.
		Pet pet2 = new Pet();
		
		System.out.println("What is the nickname of your second pet? ");
		input = in.nextLine();
		pet2.setNickname(input);
		System.out.println("What is the DOB of your second pet? ");
		input = in.nextLine();
		pet2.setDOB(input);
		System.out.println("What kind of animal is your second pet? ");
		input = in.nextLine();
		pet2.setType(input);
		
		//Displays the pets' info back to the user.
		System.out.printf("\n%s is a %s that was born on %s.", pet1.getNickname(),pet1.getType(),pet1.getDOB());
		System.out.printf("\n%s is a %s that was born on %s.", pet2.getNickname(),pet2.getType(),pet2.getDOB());
	}
}