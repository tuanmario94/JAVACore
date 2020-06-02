package study.java.core;

import java.util.Scanner;

public class ArrayInJava {
	public static void main(String[] args) {
		String[] strArr;
		int[] intArr = {1,2,3,4,5};
		
		System.out.print(intArr[0]);
		
		System.out.print("Please input length of array!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Please input the "+ i +" element:");
			num[i] = sc.nextInt();
		}
		// bubble sort
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i -1; j++) {
				if(num[j] < num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}			
		}
		for(int i = 0; i < n; i++) {
			System.out.print(num[i]+" ");
		}
		
		
		// Search 
		boolean isContains = false;
		System.out.println("Please input your number want to search.");
		int number = sc.nextInt();
		for(int i = 0; i < n; i++) {
			if(num[i] == number) {
				System.out.println("Position: "+i);
				isContains = true;
				break;
			}
		}
		if(!isContains) {
			System.out.println("Does not exist in array!");
		}
	}
}
