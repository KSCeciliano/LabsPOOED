/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
import java.util.ArrayList;

public class Casa{
  private ArrayList<Habitacion> habitaciones;

  public Casa(){
    habitaciones = new ArrayList<>();
  }

  public void agregarHabitacion(Habitacion habitacion){
    habitaciones.add(habitacion);
  }

  public int cantidadHabitaciones(){
    return habitaciones.size();
  }

  public Habitacion getHabitacion(int i){
    return habitaciones.get(i);
  }

  public Habitacion getHabitacion(String nombreHabitacion){
    for (Habitacion h: habitaciones) {
      if(h.getNombre() == nombreHabitacion){
        return h;
      }
    }return null;
  }








}
