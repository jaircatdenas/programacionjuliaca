import java.util.Scanner;
public class meses{
  static Scanner sc = new Scanner(System.in);
static void mesdelanho(){
  //declarar variables
  int mesnum;
  String mesletra="";

  //datos de entrada
  System.out.println("ingrese el numero del mes entre 1-12:");
  mesnum=sc.nextInt();

  //Proceso
  switch(mesnum){
    case 1: mesletra="enero"; break;
    case 2: mesletra="febrero"; break;
    case 3: mesletra="marzo"; break;
    case 4: mesletra="abril"; break;
    case 5: mesletra="mayo"; break;
    case 6: mesletra="junio"; break;
    case 7: mesletra="julio"; break;
    case 8: mesletra="agosto"; break;
    case 9: mesletra="septiembre"; break;
    case 10: mesletra="ocubre"; break;
    case 11: mesletra="noviembre"; break;
    case 12: mesletra="diciembre"; break;
    default:
    System.out.println("este mes no es valido:");
  }
  //datos de salida 
  System.out.println("el mes "+mesnum+" es:"+mesletra);
}
public static void main(String[] arg){
  mesdelanho();
  }
  
}
