package McGrawHill;

public class MH_0730_AccountTest implements Runnable{
//	private Account acc;
	private Account acc = new Account();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MH_0730_AccountTest r = new MH_0730_AccountTest();
		Thread fred = new Thread(r);
		Thread lucy = new Thread(r);
		fred.setName("Fred");
		lucy.setName("Lucy");
		fred.start();
		lucy.start();
//		fred.start();
	}

	public void run(){
//		acc = new Account();
		for(int i = 0;i<5;i++){
			makeWithdrawal(10);
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(acc.getBalance() < 0){
				System.out.println("Account is overdrawn!");
//				break;
			}
		}
	}
	
//	private void makeWithdrawal(int amt){
	private synchronized void makeWithdrawal(int amt){
		if(acc.getBalance()>=amt){
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acc.setBalance(amt);
			System.out.println("+"+Thread.currentThread().getName()+" completes withdrawal");
		}else{
			System.out.println(Thread.currentThread().getName()+": Not enough money for me!!!");
		}
	}
	
}


class Account{
	private int balance = 50;
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int amt){
		balance -= amt;
	}
}