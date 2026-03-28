/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_ifelse_lacos;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Moura
 */
public class Exercicio6 {

    Exercicio6() {
        int sexo = Integer.parseInt(JOptionPane.showInputDialog("Insira seu sexo:\n\n1 - Feminino\n2 - Masculino"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Insira sua altura:"));
        
        if(sexo==1) JOptionPane.showMessageDialog(null, "Seu peso ideal é igual a: "+((72.7*altura)-58));
        else if(sexo==2) JOptionPane.showMessageDialog(null, "Seu peso ideal é igual a: "+((62.1*altura)-44.7));
        else JOptionPane.showMessageDialog(null, "Você selecionou uma opção inválida para 'sexo'"); 
    }
    
    public static void main(String[] args) {
        Exercicio6 ex6 = new Exercicio6();
    }
}