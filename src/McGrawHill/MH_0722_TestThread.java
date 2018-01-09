package McGrawHill;


class Threadable extends Thread{
	public void run(){
		for(int i=1;i<101;i++){
			if(i%10==0){
				System.out.println(i);
			}
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
		}
	}
}

public class MH_0722_TestThread {
	public static void main(String[] args) {
		Threadable t = new Threadable();
		t.setName("mak");
		t.start();
	}
}
