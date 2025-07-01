/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author aluno
 */
public class funcionario {
    
    
    public static String nome;
    public static String numCaixa;
    
    public void guardaNome (String nomeLogin) {
        nome = nomeLogin;
    }
    
    public String pegaNome () {
        return nome;
    }
    
    public void guardaCaixa (String caixa) {
        numCaixa = caixa;
    }
    
    public String pegaNum () {
        return numCaixa;
    }
}
