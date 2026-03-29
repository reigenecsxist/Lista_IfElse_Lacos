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
public class Exercicio10 {

    Exercicio10() {
        
        float l1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do primeiro lado:"));
        float l2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do segundo lado:"));
        float l3 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do terceiro lado:"));
        
        if(l1==l2&&l1==l3) JOptionPane.showMessageDialog(null, "Triângulo equilátero.");
        else if(l1==l2||l1==l3) JOptionPane.showMessageDialog(null, "Triângulo isósceles.");
        else JOptionPane.showMessageDialog(null, "Triângulo escaleno.");
    }
    
    public static void main(String[] args) {
        Exercicio10 ex10 = new Exercicio10();
    }
    
}
