import java.util.Scanner;
public class EstCondicional{

static Scanner sc = new Scanner(System.in);

    static void ventaLapices(){
    //Definir variable
    int cantidadlap;
    double pago;
    //Datos entrada
    System.out.println("Ingrese la cantidad de lapices a comprar:");
    cantidadlap=sc.nextInt();
    //Proceso
    if (cantidadlap>=1000){
      pago=cantidadlap*0.85;
    } else {
      pago=cantidadlap*0.90;
    }
    //Datos de Salida
    System.out.println("El pago a realizar es:"+pago);
  } 
  public static void main(String[] args) {
    System.out.println("Hello World");
    ventaLapices();   
  }
  
}