/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
import java.util.Scanner;
// Importa Scanner

public class Main {
  public static void main(String[] args) {
    PilaTEC<Integer> pilaTEC = new PilaTEC();

    Scanner scn = new Scanner(System.in);
    // Escaner

    //Pide 5 elementos
    for(int i = 0; i < 5; i++){
      System.out.print("Ingrese un Nùmero Entero: ");
      Integer stackInt = scn.nextInt();
      //Lee input del usuario
      pilaTEC.push(stackInt);
        }

    //Prueba de los metodos push, peel y pop. Y ademàs imprime el resultado final de estos mètodos.
    pilaTEC.push(666);
    System.out.println("Peek: "+pilaTEC.peek());
    pilaTEC.pop();
    System.out.println(pilaTEC.getString());

  }
}
