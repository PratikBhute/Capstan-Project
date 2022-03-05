package com.example.demo.model;

public class StringFindUniquehraactor {

	public static void main(String[] args) {
		
		String s="abcbfcdaf";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = 0; j < s.length(); j++) {
				
				if(s.charAt(i)!=s.charAt(j))
				{
					s1=s1+s.charAt(i);
				}
				
			}
			
		}
		for (int i = 0; i < s.length(); i++) {
			
			System.out.println(s1);
			
		}
		
		
		

	}

}
