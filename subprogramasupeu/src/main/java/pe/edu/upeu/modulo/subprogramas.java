package pe.edu.upeu.modulo;
import java.util.Scanner;

public class subprogramas{

 public String nombre="Dario";
 private String dni=""; 
 Scanner sc=new Scanner(System.in);
 

public void saludo(){
  System.out.println("Hola "+nombre);
}

public void otrosaludo(){
  String apellidos="Perez";
  System.out.println("hola "+nombre+" "+apellidos);
}

}