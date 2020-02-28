package 例题2_24;

public class AccontTester2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BankAccount2 bobsAccount,marysAccount,biffsAccount;
		bobsAccount=BankAccount2.example1();
		marysAccount=BankAccount2.example1();
		biffsAccount=BankAccount2.example2();
		marysAccount.setOwnerName("Mary");
		marysAccount.deposit(250);
		System.out.println(bobsAccount);
		System.out.println(marysAccount);
		System.out.println(biffsAccount);
	}

}
