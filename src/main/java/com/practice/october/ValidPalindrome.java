package com.practice.october;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "race a    car";
		
		String words[]=s.trim().split("\\s+");
        StringBuilder output=new StringBuilder("");
        for(int i=words.length-1;i>=0;i--){
            output.append(words[i]);
           if(i!=0) 
            output.append(" ");
        }
		System.out.println(output);
	}

	private static boolean isValid(String s) {
		if (s.isEmpty()) {
			return true;
		}
		s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		int start = 0, end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			
		}
		return true;

	}

}
