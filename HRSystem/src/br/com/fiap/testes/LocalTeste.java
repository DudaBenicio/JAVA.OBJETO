package br.com.fiap.testes;

import java.sql.SQLException;

import br.com.fiap.controller.AppController;
import br.com.fiap.jdbc.models.Candidato;
import br.com.fiap.jdbc.models.Genero;

public class LocalTeste {


public static void main(String[] args) throws SQLException {

	AppController app = AppController.getInstance();

	
	// 1. Teste de Inserção
	System.out.println("Inserindo candidatos...");
	
	Candidato Maria  = new Candidato("Maria", "técnica em mecanica", "dudarodrigues@gmail.com", "Rua A","13/11/1978","88888-1111", Genero.Feminino , 20, 1);
	
	Candidato Gabriel = new Candidato("Gabriel", "Tecnico de infomatica" , "gabriel@gmail.com", "Rua B" ,"12/15/2005", "2345-1434", Genero.Masculino, 20 , 2);  
	
	app.adicionarCandidato(Maria);
	app.adicionarCandidato(Gabriel);
	System.out.println("Inserção concluída.\n");

	// 2. Teste de Consulta
	System.out.println("Consultando todos os candidatos:");
	app.buscarTodosCandidatos();

	// Consulta por ID
	System.out.println("\nConsultando candidato por ID:");
	app.buscarCandidato(3);

	// Consulta por Área
	System.out.println("\nConsultando candidatos por Área de Atuação:");
	app.buscarCandidatoPorArea(1);

	// 3. Teste de Atualização
	System.out.println("\nAtualizando candidato:");
	Maria.setNome("Emerson Silva");
	Gabriel.setEmail("emerson.silva@gmail.com");
	app.alterarCandidato(Maria);
	System.out.println("Candidato atualizado.\n");

	// 4. Teste de Exclusão
	System.out.println("Excluindo candidato:");
	app.excluirCandidato(5);
	System.out.println("Candidato excluído.\n");

	// Consulta final para verificar exclusão
	System.out.println("Consultando todos os candidatos após exclusão:");
	app.buscarTodosCandidatos();

}
}

