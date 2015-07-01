import java.util.*;

class program2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String original = in.nextLine();
		String result = "";
		for(int i=0;i<original.length();i++)
			result=original.charAt(i)+result;
		System.out.println(result);
	}
}