import  java.util.Scanner ;
import  java.util.Random ;
público  de clase  EstCiclicas {  
     escáner estático sc = nuevo  escáner ( System . in); // para leer valores del teclado
     Generador aleatorio final  estático = new Random ();  
    public  static  int  random ( int  min , int  max ) {
        return min + (generador . nextInt () * (max - min));
    }
    static  void  contarNumMenorCeroMayorCeroWhile () {
      // Declarar variables
      int numMenEqCero = 0 , numMayCero = 0 , numeroN, cantNum;
      // Datos de entrada
      Sistema . fuera . println ( " Ingrese la cantidad de numeros a evaluar: " );
      cantNum = sc . nextInt ();
      // Proceso
        while (cantNum > = 1 ) {
          numeroN = aleatorio ( - 9 , 9 );
          Sistema . fuera . println (numeroN);
          si (numeroN <= 0 ) {
            numMenEqCero ++ ;
          } más {
            numMayCero ++ ;
          }
          cantNum - ;
          // bloque de código a ejecutar
        }
      // Datos de salida
      Sistema . fuera . println ( " Cantidad de números menores o iguales a cero son: " + numMenEqCero + " \ n La cantidad de números mayores a cero son: " + numMayCero);
    }

  public  static  void  main ( String [] arg ) {
    contarNumMenorCeroMayorCeroWhile ();
  }


}
