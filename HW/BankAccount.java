/**
   A bank account has a balance that can be changed by
   deposits and withdrawals.
*/
public class BankAccount
{
   private double balance;
   private double fee;
   private int t_count = 0;

   /**
      Constructs a bank account with a zero balance and no fee.
   */
   public BankAccount()
   {
      balance = 0;
	  fee = 0;
   }
	
   /**
      Constructs a bank account with a given balance and given fee.
      @param initialBalance the initial balance
	  @param Fee the fee for transactions
   */
   public BankAccount(double initialBalance, double Fee)
   {
      balance = initialBalance;
	  fee = Fee;
   }
   
	/**
	  Sets the fee for transactions.
	  @param Fee the fee for transactions
	*/
   public void setFee(double Fee)
   {
	   fee = Fee;
   }
   
   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
	  t_count++;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {
      balance = balance - amount;
	  t_count++;
   }
   
   /**
      Incurs the fees acrued over the month with the first three being free.
   */
   public void deductMonthlyCharge()
   {
	   balance = balance - (Math.max(t_count, 3) - 3) * fee;
	   t_count = 0;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }


}