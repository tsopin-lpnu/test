package test;

import java.io.*;
//import java.util.Random;

public class demo {
	
	static String Change(String s) {
		while (s.startsWith(" "))
		s = s.replaceFirst(" ", "");
		while (s.startsWith(" ", s.length() - 1))
		s = s.substring(0, s.length() - 1);
		for (int i = 0; i < s.length(); i++)
		if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
		s = s.substring(0, i) + s.substring(i + 1, s.length());
		i--;
		}
		return s;
		}

	public static void main(String[] args) throws IOException {
		//Random r = new Random();
		BufferedReader input = new BufferedReader(new InputStreamReader(
		System.in));
		String s;
		System.out.print("string = ");
		s = input.readLine();
		System.out.println("new string = |" + Change(s) + "|");

	}

}