package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	String m = "";
	Random r = new Random();
	int r1 = r.nextInt(101);
	int r2 = r.nextInt(101);
	int r3 = r.nextInt(101);
	int r4 = r.nextInt(101);
	int r5 = r.nextInt(101);
	 for(int i = 0; i < 5; i++) {
		 
		 int e = r.nextInt(101);
		 m+=" "+e;
	 }
	System.out.println(m);
}
}
