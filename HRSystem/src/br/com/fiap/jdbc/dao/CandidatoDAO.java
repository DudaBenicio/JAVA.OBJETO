package br.com.fiap.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.connection.ConnectionFactory;
import br.com.fiap.jdbc.models.Candidato;

public class CandidatoDAO {
	
	private Connection connection;
	
	public CandidatoDAO(Connection connection2) {
		this.connection = new ConnectionFactory().conectar();}
	
	// INSERTE
	public void insert(Candidato candidato) throws SQLException {

		String sql = "INSERT INTO t_candidato (nome, Telefone, email, endereco, formacao, dataNascimento, tempoFormacao, genero, idArea) VALUES (?,?,?,?,?,?,?,?,?)";

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

			stmt.setString(1, candidato.getNome());
			stmt.setString(2, candidato.getTelefone());
			stmt.setString(3, candidato.getEmail());
			stmt.setString(4, candidato.getEndereco());
			stmt.setString(5, candidato.getFormacao());
			stmt.setObject(6, candidato.getDatNasc());
			stmt.setFloat(7, candidato.getTempoExp());
			stmt.setString(8, candidato.getGenero().getCodigo());
			stmt.setLong(9, candidato.getIdArea());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	// DELETE
	public void delete(long id) throws SQLException {

		String sql = "DELETE FROM t_candidato WHERE idCandidato = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();

		}

	}
// UPDATE 
	public void update(Candidato candidato) throws SQLException {
		String sql = "UPDATE t_candidato SET nome = ?, telefone = ?, email = ?, endereco = ?, formacao = ?, dataNascimento = ?, tempoFormacao = ?, genero = ?, idArea = ? WHERE idCandidato = ?";

		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

			stmt.setString(1, candidato.getNome());
			stmt.setString(2, candidato.getTelefone());
			stmt.setString(3, candidato.getEmail());
			stmt.setString(4, candidato.getEndereco());
			stmt.setString(5, candidato.getFormacao());
			stmt.setObject(6, candidato.getDatNasc());
			stmt.setFloat(7, candidato.getTempoExp());
			stmt.setString(8, candidato.getGenero().getCodigo());
			stmt.setLong(9, candidato.getIdArea());
			stmt.setLong(10, candidato.getIdCandidato());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}


// SELECTALL
	public List<Candidato> selectAll() {
		List<Candidato> listaCandidatos = new ArrayList<Candidato>();
		Candidato candidato;
		String sql = "select * from candidato order by nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {		
				candidato = new Candidato();
				candidato.setIdCandidato(rs.getLong("idCandidato"));
				candidato.setNome(rs.getString("nome"));
				candidato.setTelefone(rs.getString("telefone"));
				candidato.setEmail(rs.getString("email"));
				candidato.setEndereco(rs.getString("endereco"));
				candidato.setFormacao(rs.getString("formacao"));
				candidato.setDatNasc(rs.getTimestamp("dataNasc").toLocalDateTime().toLocalDate());
				candidato.setGenero(rs.getString("genero"));
				candidato.setTempoExp(rs.getInt("tempoExperiencia"));
				candidato.setIdArea(rs.getLong("idArea"));
				listaCandidatos.add(candidato);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaCandidatos;
	}

	
	//SELECT BY ID
	public Candidato selectById(long id) {
		Candidato candidato = null;
		String sql = "select * from candidato where idCandidato=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				candidato = new Candidato();
				candidato.setIdCandidato(rs.getLong("idCandidato"));
				candidato.setNome(rs.getString("nome"));
				candidato.setTelefone(rs.getString("telefone"));
				candidato.setEmail(rs.getString("email"));
				candidato.setEndereco(rs.getString("endereco"));
				candidato.setDatNasc(rs.getTimestamp("dataNasc").toLocalDateTime().toLocalDate());
				candidato.setGenero(rs.getString("genero"));
				candidato.setTempoExp(rs.getInt("tempoExperiencia"));
				candidato.setIdArea(rs.getLong("idArea"));
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return candidato;
	}
	
	public List<Candidato> selectCandidatoByArea(int idArea) {
		List<Candidato> candidatos = new ArrayList<Candidato>();
		Candidato candidato = null;
		try {
			String sql = "SELECT * FROM candidato WHERE idArea = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, idArea);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				candidato = new Candidato();
				candidato.setIdCandidato(rs.getLong("idCandidato"));
				candidato.setNome(rs.getString("nome"));
				candidato.setTelefone(rs.getString("telefone"));
				candidato.setEmail(rs.getString("email"));
				candidato.setEndereco(rs.getString("endereco"));
				candidato.setDatNasc(rs.getTimestamp("dataNasc").toLocalDateTime().toLocalDate());
				candidato.setGenero(rs.getString("genero"));
				candidato.setTempoExp(rs.getInt("tempoExperiencia"));
				candidato.setIdArea(rs.getLong("idArea"));
				candidatos.add(candidato);
			}
			stmt.close();
			rs.close();
			return candidatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}


		

		


