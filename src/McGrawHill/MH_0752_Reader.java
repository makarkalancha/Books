package McGrawHill;

class MH_0752_Reader extends Thread{
	Calculator c;
//	private Object ñ;
	public MH_0752_Reader(Calculator calc){
		c = calc;
	}
	
	public void run(){
		synchronized(c){
			try{
				System.out.println("waiting c to finish...");
				c.wait();
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			System.out.println("total is: "+c.total);
		}
	}
	
	public static void main(String[] args) {
		Calculator b = new Calculator();
		new MH_0752_Reader(b).start();
		new MH_0752_Reader(b).start();
		new MH_0752_Reader(b).start();
		b.start();
		
		
	}

}

class Calculator extends Thread{
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
			this.notifyAll();
		}
	}
}
