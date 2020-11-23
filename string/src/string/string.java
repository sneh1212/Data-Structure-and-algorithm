/**
 * // A Program to check if strings are rotations of each other or not
 * 
 * Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
 * 
(e g given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)* 
 * 
 */
package string;

import java.util.*;
public class string {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String st1=s.next();
		String st2=s.next();
		System.out.println(st1.length()==st2.length()&&(st1+st1).indexOf(st2)!=-1);
		
		


	}



}
