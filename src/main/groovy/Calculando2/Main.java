package Calculando2;


import javax.swing.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog("persona 1"  + "\n Ingresa tu edad"));
        int edad2 = Integer.parseInt(JOptionPane.showInputDialog("persona 2"  + "\n Ingresa tu edad"));
        int edad3 = Integer.parseInt(JOptionPane.showInputDialog("persona 3"  + "\n Ingresa tu edad"));

        Stream<Integer> stream = Stream.of(edad1, edad2, edad3);
        Object[] numeros = stream.sorted().toArray();
        System.out.println("Número de en medio: " + numeros[1]);
        System.out.println("Número menor: " + numeros[0]);
        System.out.println("Número mayor: " + numeros[2]);
    }
}