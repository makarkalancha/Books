package McGrawHill;

class bird {
	{System.out.print("b1 ");}
	bird(){
		System.out.print("b2c ");
	}
	static{System.out.print("b3st ");}
}
class eagle extends bird{
	static{System.out.print("e1st ");}
	{System.out.print("e2 ");}
	eagle(){
		System.out.print("e3c ");
	}
	{System.out.print("e4 ");}
	static{System.out.print("e5st ");}
}
//class x extends eagle{
class MH_0235_x {
	private String name;
	public static void main(String[] args) {
		System.out.print("pre ");
		new eagle();
		System.out.print("end ");
	}
}
