/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
class Main {
  public static void main(String[] args) {
    Casa casita = new Casa();

    Cocina cocina = new Cocina("Cocina");
    Cuarto cuartoPapa = new Cuarto("Cuarto Papá");
    Cuarto cuartoKevin = new Cuarto("Cuarto Kevin");

    casita.agregarHabitacion(cuartoPapa);
    casita.agregarHabitacion(cocina);
    casita.agregarHabitacion(cuartoKevin);

    Televisor tv1 = new Televisor("TV Kevin");
    Microondas micro = new Microondas("Micro Cocina");
    Bombilla bombilla1 = new Bombilla("Bombilla Papá");

    cuartoKevin.agregarDispositivo(tv1);
    cuartoPapa.agregarDispositivo(bombilla1);
    cocina.agregarDispositivo(micro);

    Controlador control = new Controlador(casita);

    System.out.println("Se van a encender todos los dispositivos de la Casa");
    control.cambiarEstadoCasa(true);

    System.out.println("Se van a apagar todos los dispos de la Casa");
    control.cambiarEstadoCasa(false);
  }
}
