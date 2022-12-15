package main;

import java.util.Scanner;

import bo.BO;
import main.LicitacaoMainInsercao;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int idLicitacao;
		int idLicitante;
		int idEmpresa;
		boolean sit = true;
		
		while(sit==true){
			System.out.println("informe o id da licitação: ");
			idLicitacao = entrada.nextInt();
			System.out.println("Informe o id do licitante: ");
			idLicitante = entrada.nextInt();
			System.out.println("Informe os ids das empresas participantes: ");
			idEmpresa = entrada.nextInt();
			
			
			
		}
		

	}

}
