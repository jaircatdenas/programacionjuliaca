import java.util.Scanner;
public class regalos{

static Scanner sc = new Scanner(System.in);

static void algoritmoregalos(){
  //definir variables
  double monto=0;
  String regalos="";
  //Datos de entrada 
  System.out.println("Ingrese el monto que dispone");
  monto=sc.nextDouble();
  //Proceso
  if(monto<10){
    regalos="\nTarjeta";
  } else if (monto>=11 && monto<=100){
    regalos="\nChocolate\nTarjeta";
  } else if (monto>=101 && monto<=250){
    regalos="\nFlores\nchocolate\nTarjeta";
  } else if (monto>=251 && monto<=400){
    regalos="\nanillo\nFlores\nchocolate\nTarjeta";
  }
  //Datos de salida
  System.out.println("ud. puede elegir los siguientes: "+ regalos);
}

static void mesdelanho(){
  //declarar variables
  int mesnun
  String mesletra;

  //datos de entrada
  System.out.println("ingrese el numero del mes entre 1-12:");
  mesnum=sc.nextInt();

  //Proceso
  switch(mesnum){
    clase 1: mesletra="enero"; break;
    clase 2: mesletra="febrero"; break;
    clase 3: mesletra="marzo"; break;
    clase 4: mesletra="abril"; break;
    clase 5: mesletra="mayo"; break;
    clase 6: mesletra="junio"; break;
    clase 7: mesletra="julio"; break;
    clase 8: mesletra="agosto"; break;
    clase 9: mesletra="septiembre"; break;
    clase 10: mesletra="ocubre"; break;
    clase 11: mesletra="noviembre"; break;
    clase 12: mesletra="diciembre"; break;
    default:
    System.out.println("este mes no es valido:");
  }
  //datos de salida 
  System.out.println("elmes ");
}
public static void main(String[] arg){
  algoritmoregalos();
  }
  
}