﻿/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetomap.view;

import br.edu.projetomap.dao.AlunoDAO;
import br.edu.projetomap.dao.TurmaDAO;
import br.edu.projetomap.util.MensagensUtil;
import br.edu.projetomap.util.RelatorioManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author rogerio
 */
public class TelaPrincipalJFrame extends javax.swing.JFrame {

    private AlunoDAO alunoDAO = new AlunoDAO();
    private TurmaDAO turmaDAO = new TurmaDAO();

    public TelaPrincipalJFrame() {
        initComponents();
        setProperties();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAluno = new javax.swing.JMenu();
        menuListarAlunos = new javax.swing.JMenuItem();
        menuTurma = new javax.swing.JMenu();
        menuListarTurma = new javax.swing.JMenuItem();
        menuLinguagem = new javax.swing.JMenu();
        menuPortugues = new javax.swing.JMenuItem();
        menuIngles = new javax.swing.JMenuItem();
        menuEspanhol = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuRelatorioAlunos = new javax.swing.JMenuItem();
        menuRelatorioTurmas = new javax.swing.JMenuItem();
        menuRelatoriosAlunosPorAula = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Academia Boa Forma");

        menuAluno.setText("Aluno");

        menuListarAlunos.setText("Listar");
        menuListarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarAlunosActionPerformed(evt);
            }
        });
        menuAluno.add(menuListarAlunos);

        jMenuBar1.add(menuAluno);

        menuTurma.setText("Turma");

        menuListarTurma.setText("Listar");
        menuListarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarTurmaActionPerformed(evt);
            }
        });
        menuTurma.add(menuListarTurma);

        jMenuBar1.add(menuTurma);

        menuLinguagem.setText("Linguagem");

        menuPortugues.setText("pt_BR");
        menuPortugues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPortuguesActionPerformed(evt);
            }
        });
        menuLinguagem.add(menuPortugues);

        menuIngles.setText("en_US");
        menuIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInglesActionPerformed(evt);
            }
        });
        menuLinguagem.add(menuIngles);

        menuEspanhol.setText("es_ES");
        menuEspanhol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEspanholActionPerformed(evt);
            }
        });
        menuLinguagem.add(menuEspanhol);

        jMenuBar1.add(menuLinguagem);

        menuRelatorios.setText("Relatorios");

        menuRelatorioAlunos.setText("Alunos");
        menuRelatorioAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioAlunosActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuRelatorioAlunos);

        menuRelatorioTurmas.setText("Turmas");
        menuRelatorioTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioTurmasActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuRelatorioTurmas);

        menuRelatoriosAlunosPorAula.setText("Alunos por Aula");
        menuRelatoriosAlunosPorAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatoriosAlunosPorAulaActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuRelatoriosAlunosPorAula);

        jMenuBar1.add(menuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuListarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarAlunosActionPerformed
        AlunosJFrame janela = new AlunosJFrame();
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }//GEN-LAST:event_menuListarAlunosActionPerformed

    private void menuListarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarTurmaActionPerformed
        TurmasJFrame janela = new TurmasJFrame();
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }//GEN-LAST:event_menuListarTurmaActionPerformed

    private void menuPortuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPortuguesActionPerformed
        MensagensUtil.setLocale(MensagensUtil.LOCALE_PT_BR);
        setProperties();
    }//GEN-LAST:event_menuPortuguesActionPerformed

    private void menuInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInglesActionPerformed
        MensagensUtil.setLocale(MensagensUtil.LOCALE_EN_US);
        setProperties();
    }//GEN-LAST:event_menuInglesActionPerformed

    private void menuEspanholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEspanholActionPerformed
        MensagensUtil.setLocale(MensagensUtil.LOCALE_ES_ES);
        setProperties();
    }//GEN-LAST:event_menuEspanholActionPerformed

    private void menuRelatorioAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioAlunosActionPerformed
        try {
            // TODO add your handling code here:
            JasperPrint relatorio = RelatorioManager.gerarRelatorioAlunos(alunoDAO.listar());
            String titrel = "Relatório";
            JFrame frame = new JFrame();
            frame.setSize(1000, 800);
            JRViewer viewer = new JRViewer(relatorio);
            frame.add(viewer);
            frame.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipalJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuRelatorioAlunosActionPerformed

    private void menuRelatorioTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioTurmasActionPerformed
        try {
            // TODO add your handling code here:
            JasperPrint relatorio = RelatorioManager.gerarRelatoriosTurmas(turmaDAO.listar());
            String titrel = "Relatório";
            JFrame frame = new JFrame();
            frame.setSize(1000, 800);
            JRViewer viewer = new JRViewer(relatorio);
            frame.add(viewer);
            frame.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipalJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuRelatorioTurmasActionPerformed

    private void menuRelatoriosAlunosPorAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatoriosAlunosPorAulaActionPerformed
        try {
            JasperPrint relatorio = RelatorioManager.gerarRelatoriosAlunosAulas(alunoDAO.listar(), "Alunos, Aulas e Professores");
            String titrel = "Relatório";
            JFrame frame = new JFrame();
            frame.setSize(1000, 800);
            JRViewer viewer = new JRViewer(relatorio);
            frame.add(viewer);
            frame.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipalJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuRelatoriosAlunosPorAulaActionPerformed

    private void setProperties() {
        menuAluno.setText(MensagensUtil.getString(MensagensUtil.MSG_MENU_ALUNO));
        menuLinguagem.setText(MensagensUtil.getString(MensagensUtil.MSG_MENU_LINGUAGEM));
        menuTurma.setText(MensagensUtil.getString(MensagensUtil.MSG_MENU_TURMA));
        menuRelatorios.setText(MensagensUtil.getString(MensagensUtil.MSG_MENU_RELATORIO));
        menuListarAlunos.setText(MensagensUtil.getString(MensagensUtil.MSG_MENU_LISTAR));
        menuListarTurma.setText(MensagensUtil.getString(MensagensUtil.MSG_MENU_LISTAR));
        menuRelatorioAlunos.setText(MensagensUtil.getString(MensagensUtil.MSG_RELATORIO_LISTA_ALUNO));
        menuRelatorioTurmas.setText(MensagensUtil.getString(MensagensUtil.MSG_RELATORIO_LISTA_TURMA));
        menuRelatoriosAlunosPorAula.setText(MensagensUtil.getString(MensagensUtil.MSG_RELATORIO_LISTA_ALUNOS_AULA));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAluno;
    private javax.swing.JMenuItem menuEspanhol;
    private javax.swing.JMenuItem menuIngles;
    private javax.swing.JMenu menuLinguagem;
    private javax.swing.JMenuItem menuListarAlunos;
    private javax.swing.JMenuItem menuListarTurma;
    private javax.swing.JMenuItem menuPortugues;
    private javax.swing.JMenuItem menuRelatorioAlunos;
    private javax.swing.JMenuItem menuRelatorioTurmas;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenuItem menuRelatoriosAlunosPorAula;
    private javax.swing.JMenu menuTurma;
    // End of variables declaration//GEN-END:variables
}
