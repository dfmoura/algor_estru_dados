/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diogo
 */
import javax.swing.JOptionPane;

public class NewClass1 {
    
    public static void main (String[] args){
        int valor1, valor2, soma;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor?"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor?"));
        soma = valor1 + valor2;
        JOptionPane.showMessageDialog(null,"Resultado: " + soma);
        
        
        
    }
}
