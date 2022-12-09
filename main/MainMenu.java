package main;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int a = 0;
		
		do {
			System.out.println("Digite sua Opção: ");
			a = entrada.nextInt();
		}while(a<1 || a>3);
		

	}

}
