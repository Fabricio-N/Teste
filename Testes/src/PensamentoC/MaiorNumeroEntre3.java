package PensamentoC;

import java.util.Scanner;

public class MaiorNumeroEntre3 {

	public static void main(String[] args) {
		int N1;
		int N2;
		int N3;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o N1");
		N1 = ler.nextInt();

		System.out.println("Informe o N2");
		N2 = ler.nextInt();

		System.out.println("Informe o N3");
		N3 = ler.nextInt();

		if (N1 > N2 && N1 > N3) {
			System.out.println("O N1 � maior: " + N1);
			
		} else if (N2 > N1 && N2 > N3) {
			System.out.println("O N2 � o maior: " + N2);
			
		} else if (N3 > N1 && N3 > N2) {
			System.out.println("O N3 � o maior: " + N3);
			
		} else if (N1 == N2 && N1 < N3) {
			System.out.println("O N3 � o maior: " + N3);
			
		} else if (N1 == N3 && N1 < N2) {
			System.out.println("O N2 � o maior: " + N2);
			
		} else if (N2 == N3 && N2 < N1) {
			System.out.println("O N1 � maior: " + N1);
			
		} else if (N1 == N2 && N1 > N3) {
			System.out.println("O N1 e o N2 s�o o maior n�mero, pois os dois s�o iguais e o N3 menor que eles : " + N1 + " e " + N2);
			
		} else if (N1 == N3 && N1 > N2) {
			System.out.println("O N1 e o N3 s�o o maior n�mero, pois os dois s�o iguais e o N2 menor que eles : " + N1 + " e " + N3);
			
		} else if (N2 == N3 && N2 > N1) {
			System.out.println("O N2 e o N3 s�o o maior n�mero, pois os dois s�o iguais e o N1 menor que eles : " + N2 + " e " + N3);
			
		} else {
			System.out.println("Os tres n�meros s�o iguais: " + N1 + " e " + N2 + " e " + N3);
		}

	}

}
