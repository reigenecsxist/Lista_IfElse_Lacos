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
public class Exercicio9 {

    Exercicio9() {
        
        int[] ns = new int[3];
        int maior=0;
        
        for(int i=0; i<3; i++){
            ns[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o "+(i+1)+"º número:"));            
            if(ns[i]>maior) maior = ns[i];
        }
        
        JOptionPane.showMessageDialog(null, "Maior número: "+maior);
        
    }
    
    public static void main(String[] args) {
        Exercicio9 ex9 = new Exercicio9();
    }
}