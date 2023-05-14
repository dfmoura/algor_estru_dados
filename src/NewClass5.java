/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diogo
 */
import javax.swing.JOptionPane;
public class NewClass5 {
    public static void main(String[] args){
        String codigo;
        codigo = JOptionPane.showInputDialog("Digite o código");
        switch (codigo)
        {
            case "001": JOptionPane.showMessageDialog
            (null,"O Produto é Caderno");
            break;
            case "002": JOptionPane.showMessageDialog
            (null, "O Produto é Lápis");
            break;
            case "003": JOptionPane.showMessageDialog
            (null,"O produto é Borracha");
            break;
            default: JOptionPane.showMessageDialog(null,"Diversos");
        }
    }
    
}
