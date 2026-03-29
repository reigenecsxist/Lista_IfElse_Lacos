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
public class Exercicio15 {

    Exercicio15() {
        
        int op=1;
        
        while(op==1){
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:"));
            int n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro número:"));

            if(n1>n2&&n1>n3) {
                if(n2>n3) JOptionPane.showMessageDialog(null, "Ordem crescente dos números: "+n3+", "+n2+", "+n1+".");
                else JOptionPane.showMessageDialog(null, "Ordem crescente dos números: "+n2+", "+n3+", "+n1+".");
            }
            else if(n2>n1&&n2>n3) {
                if(n1>n3) JOptionPane.showMessageDialog(null, "Ordem crescente dos números: "+n3+", "+n1+", "+n2+".");
                else JOptionPane.showMessageDialog(null, "Ordem crescente dos números: "+n1+", "+n3+", "+n2+".");
            }
            else{
                if(n1>n2) JOptionPane.showMessageDialog(null, "Ordem crescente dos números: "+n2+", "+n1+", "+n3+".");
                else JOptionPane.showMessageDialog(null, "Ordem crescente dos números: "+n1+", "+n2+", "+n3+".");
            }
            
            op = Integer.parseInt(JOptionPane.showInputDialog("Deseja começar novamente?\n\n\t1 - Sim         2 - Não"));
        }
        
    }
    
    public static void main(String[] args) {
        Exercicio15 ex15 = new Exercicio15();
    }
    
}
