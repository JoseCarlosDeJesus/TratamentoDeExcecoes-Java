package br.com.pc2.semana8;

public class ExemploRuntime2 {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 5);
		int y = (int) (Math.random() * 10);
		int[] z = new int[5];
		try {
			System.out.println("x/y = " + (y / x));
			System.out.println("y = " + y + "z[y] = " + z[y]);
		} catch (ArithmeticException e) {
			System.out.println("Problemas Aritméticos " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Problemas com Aray " + e.getMessage());
		}

	}

}
