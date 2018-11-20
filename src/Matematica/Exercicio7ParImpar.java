package Matematica;

public class Exercicio7ParImpar {
	public static void main(String[] args) {
		int x = 13;
		for(int i = x;  i > 1; i --) {
			if (x % 2 == 0) {
				x = x / 2;
				if(x == 1) {
					break;
				}
			}else {
				x = 3 * x + 1;
				if(x == 1) {
					break;
				}
			}
			
			System.out.println(x);
		}
	}

}
