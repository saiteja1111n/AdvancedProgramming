import java.util.*;

class program5 {
	public static void main(String[] args) {
		String s = "";
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		System.out.println(compressstring(s));
	}

	public static String compressstring(String c) {
		int i = 0,len = c.length(),k = 0;
		int ch;
		String s = "";
		while(i < len) {
			ch = c.charAt(i);
			s=s+(char)ch;
			k=1;
			i++;
			while((i < len)&&(c.charAt(i) == ch)) {
				k++;
				i++;
			} 
			s=s+k;
		}
		if(s.length() < len)
			return s;
		else
			return c;	
	}
}