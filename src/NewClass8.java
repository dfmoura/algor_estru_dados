/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diogo
 */
import javax.swing.JOptionPane;
public class NewClass8 {
    public static void main(String[] args)
    {
        int qtd, vlr_unit1=1,vlr_unit2=2, vlr_tot;
        String codigo;
        codigo = JOptionPane.showInputDialog
        ("Digite o código do produto que deseja comprar? Lempres que 001=Lápis e 002=Caneta");
        switch (codigo)
        {
            case "001": JOptionPane.showMessageDialog
            (null,"O produto é Lápis.");
            qtd = Integer.parseInt(JOptionPane.showInputDialog("Informar a quantidade desejada?"));
            vlr_tot = vlr_unit1 * qtd;
            JOptionPane.showMessageDialog(null,"001 - Lápis - " + "comprou " + qtd + "un. no valor unitário de "+ vlr_unit1 + " com um valor total de: "+ vlr_tot);
            break;
            case "002": JOptionPane.showMessageDialog
            (null,"O produto é Caneta.");
            qtd = Integer.parseInt(JOptionPane.showInputDialog("Informar a quantidade desejada?"));
            vlr_tot = vlr_unit2 * qtd;
            JOptionPane.showMessageDialog(null,"002 - Caneta - " + "comprou " + qtd + "un. no valor unitário de "+ vlr_unit2 + " com um valor total de: "+ vlr_tot);            break;
            default: JOptionPane.showMessageDialog(null,"Inexistente!!!!!!");            
        }
        
    }
    
}
