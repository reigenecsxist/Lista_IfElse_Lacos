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
public class Exercicio4 {

    Exercicio4() {
        int quantMacas = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade de maçãs que deseja comprar?"));
        
        if(quantMacas>=12) JOptionPane.showMessageDialog(null, "O valor total é: "+quantMacas*0.25);
        else JOptionPane.showMessageDialog(null, "O valor total é: "+quantMacas*0.3);
    }
    
    public static void main(String[] args) {
        Exercicio4 ex4 = new Exercicio4();
    }
}