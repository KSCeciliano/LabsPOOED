/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
public class Televisor extends Dispositivo{
  private int canal;

  public Televisor(){
    canal = 7;
  }

  public Televisor(String name){
    super(name);
    canal = 7;
  }

  public void cambiarCanal(int canal){
    this.canal = canal;
    System.out.println("Se cambió el canal de "+super.getNombre()+" al "+canal);
  }

  public int getCanal(){
    return canal;
  }


}
