/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetomap.dao;

import br.edu.projetomap.model.Turma;
import br.edu.projetomap.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rogerio public class TurmaDAO {

    private Connection con;
    private String sql;
    private PreparedStatement st;
    private ResultSet rs;

    public void inserir(Turma turma) throws SQLException {
        sql = "insert into turma (nomeProfessor , tipo, aula) values(?, ?, ?)";

        con = ConnectionFactory.getConnection();

        st = con.prepareStatement(sql);

        st.setString(1, turma.getNomeProfessor());
        st.setString(2, turma.getTipo());
        st.setString(3, turma.getAula());

        st.executeUpdate();

        con.close();
    }

    public void editar(Turma turma) throws SQLException {
        sql = "update turma set nomeProfessor = ?, tipo = ?, aula = ? where id = ?";

        con = ConnectionFactory.getConnection();
        st = con.prepareStatement(sql);
        st.setString(1, turma.getNomeProfessor());
        st.setString(2, turma.getTipo());
        st.setString(3, turma.getAula());
        st.setLong(4, turma.getId());
        st.executeUpdate();

        con.close();
    }

    public Turma buscarPorID(Long busca) throws SQLException {
        Turma turma = null;
        con = ConnectionFactory.getConnection();
        sql = "select t.*"
                + "from turma t where t.id = ?";
        st = con.prepareStatement(sql);
        st.setLong(1, busca);
        rs = st.executeQuery();

        if(rs.next()) {
            Long id = rs.getLong(1);
            String nomeProfessor = rs.getString(2);
            String tipo = rs.getString(3);
            String aula = rs.getString(4);
         
            turma = new Turma();

            turma.setId(id);
            turma.setNomeProfessor(nomeProfessor);
            turma.setTipo(tipo);
            turma.setAula(aula);
            
            
        }
        con.close();
        return turma;
    }
    
    public List<Turma> listar() throws SQLException {
        List<Turma> turmas = new ArrayList<>();
        con = ConnectionFactory.getConnection();
        sql = "select t.* "
                + "from turma t";
        st = con.prepareStatement(sql);
        rs = st.executeQuery();

        while (rs.next()) {
            long id = rs.getInt("id");
            String nomeProfessor = rs.getString(2);
            String tipo = rs.getString(3);
            String aula = rs.getString(4);

            Turma turma = new Turma();

            turma.setId(id);
            turma.setNomeProfessor(nomeProfessor);
            turma.setTipo(tipo);
            turma.setAula(aula);
            turmas.add(turma);
        }
        con.close();
        return turmas;
    }

    public List<Turma> buscar(String query) throws SQLException {
        List<Turma> turmas = new ArrayList<>();
        con = ConnectionFactory.getConnection();
        sql = "select t.* "
                + "from turma t where t.aula ilike ?";
        st = con.prepareStatement(sql);
        st.setString(1, query + '%');
        rs = st.executeQuery();

        while (rs.next()) {
            long id = rs.getInt("id");
            String nomeProfessor = rs.getString(2);
            String tipo = rs.getString(3);
            String aula = rs.getString(4);

            Turma turma = new Turma();

            turma.setId(id);
            turma.setNomeProfessor(nomeProfessor);
            turma.setTipo(tipo);
            turma.setAula(aula);
            turmas.add(turma);
        }
        con.close();
        return turmas;
    }
    
    public void excluir(Turma turma) throws SQLException {
        sql = "delete from turma where id = ?";
        con = ConnectionFactory.getConnection();
        st = con.prepareStatement(sql);
        st.setLong(1, turma.getId());
        st.executeUpdate();

        con.close();
    }
}

