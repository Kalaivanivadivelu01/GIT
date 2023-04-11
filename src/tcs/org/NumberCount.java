package tcs.org;

public class NumberCount {
		public static void main(String[] args) {
			
			int num =123456;
			int count=0;
			while (num>0) {
				int n=num%10;
				num/=10;
				count=count+1;
				
			}
			
			System.out.println(count);
			
		}
		}

