package Matematica;

public class Exercicio3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int multiplosTres = i % 3;
			if (multiplosTres == 0) {
				System.out.println(i);
			}
		}
	}
}
