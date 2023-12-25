package ATMInterface;
import java.util.Scanner;

class ATM{
	float Balance = 50000;
	int pin=4578;
	
	public void checkpin() {
		System.out.println("Enter your Pin: ");
		Scanner sc = new Scanner(System.in);
		int PIN =sc.nextInt();
		if (PIN==4578) {
			menu();
		}
		else {
			System.out.println("Incorrect pin ");
			checkpin();
		}
		
	}
	
	public void menu() {
		System.out.println("Choose any one: ");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdrawl money");
		System.out.println("3. Deposit money");
		System.out.println("4. Exit");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		
		if(opt == 1) {
			Checkbalance();
		}
		else if(opt == 2) {
			Withdrawlmoney();
		}
		else if(opt == 3) {
			Depositmoney();
		}
		else if(opt == 4) {
			checkpin();
		}
		else {
			System.out.println("Choose any valid operation");
		}
	}
	
	public void Checkbalance() {
		System.out.println("A/c Balance :"+Balance);
		checkpin();
	}
	public void Withdrawlmoney() {
		System.out.println("Enter the Amount: ");
		Scanner sc = new Scanner(System.in);
		float Amt =sc.nextFloat();
		if(Amt > Balance) {
			System.out.println("Insuficient Balance");
		}
		else {
			//Money withdrawal successfully from ATM
			float mny = (Balance - Amt);
			System.out.println("A/c Balance After withdraw money: "+mny);
		}
		checkpin();
	}
	public void Depositmoney() {
		System.out.println("Enter the amount: ");
		Scanner sc = new Scanner(System.in);
		float Damt = sc.nextFloat();
		//Money deposited successfully
		float Dmny = Balance + Damt;
		System.out.println("A/c Balance After desposited money: "+Dmny);
		checkpin();
	}
	
}


public class ATMInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ATM obj = new ATM();
		 obj.checkpin();
	}

}
