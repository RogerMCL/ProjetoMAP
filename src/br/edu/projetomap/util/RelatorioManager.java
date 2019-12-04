/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projetomap.util;

import br.edu.projetomap.model.Aluno;
import br.edu.projetomap.model.Turma;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author rogerio
 */
public class RelatorioManager {
    public static String path = 
            RelatorioManager.class.getClassLoader().getResource("").getPath() + "/jasper";
    
    public static JasperPrint gerarRelatorioAlunos(List<Aluno> alunos) throws JRException{
        JasperReport report = JasperCompileManager.compileReport(path + "/Alunos.jrxml");

        return JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(alunos));
    }
    
    public static JasperPrint gerarRelatoriosTurmas(List<Turma> turmas) throws JRException{
        JasperReport report = JasperCompileManager.compileReport(path + "/Turmas.jrxml");
        return JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(turmas));
    }
    
    public static JasperPrint gerarRelatoriosAlunosAulas(List<Aluno> alunos, String param) throws JRException{
        HashMap params = new HashMap();
        params.put("Titulo", param);
        JasperReport report = JasperCompileManager.compileReport(path + "/AlunosAula.jrxml");
        return JasperFillManager.fillReport(report, params, new JRBeanCollectionDataSource(alunos));
    }
}
