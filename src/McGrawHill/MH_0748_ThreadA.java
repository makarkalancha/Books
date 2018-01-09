package McGrawHill;

public class MH_0748_ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized(b){
			try{
				System.out.println("waiting b to finish...");
				b.wait();
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			System.out.println(b.total);
		}
	}

}

class ThreadB extends Thread{
	int total;
	public void run(){
		synchronized(this){
			for(int i=0;i<100;i++){
				total+=i;
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){
					System.out.println(e.getMessage());
				}
			}
			this.notify();
		}
	}
}
