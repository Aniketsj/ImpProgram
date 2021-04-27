package com.String;

public class ReverseWordWithoutSplit {

	public static void main(String[] args) {
		String str = "Aniket jadhav automation";
		char[] ch = str.toCharArray();
		int count = 0;
		int next = 0;
		String s1 = "";
		String s2 = "";
		String s3 = "";

		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == ' ') {
				count++;
				if (count >= 1) {
					s1 = str.substring(next, i);
					s1 = revString(s1);
					next = i + 1;
					s2 = s2 + s1 +" ";
				}
			}
		}
		s3 = str.substring(next, str.length());
		s3 = revString(s3);
		String revStringIs = s2 + s3;
		System.out.println(revStringIs);

	}

	public static String revString(String str) {
		String revv = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revv = revv + str.charAt(i);
		}
		return revv;
	}

}
