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
public class Exercicio16 {
    
    Exercicio16(){
        
        for(int i=0; i<100; i++){
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));

            if(n1==n2) JOptionPane.showMessageDialog(null, "Os números são iguais.");
            else if(n1>n2) JOptionPane.showMessageDialog(null, "O número "+n1+" é maior.");
            else JOptionPane.showMessageDialog(null, "O número "+n2+" é maior.");
        }
        
    }
    
    public static void main(String[] args) {
        Exercicio16 ex16 = new Exercicio16();
    }
}
