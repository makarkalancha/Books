package McGrawHill;

import java.io.*;
class Player { 
	Player() { 
		System.out.print("p"); 
	}
}
class MH_0514_CardPlayer extends Player implements Serializable {
	MH_0514_CardPlayer() { 
		System.out.print("c"); 
	}
	public static void main(String[] args) {
		MH_0514_CardPlayer c1 = new MH_0514_CardPlayer();
		try {
			FileOutputStream fos = new FileOutputStream("play.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(c1);
			os.close();
			System.out.println("hello");
			FileInputStream fis = new FileInputStream("play.txt");
			ObjectInputStream is = new ObjectInputStream(fis);
			MH_0514_CardPlayer c2 = (MH_0514_CardPlayer) is.readObject();
			is.close();
		} catch (Exception x ) { }
	}
}
