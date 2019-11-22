/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
public class Microondas extends Dispositivo{
  public Microondas(){
    super();
  }

  public Microondas(String nombre){
    super(nombre);
  }

  public void cambiarEstadoMicroondas(boolean activo){
    super.cambiarEstado(activo);
  }

}
