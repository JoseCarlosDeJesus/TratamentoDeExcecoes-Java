package br.com.pc2.semana8;

public class UsandoFinally {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		try {
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally executado");
		}

	}

}
