package com.mycompany.listaex1;
import javax.swing.JOptionPane;

public class ListaEx1 {
    static class Hello{
        Hello(){
            JOptionPane.showMessageDialog(null, "Hello World!", "Hello", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        Hello hl = new Hello();
    }
}