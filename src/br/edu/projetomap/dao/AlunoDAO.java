/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetomap.dao;

import br.edu.projetomap.model.Aluno;
import br.edu.projetomap.model.Turma;
import br.edu.projetomap.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author ro
gerio public class AlunoDAO {

    private Connection con;
    private String sql;
    private PreparedStatement st;
    private ResultSet rs;

    public void inserir(Aluno aluno, Turma turma) throws SQLException {
        sql = "insert into aluno (cpf , nome, telefone, datanascimento, dataCadastro, id_turma) values(?, ?, ?, ?, ?, ?)";

        con = ConnectionFactory.getConnection();

        st = con.prepareStatement(sql);

        st.setString(1, aluno.getCpf());
        st.setString(2, aluno.getNome());
        st.setString(3, aluno.getTelefone());

        Calendar myCalendar = Calendar.getInstance();
        myCalendar.add(Calendar.DAY_OF_MONTH, -1);

        Date myDate = new Date(myCalendar.getTimeInMillis());

        st.setDate(4, myDate);
//        java.sql.Date dataSql = new java.sql.Date(aluno.getDataCadastro().getTime());
        st.setDate(5, myDate);
        st.setLong(6, turma.getId());

        st.executeUpdate();

        con.close();
    }

    public void editar(Aluno aluno, Turma turma) throws SQLException {
        sql = "update aluno set nome = ?, telefone = ?,  datanascimento = ? where id = ?";

        con = ConnectionFactory.getConnection();
        st = con.prepareStatement(sql);
        st.setString(1, aluno.getNome());
        st.setString(2, aluno.getTelefone());
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.add(Calendar.DAY_OF_MONTH, -1);

        Date myDate = new Date(myCalendar.getTimeInMillis());
        st.setDate(3, myDate);
        st.setLong(4, turma.getId());
        st.executeUpdate();

        con.close();
    }

    public List<Aluno> listar() throws SQLException {
        List<Aluno> alunos = new ArrayList<>();
        con = ConnectionFactory.getConnection();
        sql = "select a.*, t.aula from aluno a, turma t where a.id_turma = t.id";
        st = con.prepareStatement(sql);
        rs = st.executeQuery();

        while (rs.next()) {
            String cpf = rs.getString(1);
            String nome = rs.getString(2);
            String telefone = rs.getString(3);
            Date dataNascimento = rs.getDate(4);
            Date dataCadastro = rs.getDate(5);
            long id_turma = rs.getLong(6);
//            String aula = rs.getString(7);

            Aluno aluno = new Aluno();

            aluno.setCpf(cpf);
            aluno.setNome(nome);
            aluno.setTelefone(telefone);
            aluno.setDataNascimento(dataNascimento);
            aluno.setDataCadastro(dataCadastro);

            Turma turma;
            TurmaDAO turmaDAO = new TurmaDAO();
            turma = turmaDAO.buscarPorID(id_turma);

            aluno.setTurma(turma);
            alunos.add(aluno);
        }
        con.close();
        return alunos;
    }

    public void excluir(Aluno aluno) throws SQLException {
        sql = "delete from aluno where cpf = ?";
        con = ConnectionFactory.getConnection();
        st = con.prepareStatement(sql);
        st.setString(1, aluno.getCpf());
        st.executeUpdate();

        con.close();
    }

    public List<Aluno> listarPorAula(String query) throws SQLException {
        List<Aluno> alunos = new ArrayList<>();
        con = ConnectionFactory.getConnection();
        sql = "select a.*, t.aula from aluno a, turma t where a.id_turma = t.id and t.aula = ?";
        st = con.prepareStatement(sql);
        st.setString(1, query);
        rs = st.executeQuery();

        while (rs.next()) {
            String cpf = rs.getString("cpf");
            String nome = rs.getString(2);
            String telefone = rs.getString(3);
            Date dataNascimento = rs.getDate(4);
            Date dataCadastro = rs.getDate(5);
            long id_turma = rs.getLong(6);
            String aula = rs.getString(7);

            Aluno aluno = new Aluno();

            aluno.setCpf(cpf);
            aluno.setNome(nome);
            aluno.setTelefone(telefone);
            aluno.setDataNascimento(dataNascimento);
            aluno.setDataCadastro(dataCadastro);
            aluno.getTurma().setId(id_turma);
            aluno.getTurma().setAula(aula);
            alunos.add(aluno);
            System.out.println(aluno);
        }
        con.close();
        return alunos;
    }

    public Aluno buscarPorCpf(String busca) throws SQLException {
        Aluno aluno = null;
        con = ConnectionFactory.getConnection();
        sql = "select a.*, t.aula"
                + "from aluno a, turma t where a.id_turma = t.id and a.cpf = ?";
        st = con.prepareStatement(sql);
        st.setString(1, busca);
        rs = st.executeQuery();

        if (rs.next()) {
            String cpf = rs.getString("cpf");
            String nome = rs.getString(2);
            String telefone = rs.getString(3);
            Date dataNascimento = rs.getDate(4);
            Date dataCadastro = rs.getDate(5);
            long id_turma = rs.getLong(6);
            String aula = rs.getString(7);

            aluno = new Aluno();

            aluno.setCpf(cpf);
            aluno.setNome(nome);
            aluno.setTelefone(telefone);
            aluno.setDataNascimento(dataNascimento);
            aluno.setDataCadastro(dataCadastro);
            aluno.getTurma().setId(id_turma);
            aluno.getTurma().setAula(aula);

        }
        con.close();
        return aluno;
    }

    public List<Aluno> buscar(String query) throws SQLException {
        List<Aluno> alunos = new ArrayList<>();
        con = ConnectionFactory.getConnection();
        sql = "select a.*, t.aula"
                + "from aluno a, turma t where a.id_turma = t.id and a.nome ilike ?";
        st = con.prepareStatement(sql);
        st.setString(1, query + '%');
        rs = st.executeQuery();

        while (rs.next()) {
            String cpf = rs.getString("cpf");
            String nome = rs.getString(2);
            String telefone = rs.getString(3);
            Date dataNascimento = rs.getDate(4);
            Date dataCadastro = rs.getDate(5);
            long id_turma = rs.getLong(6);
            String aula = rs.getString(7);

            Aluno aluno = new Aluno();

            aluno.setCpf(cpf);
            aluno.setNome(nome);
            aluno.setTelefone(telefone);
            aluno.setDataNascimento(dataNascimento);
            aluno.setDataCadastro(dataCadastro);
            aluno.getTurma().setId(id_turma);
            aluno.getTurma().setAula(aula);
            alunos.add(aluno);
        }
        con.close();
        return alunos;
    }
}
