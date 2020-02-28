package ÀýÌâ2_24;

public class BankAccount2 {
	private static int LAST_ACCOUNT_NUMBER=0;
	private int accountNumber;
	private String ownerName;
	private float balance;
	Grade grade;
	public BankAccount2()
	{
		this("",0,Grade.General );
	}
	public BankAccount2(String initName)
	{
		this (initName,0,Grade.General);
	}
	public BankAccount2(String initName,float initBal,Grade g)
	{
		ownerName=initName;
		accountNumber=++LAST_ACCOUNT_NUMBER;
		balance=initBal;
		grade=g;
	}
	public static BankAccount2 example1()
	{
		BankAccount2 ba=new BankAccount2();
		ba.setOwnerName("LiHong");
		ba.deposit(1000);	
		return ba;
	}
	public static BankAccount2 example2()
	{
		BankAccount2 ba=new BankAccount2();
		ba.setOwnerName("ZhaoWei");
		ba.deposit(1000);
		ba.deposit(2000);
		return ba;
	}
	public static BankAccount2 emptyAcountExample()
	{
		BankAccount2 ba=new BankAccount2();
		ba.setOwnerName("HeLi");
		return ba;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public float deposit(float anAmount)
	{
		balance+=anAmount;
		return balance;
	}
	public float withdraw(float anAmount)
	{
		if(anAmount<=balance)
		{
			balance-=anAmount;
		}
		return anAmount;
	}
	public String toString()
	{
		return (grade+"account #"+new java.text.DecimalFormat("000000").format(accountNumber)
				+"with balance"+new java.text.DecimalFormat("$0.00").format(balance));
	}
}









