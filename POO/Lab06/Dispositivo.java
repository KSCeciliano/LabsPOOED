/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
public abstract class Dispositivo{
  protected String nombre;
  protected boolean activo;

  public Dispositivo(){
    activo = false;
  }

  public Dispositivo(String nombre){
    this.nombre = nombre;
    activo = false;
  }

  public void cambiarEstado(boolean activo){
    if(activo){
      activo = true;
    }else{
      activo = false;
    }
  }

  public String getNombre(){
    return nombre;
  }

  public boolean activo(){
    return activo;
  }






}
