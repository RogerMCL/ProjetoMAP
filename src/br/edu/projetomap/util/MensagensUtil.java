/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetomap.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author rogerio
 */
public class MensagensUtil {
    
    public static final Locale LOCALE_PT_BR = new Locale("pt", "BR");
    public static final Locale LOCALE_EN_US = new Locale("en", "US");
    public static final Locale LOCALE_ES_ES = new Locale("es", "ES");
    
    private static ResourceBundle bundle = ResourceBundle.getBundle("mensagens", LOCALE_PT_BR);
    
    
    public static final String MSG_VALIDACAO_NOME = "msg.validacao.nome";
    public static final String MSG_ERRO_SELECIONAR = "msg.erro.selecionar";
    public static final String MSG_ERRO_CONSULTAR = "msg.erro.consultar";
    public static final String MSG_ERR0_EDITAR = "msg.erro.editar";
    public static final String MSG_ERR0_SALVAR = "msg.erro.salvar";
    public static final String MSG_ERRO_EXCLUIR = "msg.erro.editar";
    public static final String MSG_TABELA_DATACADASTRO = "msg.tabela.datacadastro";
    public static final String MSG_LABEL_ALUNOS = "msg.label.alunos";
    public static final String MSG_LABEL_TURMAS = "msg.label.turmas";
    public static final String MSG_LABEL_NOVOALUNO = "msg.label.novo.aluno";
    public static final String MSG_LABEL_EDITARALUNO = "msg.label.editar.aluno";
    public static final String MSG_LABEL_NOVATURMA = "msg.label.novo.turma";
    public static final String MSG_LABEL_EDITARTURMA = "msg.label.editar.turma";
    public static final String MSG_LABEL_CPF = "msg.label.cpf";
    public static final String MSG_LABEL_NOME = "msg.label.nome";
    public static final String MSG_LABEL_TELEFONE = "msg.label.telefone";
    public static final String MSG_LABEL_PROFESSOR = "msg.label.professor";
    public static final String MSG_LABEL_TIPO = "msg.label.tipo";
    public static final String MSG_LABEL_AULA = "msg.label.aula";
    public static final String MSG_LABEL_IDTURMA = "msg.label.idturma";
    public static final String MSG_BUTTON_SALVAR = "msg.button.salvar";
    public static final String MSG_BUTTON_CANCELAR = "msg.button.cancelar";
    public static final String MSG_BUTTON_EDITAR = "msg.button.editar";
    public static final String MSG_BUTTON_EXCLUIR = "msg.button.excluir";
    public static final String MSG_BUTTON_SAIR = "msg.button.sair";
    public static final String MSG_TABELA_CPF = "msg.tabela.cpf";
    public static final String MSG_TABELA_NOME = "msg.tabela.nome";
    public static final String MSG_TABELA_AULA = "msg.tabela.aula";
    public static final String MSG_TABELA_ID = "msg.tabela.id";
    public static final String MSG_TABELA_NOMEPROFESSOR = "msg.tabela.nomeprofessor";
    public static final String MSG_TABELA_TIPO = "msg.tabela.tipo";
    public static final String MSG_MENU_ALUNO = "msg.menu.aluno";
    public static final String MSG_MENU_TURMA = "msg.menu.turma";
    public static final String MSG_MENU_LINGUAGEM = "msg.menu.linguagem";
    public static final String MSG_MENU_RELATORIO = "msg.menu.relatorio";
    public static final String MSG_MENU_LISTAR = "msg.menu.listar";
    public static final String MSG_MENU_CADASTRAR = "msg.menu.cadastrar";
    public static final String MSG_RELATORIO_LISTA_ALUNO = "msg.relatorio.lista.aluno";
    public static final String MSG_RELATORIO_LISTA_TURMA = "msg.relatorio.lista.turma";
    public static final String MSG_RELATORIO_LISTA_ALUNOS_AULA = "msg.relatorio.lista.alunos.aula";
    
    
    public static String getString(String key){
        return bundle.getString(key);
    }
    
    public static void setLocale(Locale locale){
        bundle = ResourceBundle.getBundle("mensagens", locale);
    }
    
}
