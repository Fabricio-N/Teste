package desa;

import java.util.Scanner;

public class Imprimir3NumDecrescente {

	public static void main(String[] args) {
		int N1;
		int N2;
		int N3;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro número");
		N1 = ler.nextInt();

		System.out.println("Digite o segundo número");
		N2 = ler.nextInt();

		System.out.println("Digite o terceiro número");
		N3 = ler.nextInt();

		if (N1 > N2 && N2 > N3) {
			System.out.println("Ordem decrescente: ");
			System.out.println(N1 + ", " + N2 + ", " + N3);

		} else if (N1 > N3 && N3 > N2) {
			System.out.println("Ordem decrescente: ");
			System.out.println(N1 + ", " + N3 + ", " + N2);

		} else if (N2 > N1 && N1 > N3) {
			System.out.println("Ordem decrescente: ");
			System.out.println(N2 + ", " + N1 + ", " + N3);

		} else if (N2 > N3 && N3 > N1) {
			System.out.println("Ordem decrescente: ");
			System.out.println(N2 + ", " + N3 + ", " + N1);

		} else if (N3 > N1 && N1 > N2) {
			System.out.println("Ordem decrescente: ");
			System.out.println(N3 + ", " + N1 + ", " + N2);

		} else if (N3 > N2 && N2 > N1) {
			System.out.println("Ordem decrescente: ");
			System.out.println(N3 + ", " + N2 + ", " + N1);
		}

	}

}
