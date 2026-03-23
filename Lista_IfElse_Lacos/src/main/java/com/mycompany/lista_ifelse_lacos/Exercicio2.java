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
public class Exercicio2 {
    Exercicio2() {
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de seu nascimento:"));
        
        if((2026-ano)<16) JOptionPane.showMessageDialog(null, "Você não poderá votar neste ano.");
        else JOptionPane.showMessageDialog(null, "Você poderá votar neste ano.");
    }
    
    public static void main(String[] args) {
        Exercicio2 ex2 = new Exercicio2();
    }
}
