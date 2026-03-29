/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jokenpo;

import java.awt.CardLayout;
import javax.swing.*;

/**
 *
 * @author Usuário do Windows
 */

public class Container implements InterfaceNav {
    
    CardLayout layout = new CardLayout();
    JPanel container = new JPanel(layout);
    
    private void constroiTela(){
        JFrame frame = new JFrame("JoKenPô");
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        frame.setSize(700, 350);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        container.add(new TelaInicial(this), "tela_inicial");
        container.add(new TelaMenu(this), "tela_menu");
        container.add(new TelaJogo(this), "tela_jogo");
        
        frame.setContentPane(container);
    }
    
    Container(){
        constroiTela();
    }
    
    public static void main(String[] args) {
        Container cn = new Container();
    }
    
    @Override
    public void trocarTela(String nome){
        layout.show(container, nome);
    }
    
    
}
