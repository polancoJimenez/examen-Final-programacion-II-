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

        System.out.println("1 => temperaturas Altas");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                contarTemperaturasAltas(int[][] temperaturas);
                break;
            case 2: 
                promedioTemperaturasBajas(int[][] temperaturas);
                break;
            default:
                System.out.println("opcion no valida");
        }
    }

    public static int contarTemperaturasAltas(int[][] matriz){

        int contador = 0;
        for(int numFila = 0; numFila < 4;numFila++){
            for(int numColumna = 0; numColumna < 5;numColumna++){
                if(matriz[numFila][numColumna] > 60){
                    contador++;
                }
                
            }
        }
        return contador;
    }

    public static double promedioTemperaturasBajas(int[][] matriz){

        int contador = 0;
        int promedio = 1;
        for(int numFila = 0; numFila < 4;numFila++){
            for(int numColumna = 0; numColumna < 5;numColumna++){
                if(matriz[numFila][numColumna] < 30){
                    promedio ++;
                    contador += matriz[numFila][numColumna];
                }
            }
            promedio /= contador;
        }
        return promedio;
    }

    public static void imprimirTemperaturasPeligrosas(int[][] matriz){

        int tempeCritica = 0;
        for(int numFila = 0; numFila < 4;numFila++){
            for(int numColumna = 0; numColumna < 5;numColumna++){
                if(matriz[numFila][numColumna] > 75){
                    System.out.println("temperatura critica en " + [numFila][numColumna] + ": la temperatura es de ");
                }
            }
        }
    }
}
