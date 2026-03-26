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
public class Exercicio5 {

    Exercicio5() {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro número:"));
        
        int swap;
        
        if(n1>n2||n1>n3){
            swap = n1;
            if(n2>n3) JOptionPane.showMessageDialog(null, "A ordem crescente dos números é: "+n1+", "+n2+", "+n3+".");
        }
    }
    
    public static void main(String[] args) {
        Exercicio5 ex5 = new Exercicio5();
    }
}
