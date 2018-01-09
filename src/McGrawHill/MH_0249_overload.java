package McGrawHill;

public class MH_0249_overload {
	static int doX(Long l1, Long l2){return 1;}
	static int doX(long...x){return 2;}
	static int doX(Integer i1, Integer i2){return 3;}
	static int doX(Number n1, Number n2){return 4;}
	static void go(){
		short s = 7;
		System.out.println(doX(s,s)); // box short -> to Short and then widen Short -> to Number
		System.out.println(doX(7,7));
	}
	
	public static void main(String[] args) {
		go();
	}

}
