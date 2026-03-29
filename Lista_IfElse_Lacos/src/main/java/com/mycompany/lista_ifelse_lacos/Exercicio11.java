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
public class Exercicio11 {

    Exercicio11() {
        
        int a1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do primeiro ângulo:"));
        int a2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do segundo ângulo:"));
        int a3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do terceiro ângulo:"));
        
        if(a1==90||a2==90||a3==90) JOptionPane.showMessageDialog(null, "Triângulo retângulo.");
        else if(a1>90||a2>90||a3>90) JOptionPane.showMessageDialog(null, "Triângulo obtusângulo.");
        else if(a1<90&&a2<90&&a3<90) JOptionPane.showMessageDialog(null, "Triângulo acutângulo.");
        
    }
    
    public static void main(String[] args) {
        Exercicio11 ex11 = new Exercicio11();
    }
    
}
