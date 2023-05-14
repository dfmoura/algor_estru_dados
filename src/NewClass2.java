/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diogo
 */

 
public class NewClass2 {
    public static void main(String[] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
        if (numero % 2 ==1){
            JOptionPane.showMessageDialog(null, "O número é ímpar.");
        }
    } 
}
