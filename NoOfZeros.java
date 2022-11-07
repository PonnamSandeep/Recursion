package recursion;

public class NoOfZeros {

	public static void main(String[] args) {
		sum(10204);
		System.out.println(count);
	}
	static int count=0;
	static int sum(int n) {
		if(n<=1) {
			return count;
		}
		if(n%10==0) {
			count++;
		}
		return sum(n/10);
	}
	
	//another method
	static int count(int n) {
		return helper(n,0);
	}
	static int helper(int n,int c) {
		if(n==0) {
			return c;
		}
		int rem=n%10;
		if(rem==0) {
			return helper(n/10,c+1);
		}
		return helper(n/10,c);
	}

}
