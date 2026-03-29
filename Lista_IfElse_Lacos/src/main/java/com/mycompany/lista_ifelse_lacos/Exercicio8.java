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
public class Exercicio8 {
    
    Exercicio8(){
        
        int lados = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de lados do polígono:"));
        
        if(lados<3)JOptionPane.showMessageDialog(null, "NÃO É UM POLÍGONO.");
        else if(lados>5) JOptionPane.showMessageDialog(null, "POLÍGONO NÃO IDENTIFICADO.");
        else{
            double medida = Float.parseFloat(JOptionPane.showInputDialog("Inisira a medida do lado em centímetros"));
            
            switch(lados){
            case 3:
                JOptionPane.showMessageDialog(null, "TRIÂNGULO\n\nÁrea: "+(((medida*medida)*Math.sqrt(medida))/4));
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null, "QUADRADO\n\nÁrea: "+(medida*medida));
                break;
                
            case 5:
                 JOptionPane.showMessageDialog(null, "PENTÁGONO\n\nÁrea: "+(medida*medida)*1.7205);
                 break;
            }
        }
        
    }
        
    public static void main(String[] args) {
        Exercicio8 ex8 = new Exercicio8();
    }
    
}
