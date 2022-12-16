package main;

import java.util.ArrayList;
import java.util.List;

import com.Empresa;
import com.Licitacao;
import com.Participante;
import bo.ParticipanteBO;

public class TudoParticipante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teste Inserir
				ParticipanteBO BO = new ParticipanteBO();
				
				// passar somente o id de um Licitante já cadastrado para Licitante
				Licitacao licitacao = new Licitacao(2);
				Empresa empresa = new Empresa(2);
				
				Participante participante = new Participante(licitacao, empresa, 850, true);
				if (BO.inserir(participante))
					System.out.println("Participante inserido com Sucesso");
				else 
					System.out.println("Erro ao Inserir");
				
				empresa = new Empresa(4);
				participante = new Participante(licitacao, empresa, 850, true);
				if (BO.inserir(participante))
					System.out.println("Participante inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				empresa = new Empresa(5);
				participante = new Participante(licitacao, empresa, 780, false);
				if (BO.inserir(participante))
					System.out.println("Participante inserido com Sucesso");
				else
					System.out.println("Erro ao Inserir");
				
				licitacao = new Licitacao(3);
				empresa = new Empresa(2);				
				participante = new Participante(licitacao, empresa, 850, true);
				if (BO.inserir(participante))
					System.out.println("Participante inserido com Sucesso");
				else 
					System.out.println("Erro ao Inserir");
				
				licitacao = new Licitacao(2);
				empresa = new Empresa(1);				
				participante = new Participante(licitacao, empresa, 850, false);
				if (BO.inserir(participante))
					System.out.println("Participante inserido com Sucesso");
				else 
					System.out.println("Erro ao Inserir");
				
				
				//Existe
				System.out.println("");
				System.out.println("Existe: idLicitacao=2 e idEmpresa=2");
				// necessario passar Id da licitacao e o id da empresa, pois no banco é chave primaria composta			
				licitacao = new Licitacao(2);
				empresa = new Empresa(2);
				participante = new Participante(licitacao, empresa);
				if (BO.existe(participante))
					System.out.println("Licitacao Encontrada");
				else
					System.out.println("Nao Encontrada");
				
				
				
				//Alteracao
				System.out.println("");
				System.out.println("Alterar: idLicitacao 2, idEmpresa, novo preço = 900, nova conformidade = true");
				licitacao = new Licitacao(2);
				empresa = new Empresa(2);
				participante = new Participante(licitacao, empresa, 900, true);
				BO.alterar(participante);
				participante = BO.procurarPorCodigo(participante);
				System.out.println(participante);
				
				
				
				

				
				
				
				//Procurar por id
				System.out.println("");
				System.out.println("Procurar pelos ids: idLicitacao 2 e idEmpresa 4");
				empresa = new Empresa(4);
				licitacao = new Licitacao(2);
				participante = new Participante(licitacao, empresa);
				participante = BO.procurarPorCodigo(participante);
				System.out.println(participante);
				
				
				System.out.println("");
				System.out.println("Ordenar os participantes por preço (com idLicitacao=2)");
				List<Participante> lista = new ArrayList<Participante>();
				lista = BO.ordenarParticipantesPorPreco(2);	
				for (Participante partici : lista) {
					System.out.println(partici.toString());
				}
				
				//Conformes
				System.out.println("");
				System.out.println("Listar participantes conformes (com idLicitacao=2)");
				List<Participante> lista2 = new ArrayList<Participante>();
				lista2 = BO.pesquisarParticipantesConformes(2);	
				for (Participante participant : lista2) {
					System.out.println(participant.toString());
				}
				
				//Buscar todos
				System.out.println("");
				System.out.println("Buscar todos");
				List<Participante> lista1 = new ArrayList<Participante>();
				lista1 = BO.pesquisarTodos();	
				for (Participante partici : lista1) {
					System.out.println(partici.toString());
				}
				
				
				//Exclusao
				System.out.println("");
				System.out.println("Excluir participante: idLicitacao 2 e idEmpresa 5");				
				licitacao = new Licitacao(2);
				empresa = new Empresa(5);
				participante = new Participante(licitacao, empresa);
				if (BO.excluir(participante))
					System.out.println("Participante excluído com Sucesso");
				else
					System.out.println("Erro ao Excluir");
		
		

	}

}
