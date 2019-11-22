/*******************************************************
  Instituto Tecnológico de Costa Rica
  2019 II Semestre
  Profesora: Samanta Ramijan Carmiol
  Estudiante: Kevin Steven Ceciliano Gamboa - 2019023828
 *******************************************************/
class Main {
  public static void main(String[] args) {
    Cuenta c1 = new Cuenta(1122,500000);
    c1.depositarDinero(150000);
    c1.retirarDinero(200000);
    System.out.println(c1.getBalance());
    System.out.println(c1.obtenerTasaDeInteresMensual());
    System.out.println(c1.getFechaDeCreacion());

    Cuenta c2 = new Cuenta(777,250000);
    System.out.println(c1.getBalance());
    System.out.println(c1.obtenerTasaDeInteresMensual());
    System.out.println(c1.getFechaDeCreacion());

    ATM atm = new ATM();
    atm.ATM();


  }
}
