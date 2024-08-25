package bankappliction.controller;

//import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

import bankapplication.service.SBI;
import bankappliction.serviceimple.RBI;

public class AdminController {

	public static void main(String[] args) {
		System.out.println("***********WELCOME TO SBI BANK*******");

		// Menu

		Scanner sc = new Scanner(System.in);

		SBI rbi = new RBI();

		Boolean flag = true;

		while (flag) {
			System.out.println("-----------------------------");
			System.out.println("-----------------------------");
			System.out.println("1: CREATE BANK ACCOUNT       |");
			System.out.println("2: SHOW ACCOUNT DEATILS      |");
			System.out.println("3: SHOW ACCOUNT BALANCE      |");
			System.out.println("4:    WITHDRAW MONEY         |");
			System.out.println("5:       EXIT                |");
			System.out.println("6: --------------------------|");
			System.out.println("7:---------------------------|");
			System.out.println("ENTER YOUR CHOICE BETWEEN 1 TO 7 ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				rbi.registerAccount();
				break;
			}
			case 2: {
				rbi.showAccountBalance();
				break;
			}
			case 3: {
				rbi.showAccountDeatils();
				break;
			}
			case 4: {
				rbi.withdrawMoney();
				break;
			}
			case 5: {
				flag = false;
				break;
			}

			default:
				System.out.println("Enter wrong choice");
				break;

			}

		}

		System.out.println("thank you for Banking visit Again !!!@@@@ ");
		sc.close();

	}
}
