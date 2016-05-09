package FrontEnd;

import java.util.Scanner;

import BackEnd.User;

public class main {

	public static void main(String[] args) {
		User myUser = new User();
		helpMain hm = new helpMain(myUser);
		Scanner sc 	= new Scanner(System.in);	
		hm.startMessage();
		hm.selectCnfer();
		System.out.println("########## Menu ##########");
		System.out.println("1) Login");
		System.out.println("2) Register");
		System.out.print("\nPlease Select Number : ");
		int num = sc.nextInt();
		if(num == 1){
			hm.loginMethod();
		
		}
		else if (num == 2){
			hm.registerMethod();
		}
		
	}

}
