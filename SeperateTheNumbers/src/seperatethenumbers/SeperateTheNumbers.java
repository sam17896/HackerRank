/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seperatethenumbers;

import java.util.Scanner;

/**
 *
 * @author Sohail Arshad
 */
public class SeperateTheNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int q = in.nextInt();
	for(int a0 = 0; a0 < q; a0++) {
		String s = in.next();
		boolean valid = false;
		long firstx = -1;
		// Try each possible starting number
		for (int i=1; i<=s.length()/2; ++i) {
			long x = Long.parseLong(s.substring(0,i));
			firstx = x;
		   // Build up sequence starting with this number
			String test = Long.toString(x);
			while (test.length() < s.length()) {
				test += Long.toString(++x);
			}
			// Compare to original
			if (test.equals(s)) {
				valid = true;
				break;
			}
		}
		System.out.println(valid ? "YES " + firstx : "NO");
	}
}
}
