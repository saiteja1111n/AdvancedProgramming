import java.util.*;

public class program4 {

	public static void main(String[] args) {
		String s1="   a      ";
		char[] c = new char[s1.length()];
		for(int i = 0; i <s1.length(); i++)
			c[i] = s1.charAt(i);
		replace(c);
	}

	public static void replace(char[] c) {
		char[] ans=new char[c.length];
		int i = 0,len = c.length,j = 0,k = 0;
		while(i < len) {
			if(c[i]==32) {
				k = i;
				while((i < len)&&(c[i] == 32)) {
					i++;
				}
				if(i < len) {
					while(k<i) {
						ans[j++] = '%';
						ans[j++] = '2';
						ans[j++] = '0'; 
						k++;
					}
				}
			} else {
				ans[j] = c[i];
				i++;
				j++;
			}
		}
		for(i = 0;i < c.length; i++) 
			System.out.print(ans[i]);		
	}
}