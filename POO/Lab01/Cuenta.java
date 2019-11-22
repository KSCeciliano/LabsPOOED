/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
import java.util.Date;
public class Cuenta {
  //Atributos
  private int id = 0;
  private double balance = 0;
  private double tasaDeInteresAnual = 0;
  private Date fechaDeCreacion = new Date();

  //Constructores
  public Cuenta(){
  }

  public Cuenta(int id, double balance){
    this.id = id;
    this.balance = balance;
    tasaDeInteresAnual = 0.045;
  }

  //Getters
  public int getId(){
    return id;
  }
  public double getBalance(){
    return balance;
  }
  public double getTasaDeInteresAnual(){
    return tasaDeInteresAnual;
  }
  public Date getFechaDeCreacion(){
    return fechaDeCreacion;
  }

  //Setters
  public void setId(int id){
    this.id = id;
  }
  public void setBalance(double balance){
    this.balance = balance;
  }
  public void setTasaDeInteresAnual(double tasaDeInteresAnual){
    this.tasaDeInteresAnual = tasaDeInteresAnual;
  }

  //Métodos
  public double obtenerTasaDeInteresMensual(){
    return calcularInteresMensual();
  }

  public double calcularInteresMensual(){
    return balance * tasaDeInteresAnual;
  }

  public void retirarDinero(double dinero){
    balance = balance - dinero;
  }

  public void depositarDinero(double dinero){
    balance = balance + dinero;
  }


}
