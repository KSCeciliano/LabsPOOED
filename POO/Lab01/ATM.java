/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
  //Atributos
  static Scanner as = new Scanner(System.in);
  static ArrayList<Cuenta> cuentas = new ArrayList();
  static boolean login;
  static Cuenta cuentaSesion;
  static double dinero;

  public static void ATM() {
    //Inicialización de cuentas
    for(int i=0; i<10; i++){
      Cuenta c = new Cuenta(i,100000);
      cuentas.add(c);
      }
     while(true){
        while(!login){
          System.out.print("\n\nIngrese su ID: ");
          int id = as.nextInt();
          iniciarSesion(id);
          }
        while(login){
          System.out.println("\nMenú Principal\n1. Ver el balance actual\n2. Retirar Dinero\n3. Depositar Dinero\n4. Salir");
          System.out.print("Ingrese su selección. ");
          int opcion = as.nextInt();
          switch(opcion){
            case 1:
              System.out.println("El balance es de "+cuentaSesion.getBalance());
              break;
            case 2:
              System.out.print("Ingrese el balance que desea Retirar: ");
              dinero = as.nextDouble();
              cuentaSesion.retirarDinero(dinero);
              break;
            case 3:
              System.out.print("Ingrese el balance que desea Depositar: ");
              dinero = as.nextDouble();
              cuentaSesion.depositarDinero(dinero);
              break;
            case 4:
              login = false;
              break;
            default:
              System.out.println("Inserte una opción valida.");
              break;
          }

        }



    }


  }


  public static void iniciarSesion(int id){
       cuentas.forEach((Cuenta cuenta) -> {
           if (cuenta.getId() == id){
             login = true;
             cuentaSesion = cuenta;
           }else{
           }
      });
  }



}
