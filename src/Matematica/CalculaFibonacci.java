package Matematica;

public class CalculaFibonacci {
	int calcFibo(int n) {
		
		if(n < 2) {
			return n;
		} else {
			return calcFibo(n - 1) + calcFibo(n - 2);
		}
		
	}
}
