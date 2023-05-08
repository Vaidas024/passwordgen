/*
Author: tutorialpoint
Date: 8/5/2023
WebAddress: https://www.tutorialspoint.com/Generating-password-in-Java#
*/
import java.util.Random;

public class Tester{
	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		System.out.println(genPass(length));
	}

	private static char[] genPass(int length) {
		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String letters = "abcdefghijklmnopqrstuvwxzy";
		String special = "@#!$&?";
		String num = "1234567890";
		String combine = capLetters + letters;
		String combine1 = special + num;
		String combine2 = combine + combine1;
		Random random = new Random();
		char[] password = new char[length];
		if(length < 10) {
			for(int i = 0; i < 5; i++) {
				password[i] = combine.charAt(random.nextInt(combine.length()));
			}
			for(int i = 5; i < length; i++) {
				password[i] = combine1.charAt(random.nextInt(combine1.length()));
			}
		}
		else {
			for(int i = 0; i < length; i++) {
				password[i] = combine2.charAt(random.nextInt(combine2.length()));
			}
		}
		return password;
	}
}
