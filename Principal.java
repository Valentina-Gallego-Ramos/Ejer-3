package edu.itm.codigo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        metodos m = new metodos();

        System.out.println("¿Cuántas filas tendrá la librería?");
        int filas = Integer.parseInt(teclado.nextLine());

        System.out.println("¿Cuántas columnas tendrá la librería?");
        int columnas = Integer.parseInt(teclado.nextLine());

        objLibro[][] matriz = new objLibro[filas][columnas];

        matriz = m.registrarLibros(matriz);

        objLibro masCaro = m.encontrarLibroMasCaro(matriz);

        System.out.println("\n📚 El libro más caro es:");
        System.out.println(masCaro);
    }
}
