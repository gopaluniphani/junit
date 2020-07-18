package com.rvr.junit;

import java.util.Scanner;

public class App {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string (length > 2): ");
		String input = scanner.next();
		input = input.toUpperCase();
		
		char firstCharacter = input.charAt(0);
		if(firstCharacter == 'A') {
			input = input.substring(1);
			firstCharacter = input.charAt(0);
			if(firstCharacter == 'A' ) {
				input = input.substring(1);
			}
		} else {
			char secondCharacter = input.charAt(1);
			if(secondCharacter == 'A') {
				input = input.substring(0, 1) + input.substring(2);
			}
		}
		
		System.out.println("Output: " + input);
		scanner.close();
	}
}