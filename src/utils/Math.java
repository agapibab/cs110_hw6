package utils;

public class Math {
	public static int factorial(int n){
		if(n < 0) {
			return -1;
		}
		if (n == 0) {
			return 1;
		}
		return n*(factorial(n-1));		
	}
	
	public static int factorialLoop(int n){
		if(n < 0) {
			return -1;
		}
		if (n == 0) {
			return 1;
		}
		int p=1;
		for(int i = 1; i <= n; i++){
			p=p*i;
		}
		return p;
	}
}
