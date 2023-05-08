/*
Author: tutorialpoint
Date: 8/5/2023
WebAddress: https://www.tutorialspoint.com/Generating-password-in-Java#
*/
import java.security.SecureRandom;
import java.util.Random;

public class PasswordGen{
	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		String password = genPass(length);
		String strength = PasswordCheck.checkPasswordStrength(password);
		System.out.println(genPass(length) + " Strength: " + strength);
	}

	private static String genPass(int length) {
		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String letters = "abcdefghijklmnopqrstuvwxzy";
		String special = "@#!$&?_%";
		String num = "1234567890";
		String combine = capLetters + letters;
		String combine1 = special + num;
		String combine2 = combine + combine1;
		Random random = new SecureRandom();
		StringBuilder passwordBuilder = new StringBuilder();
		if (length < 10) {
            for (int i = 0; i < 5; i++) {
                passwordBuilder.append(combine.charAt(random.nextInt(combine.length())));
            }
            for (int i = 5; i < length; i++) {
                passwordBuilder.append(combine1.charAt(random.nextInt(combine1.length())));
            }
        } else {
            for (int i = 0; i < length; i++) {
                passwordBuilder.append(combine2.charAt(random.nextInt(combine2.length())));
            }
        }
		return passwordBuilder.toString();
	}
}
