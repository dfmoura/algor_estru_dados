/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diogo
 */
import java.util.*;
public class NewClass7 {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de variaveis: ");
        int n = sc.nextInt();

        // criar a HashSet para armazenar valores distintos
        HashSet<Integer> set = new HashSet<Integer>();

        // Digitação das variaveis e adicinar na HashSet
        int soma = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (!set.contains(num)) {
                set.add(num);
                soma += num;
            }
        }

        // calcular a media dos valores distintos
        double media = (double) soma / set.size();

        // Output the result
        System.out.println("A soma dos valores distintos é " + soma);
        System.out.println("A media dos valores distintos é " + media);
    }
}
    
    

