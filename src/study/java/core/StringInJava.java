package study.java.core;

import java.util.Scanner;

public class StringInJava {
	public static void main(String[] args) {
		String str = "Manipulate a String";
		// length
		System.out.println(str.length());
		// concat()
		String str2 = " with concat()";
		System.out.println(str.concat(str2));
		// equal()
		String str3 = new String("Manipulate a String"); //Initialize values at a new memory cell
		System.out.println(str.equals(str3));
		System.out.println(str == str3);
		// charAt()
		System.out.println(str.charAt(1));
		// indexOf()
		System.out.println(str.indexOf("String"));
		// contains()
		System.out.println(str.contains("a"));
		// replace()
		System.out.println(str.replace("S","s"));
		// trim()
		String str4 = "  Test with trim function   ";
		System.out.println(str4.trim());
		// substring()
		System.out.println(str.substring(11,12).replace("a", "A"));
		// toLowerCase()
		System.out.println(str.toLowerCase());
		// toUpperCase()
		System.out.println(str.toUpperCase());
		
		// Palidrome
		System.out.println("Input your string: ");
		Scanner sc = new Scanner(System.in);
		String strPali = sc.nextLine();
		boolean flg = true;
		for(int i = 0; i< strPali.length(); i++) {
			char c1 = strPali.charAt(i);
			char c2 = strPali.charAt(strPali.length() - i - 1);
			if(c1 != c2) {
				System.out.print("This is not palidrome string!");
				flg = false;
				break;
			}				
		}
		System.out.print(flg ? "This is palidrome string" : "This is not palidrome string!");
		
	}
}

