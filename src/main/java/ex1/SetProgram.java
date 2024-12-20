package ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetProgram {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Texto: ");
        String texto = sc.nextLine();

        //2.
        texto = texto.toLowerCase();
        texto = texto.replaceAll(",", "");
        texto = texto.replaceAll("!", "");
        texto = texto.replaceAll("\\.", "");
        String[] palavras = texto.split(" ");

        //System.out.println(Arrays.toString(palavras));

        for(String p : palavras) {
            set.add(p);
        }

        System.out.printf("Num. palavras únicas = %d \n", set.size());
        System.out.println("Palavras únicas:");
        for(String p : set) {
            System.out.println(p);
        }

    }
}
