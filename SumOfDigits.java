package recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(fun(123));
	}
	
	static int fun(int n) {
		int sum=0;
		if(n%10==n) {
			return n;
		}
		int temp=n%10;
		 sum =sum+temp;
		 return sum+fun(n/10);
	}
	
	static int sum(int n) {
		if(n==0) return 0;
		return (n%10)+sum(n/10);
	}

}
