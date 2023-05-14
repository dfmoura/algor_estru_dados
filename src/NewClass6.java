/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diogo
 */
import javax.swing.JOptionPane;

public class NewClass6 {
    
    public static void main (String[] args){
        int valor1, valor2, valor3, soma;
        double media;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor?"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor?"));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Qual o terceiro valor?"));
        soma = valor1 + valor2 + valor3;
        media = soma / 3;
        JOptionPane.showMessageDialog(null,"Resultado soma: " + soma);
        JOptionPane.showMessageDialog(null,"Resultado media: " + media);
        
        
    }
}
