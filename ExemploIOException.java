package br.com.pc2.semana8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploIOException {

	public static void main(String[] args) {

		BufferedReader in;
		String str;
		try {
			in = new BufferedReader(new FileReader("teste.txt"));
			while (((str = in.readLine()) != null)) {
				System.out.println(str);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
