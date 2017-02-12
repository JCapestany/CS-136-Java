/**
   Tests the bank account class
*/
public class BankAccountTester
{  
   public static void main(String[] args)
   {
	   //Balance = 100
	   BankAccount test = new BankAccount(100, 1.5);
	   //Balance = 105
	   test.deposit(5);
	   //Balance = 95
	   test.withdraw(10);
	   System.out.println(test.getBalance());
	   //Balance = 95
	   test.deductMonthlyCharge();
	   System.out.println(test.getBalance());
	   //Balance = 97
	   test.deposit(2);
	   //Balance = 103
	   test.deposit(6);
	   //Balance = 78
	   test.withdraw(25);
	   //Balance = 71
	   test.withdraw(7);
	   //Balance = 86
	   test.deposit(15);
	   System.out.println(test.getBalance());
	   //Balance = 83
	   test.deductMonthlyCharge();
	   System.out.println(test.getBalance());
   }
}