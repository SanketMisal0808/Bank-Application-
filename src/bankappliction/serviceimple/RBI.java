package bankappliction.serviceimple;

import java.util.Scanner;

import com.bankapplication.Account;

import bankapplication.service.SBI;

public class RBI implements SBI {

	@Override
	public void registerAccount() {

		Scanner sc = new Scanner(System.in);
		Account ac = new Account();

	}

	@Override
	public void showAccountDeatils() {
		System.out.println("Enter your account number");

	}

	@Override
	public void showAccountBalance() {

	}

	@Override
	public void withdrawMoney() {

	}

}
