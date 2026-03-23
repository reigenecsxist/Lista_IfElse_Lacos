/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_ifelse_lacos;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuário do Windows
 */
public class Exercicio3 {
    Exercicio3() {
        int senha = Integer.parseInt(JOptionPane.showInputDialog("Insira a senha:"));
        
        if(senha==1234) JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
        else JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
    }
    
    public static void main(String[] args) {
        Exercicio3 ex3 = new Exercicio3();
    }
}
