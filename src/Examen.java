import java.util.Scanner;
public class Examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //matriz
        int[][] temperaturas = new int[4][5];
        //exponer la fila
        for(int fila = 1; fila < 4; fila++){
            //exponer la columna
            for(int columna = 0; columna < 5; columna++){
                //pedir el valor de cada una
                System.out.println("ingresa el valor de la posicion => " + columna
                + " fila => " + fila);
                int temperatura = scanner.nextInt();
            }
        }
    }

    public static int contarTemperaturasAltas(int[][] matriz){

        for(int numFila = 0; numFila < matriz;numFila++){
            for(int numColumna = 0; numColumna < 5;numColumna++){
                
            }
        }
        return ;
    }
}
