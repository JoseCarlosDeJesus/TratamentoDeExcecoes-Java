package br.com.pc2.semana8;

public class ExemploRuntime {

	public static void main(String[] args) {
		int[] numeros = new int[3];
		
		/*
		 * try { System.out.println(numeros[4]); }catch (IndexOutOfBoundsException e) {
		 * System.out.println(e.getMessage()); }catch (Exception e) {
		 * System.out.println(e.getMessage()); }
		 */
		
		try {
			System.out.println(7/numeros[2]);
			System.out.println(numeros[4]);
		}catch (IndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(numeros[4]);
			System.out.println(7/numeros[2]);
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println();
		}

	}

}
