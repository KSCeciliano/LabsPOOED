/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
public class Controlador{
  private Casa hogar;

  public Controlador(){
    hogar = new Casa();
  }

  public Controlador(Casa casa){
    hogar = casa;
  }

  public void cambiarEstadoCasa(boolean activo){
    int cantidadHabitaciones = hogar.cantidadHabitaciones();

    for (int i = 0; i < cantidadHabitaciones; i++) {
      Habitacion habitacionActual = hogar.getHabitacion(i);

            int cantidadDispositivos = habitacionActual.cantidadDispositivos();

            for (int j = 0; j < cantidadDispositivos ; j++) {
                Dispositivo dispositivoActual = habitacionActual.getDispositivo(j);
                dispositivoActual.cambiarEstado(activo);
            }
        }
  }

  public void cambiarEstadoHabitacion(String nombre, boolean activo){
    Habitacion habitacionActual = hogar.getHabitacion(nombre);
    int cantidadDispositivos = habitacionActual.cantidadDispositivos();
    for (int j=0; j<cantidadDispositivos; j++){
      Dispositivo dispositivoActual = habitacionActual.getDispositivo(j);
      dispositivoActual.cambiarEstado(activo);
    }
  }

  public void cambiarEstadoDispositivo(String nombre, boolean activo){
    Dispositivo dispositivoActual = encontrarDispositivo(nombre);
    if(dispositivoActual != null){
      dispositivoActual.cambiarEstado(activo);
    }
  }

  public Dispositivo encontrarDispositivo(String nombre){
    int cantidadHabitaciones = hogar.cantidadHabitaciones();

    for (int i=0; i< cantidadHabitaciones; i++){
      Habitacion habitacionActual = hogar.getHabitacion(i);

      int cantidadDispositivos = habitacionActual.cantidadDispositivos();
      for(int j=0;j<cantidadDispositivos;j++){
        Dispositivo dispositivoActual = habitacionActual.getDispositivo(j);
        if(dispositivoActual.getNombre()==nombre){
          return dispositivoActual;
        }
        else{
        }
      }
    }return null;
  }




}
