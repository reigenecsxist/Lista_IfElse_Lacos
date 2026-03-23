/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_ifelse_lacos;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário do Windows
 */
public class Exercicio1 {  
    Exercicio1() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:"));
        
        if(n1>n2) JOptionPane.showMessageDialog(null, "O número "+n1+" é maior que "+n2+".");
        else JOptionPane.showMessageDialog(null, "O número "+n2+" é maior que "+n1+".");
    }

    public static void main(String[] args) {
        Exercicio1 ex1 = new Exercicio1();
    }
}
