import java.util.*;

class program3 {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = "";
		Scanner in = new Scanner(System.in);
		s1 = in.nextLine();
		s2 = in.nextLine();
		if(check(s1, s2))
			System.out.println("one is a permutation of the other");
		else
			System.out.println("one is not a permutation of the other");
	}

	public static boolean check(String s1, String s2) {
		int[] a = new int[256];
		if(s1.length()!=s2.length())
			return false;
		for(int i = 0; i < s1.length(); i++) {
			a[s1.charAt(i)]++;
			a[s2.charAt(i)]++;
		}

		for(int i=0; i < a.length; i++) {
			if(a[i]==1)
				return false;
		}

		return true;
	}
}