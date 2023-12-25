package guess_game;
import java.util.Random;
public class Guessing_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Random r = new Random();
		System.out.println("Welcome to the Guessing game");
		int Randomnumber = r.nextInt(100)+1;
		System.out.println("Guess any number between 1 to 100");
		int number = sc.nextInt();
		if(number==Randomnumber) {
			System.out.println("Congrats You did correct guess");
		}
		else if(number>Randomnumber) {
			System.out.println("Your entered number is Greater than actual number which is \n"+Randomnumber);
		}
		else if(number<Randomnumber) {
			System.out.println("Your entered number is less than actual number which is \n"+Randomnumber);
		}
		else if(number>100 && number<0) {
			System.out.println("Invalid number");
		}
	}

}
