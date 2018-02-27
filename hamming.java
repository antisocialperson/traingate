/**

ID: albert.28
TASK: hamming
LANG: JAVA

**/

import java.util.*;
import java.io.*;

// Tribute to illogical_21 for constantly posting "k" on Google Hangouts

public class hamming {	
	
	private static int kkkk, kkkkk, kkkkkk;
	
	public static void main(String[] args) throws IOException {
		
		Scanner k = new Scanner(new File("hamming.in"));
		PrintWriter kk = new PrintWriter(new File("hamming.out"));
		kkkk = k.nextInt();
		kkkkk = k.nextInt();
		kkkkkk = k.nextInt();
		k.close();
		ArrayList<Integer> kkkkkkk = new ArrayList<Integer>();
		kkkkkkk.add(0); // have to add 0
		for(int kkkkkkkk = 0; kkkkkkkk < Math.pow(2, kkkkk); kkkkkkkk++) {
			boolean kkkkkkkkk = true;
			for(int kkkkkkkkkk : kkkkkkk) {
				if(k(kkkkkkkk, kkkkkkkkkk) < kkkkkk)
					kkkkkkkkk = false;
			}
			if(kkkkkkkkk)
				kkkkkkk.add(kkkkkkkk);
			if(kkkkkkk.size() == kkkk)
				break;
		}
		for(int kkkkkkkk = 0; kkkkkkkk < kkkkkkk.size(); kkkkkkkk++) {
			if(kkkkkkkk % 10 == 9 || kkkkkkkk == kkkkkkk.size()-1)
				kk.println(kkkkkkk.get(kkkkkkkk));
			else
				kk.print(kkkkkkk.get(kkkkkkkk) + " ");
		}
		kk.flush();
		kk.close();
			
	}
	
	private static int k(int k, int kk) {
		String kkkkkkkk = Integer.toBinaryString(k);
		String kkkkkkk = Integer.toBinaryString(kk);
		// s1, s2 are binary representations
		while(kkkkkkkk.length() > kkkkkkk.length())
			kkkkkkk = "0" + kkkkkkk;
		while(kkkkkkkk.length() < kkkkkkk.length())
			kkkkkkkk = "0" + kkkkkkkk;
		int kkkkkkkkk = 0;
		for(int kkkkkkkkkk = 0; kkkkkkkkkk < kkkkkkkk.length(); kkkkkkkkkk++) {
			if(kkkkkkk.charAt(kkkkkkkkkk) != kkkkkkkk.charAt(kkkkkkkkkk))
				kkkkkkkkk++;
		}
		return kkkkkkkkk;
	}
	
}
