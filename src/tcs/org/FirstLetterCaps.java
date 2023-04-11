package tcs.org;

public class FirstLetterCaps {
public static void main(String[] args) {
	String s="welcome to class";
	
	String[] split = s.split(" ");
	
	for (String a : split) {
	char charAt = a.charAt(0);
	char upperCase = Character.toUpperCase(charAt);
	String substring = a.substring(1);
	String output=upperCase+substring+" ";
	System.out.print(output);
	}
}
}
