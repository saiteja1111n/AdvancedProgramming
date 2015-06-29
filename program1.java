import java.util.*;
public class program1 {

	public static void main(String[] args) {
		String s = "";
		Scanner in = new Scanner(System.in);
		s = in.nextLine();

		if(check(s))
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
	}

	public static boolean check(String s) {
		boolean[] a = new boolean[300];
		for(int i = 0; i < s.length(); i++) {
			if(!a[s.charAt(i)])
				a[s.charAt(i)]=true;
			else 
				return false;
		}
		return true;
	}

}