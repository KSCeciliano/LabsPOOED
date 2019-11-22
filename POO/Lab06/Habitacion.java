/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
import java.util.ArrayList;

public abstract class Habitacion{
  protected String nombre;
  protected ArrayList<Dispositivo> dispositivos;

  public Habitacion(String nombre){
    this.nombre = nombre;
    dispositivos = new ArrayList<>();
  }

  public Habitacion(){
    dispositivos = new ArrayList<>();
  }

  public int cantidadDispositivos(){
    return dispositivos.size();
  }

  public Dispositivo getDispositivo(int i){
    return dispositivos.get(i);
  }


  public Dispositivo getDispositivo(String nombreDispositivo){
    for (Dispositivo d: dispositivos) {
      if(d.getNombre() == nombreDispositivo){
        return d;
      }
    }return null;
  }

  public void agregarDispositivo(Dispositivo dispositivo){
    dispositivos.add(dispositivo);
  }

  public void eliminarDispositivo(Dispositivo dispositivo){
    dispositivos.remove(dispositivo);
  }

  public String getNombre(){
    return nombre;
  }




}
