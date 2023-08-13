package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountSubStringInCount {
		
	
	public static void main (String [] args) {
	
		String s="aabbccbbcccaabb";
		String subString="";
		
		List<String> strings=new ArrayList<>();
			int i=0;
			
			char c=s.charAt(i);
			subString=subString+c;
			i++;
			while(i<=s.length()-1) {
			
			if(s.charAt(i)==c) {
				subString=subString+c;
				i++;
			}
			else {
				strings.add(subString);
				subString="";			
				c=s.charAt(i);
				subString=subString+c;
				i++;
				
			}
			
			}
			strings.add(subString);
			System.out.println(strings);
strings.stream().collect(Collectors.groupingBy(st->st,Collectors.counting())).entrySet().forEach(e->System.out.println(e.getKey()+ " "+e.getValue()));
	}
	
}
