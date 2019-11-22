import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Sistema s = new Sistema();

      for (int n = 0; n<6; n++) {
         Oficial oficial = new Oficial("Oficial" + n, n);
         s.addUsuario(oficial);
      }
      Administrador admin = new Administrador("Admin", 777);
      s.addUsuario(admin);



      Scanner as = new Scanner(System.in);

      boolean salir = false;
      int opcion; // Guardaremos la opcion del usuario
      int idInicio;

      while (!salir) {

         System.out.println("Inicio de Sesión");
         System.out.println("Ingrese su ID: ");
         idInicio = as.nextInt();
         s.iniciarSesion(idInicio);

        if("Oficial" == s.tipoUsuario()){
          System.out.println("OFICIAAAAAAALLL");
        }
        if("Administrador" == s.tipoUsuario()){
          System.out.println("ADMINISTRADOOOOOOR");
        }

      }

   }
}