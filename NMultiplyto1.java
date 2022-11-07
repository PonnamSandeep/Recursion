package recursion;

public class NMultiplyto1 {

	public static void main(String[] args) {
		System.out.println(fun(5));
	}
	
	static int fun(int n) {
		if(n<=1) {
			return 1;
		}
		return n*fun(n-1);
	}

}
