/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetomap.model;

import br.edu.projetomap.util.DateUtil;
import java.util.Date;

/**
 *
 * @author rogerio
 */
public class Aluno {
    private String cpf;
    private String nome;
    private String telefone;
    private Date dataNascimento;
    private Date dataCadastro;
    private Turma turma;

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    
    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(cpf).append(" -- ")
                .append(nome).append(" -- ")
                .append(telefone).append(" -- ")
                .append(DateUtil.dateToString(dataNascimento)).append(" -- ")
                .append(DateUtil.dateToString(dataCadastro)).append(" -- ")
                .append(turma.getAula());
        return sb.toString();
    }
}
