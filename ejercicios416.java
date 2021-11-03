import java.util.Scanner;

public class ejercicios416 {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    //definir variables
    int n;

    //datos de salida 
    System.out.println("ingrese un numero entero positivo");
    n=sc.nextInt();

    //proceso
    if (n<0){
      int resultado = (int)(Math.pow(n, 3));
      //datos de salida
      System.out.println("el cubo del numero "+n+" es: "+resultado);
    }
    else{
      System.out.println("el numero ingresado no es correcto");
    }
  }
}