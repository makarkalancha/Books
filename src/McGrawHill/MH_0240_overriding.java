package McGrawHill;

public class MH_0240_overriding extends A_class{
//public class MH_0240_overriding{
	public void go(){
		System.out.println("MH_0240_overriding->GO");
	}
	
//	public void launchGo(){
//		go();
////		super.launchGo();
//	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A_class a = new A_class();
		MH_0240_overriding b = new MH_0240_overriding();
		A_class c = new MH_0240_overriding();
		
//		a.launchGo();
//		b.launchGo();
//		c.launchGo();
		
//		a.go();
		b.go();
//		c.go();
	}

}
