package looping_stmts;

public class if_else_example {

	public static void main(String[] args) {
		int acc_balance,withdrawal_amount;
		acc_balance=10000;
		withdrawal_amount=14000;
		if(acc_balance>withdrawal_amount)
		{
			System.out.println("Transaction is successful");
			acc_balance=acc_balance-withdrawal_amount;
			System.out.println("Avaliable Balance is "+acc_balance);
		}
		else
		{
			System.out.println("Sorry.. insufficient amount in your account");
		}

	}

}
