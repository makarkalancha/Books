package McGrawHill;

class MH_0738_TestThread {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("A");
//		int str1 = 100;
		Threadable_1 a = new Threadable_1(str1);
		Threadable_1 b = new Threadable_1(str1);
		Threadable_1 c = new Threadable_1(str1);
		a.setName("a");
		b.setName("b");
		c.setName("c");
		a.start();
		b.start();
		c.start();
	}
}

class Threadable_1 extends Thread{
	private StringBuffer str_name;
//	private int str_name;
	
	Threadable_1(StringBuffer str){
//	Threadable_1(int str){
		super();
		str_name = str;
	}
	
//	private synchronized StringBuffer new_str(StringBuffer str){
	private synchronized void new_str(StringBuffer str){
		for(int i=0;i<10;i++){
			int ind = str.indexOf(" ");
			if(ind != -1){
				str.delete(ind, str.length());
			}
			str_name.append(" "+i);
			System.out.println(str_name+": "+this.getName());
		}
//		return str;
	}
	
	@Override
	public void run() {
//	public synchronized void run() {
//		synchronized (this) {
//			for(int i=0;i<30;i++){
//				System.out.println(str_name+" "+i+": "+this.getName());
				new_str(str_name);
//				str_name.append(" "+i);
//				str_name++;
//				System.out.println(str_name+": "+this.getName());
//				try{
//					Thread.sleep(1000);
//				}catch(InterruptedException e){
//					e.printStackTrace();
//				}
//			}
//		}
	}
	
}
