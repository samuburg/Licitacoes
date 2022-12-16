package main;

import java.util.ArrayList;
import java.util.List;

import com.Participante;

import bo.ParticipanteBO;

public class ParticipanteListarConformes {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos
		ParticipanteBO BO = new ParticipanteBO();
		List<Participante> lista = new ArrayList<Participante>();
		lista = BO.pesquisarParticipantesConformes(13);	
		for (Participante participante : lista) {
			System.out.println(participante.toString());
		}
	
	}
}