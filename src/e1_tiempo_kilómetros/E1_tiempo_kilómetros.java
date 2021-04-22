
package e1_tiempo_kilómetros;

import java.util.Scanner;

public class E1_tiempo_kilómetros {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
      //declaracion de variables
      int kilometros;
      double calculo;
      //entrada de datos
        System.out.println("Ingrese los kilometros recorridos");
        kilometros=in.nextInt();
        //procedimiento
        calculo=kilometros*0.45;
        //salida de datos
        System.out.println("su tiempo en llegar es: "+calculo);
        
    }
    
}
