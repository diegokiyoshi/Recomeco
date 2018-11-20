package Matematica;


public class Fibonacci {
	public static void main(String[] args) {
		CalculaFibonacci num = new CalculaFibonacci();
		
		for (int i = 0; i <= 20; i++) {
			if(num.calcFibo(i) > 100) {
				break;
			}
			System.out.println(num.calcFibo(i));
		}
	}
	
/*	static int calculaFibonacci(int n) {
		if(n < 2) {
			return n;
		} else {
			return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
		}
	}*/
}
