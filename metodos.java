import java.util.Scanner;

public class metodos {

    Scanner teclado = new Scanner(System.in);

    // Registrar libros en la matriz
    public objLibro[][] registrarLibros(objLibro[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                objLibro l = new objLibro();

                System.out.println("\nLibro en posición [" + i + "][" + j + "]");

                System.out.print("Ingrese título: ");
                l.setTitulo(teclado.nextLine());

                System.out.print("Ingrese autor: ");
                l.setAutor(teclado.nextLine());

                System.out.print("Ingrese precio: ");
                l.setPrecio(Double.parseDouble(teclado.nextLine()));

                matriz[i][j] = l;
            }
        }

        return matriz;
    }

    // Encontrar libro con mayor precio
    public objLibro encontrarLibroMasCaro(objLibro[][] matriz) {

        objLibro libroMasCaro = null;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] != null) {

                    if (libroMasCaro == null
                            || matriz[i][j].getPrecio() > libroMasCaro.getPrecio()) {

                        libroMasCaro = matriz[i][j];
                    }
                }
            }
        }

        return libroMasCaro;
    }
}


