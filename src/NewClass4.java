/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diogo
 */
import javax.swing.JOptionPane;
public class NewClass4 {
    public static void main (String[] args){
        int A,B,C;
        A = Integer.parseInt(JOptionPane.showInputDialog("Lado A "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Lado B "));
        C = Integer.parseInt(JOptionPane.showInputDialog("Lado C "));
        if (A != 0 && B != 0 && B + C != 0)            
            {
            if (A + B > C && A + C > B && B + C > A)
                {
                    if (A != B && A != C && B != C)
                        {
                        JOptionPane.showMessageDialog(null,"Escaleno");
                        }
                        else                        
                        {
                        if (A == B && B == C)
                            {
                            JOptionPane.showMessageDialog(null,"Equilátero");
                            }
                            else
                            {
                            JOptionPane.showMessageDialog(null,"Isósceles");
                            }
                        }
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(null,"Não forma um triângulo");
                    }
                }
                else
                {
                JOptionPane.showMessageDialog(null,"Não forma um triângulo");
                }
    }    
}
