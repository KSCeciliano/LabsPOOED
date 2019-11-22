public class Main {
    public static void main(String [] args){
        Ingreso ingreso1 = new Ingreso("Usuario", 675, 500, 50, 100, 25);
        System.out.println("Información "+ingreso1.getUsuario());
        System.out.println("Total de Desechos"+ingreso1.getTotalDeDesechos());
        System.out.println("Papel: "+ingreso1.papel);
        System.out.println("Cartón: "+ingreso1.carton);
        System.out.println("Vidrio: "+ingreso1.vidrio);
        System.out.println("Metal: "+ingreso1.metal);




        Venta venta1 = new Venta("Cliente", 25.0, 30.0, 10.0, 0);
        System.out.println("\n\nVenta");
        System.out.println("Papel: "+venta1.getCantidadDePapel());
        System.out.println("Cartón: "+venta1.getCantidadDeCarton());
        System.out.println("Vidrio: "+venta1.getCantidadDeVidrio());
        System.out.println("Metal: "+venta1.getCantidadDeMetal());


        Maquina maquina1 = new Maquina("TX8000", 333, 10, true);
        System.out.println("\n\nMaquina");
        System.out.println("Modelo: "+maquina1.getModelo());
        System.out.println("Serie: "+maquina1.getSerie());
        System.out.println("Tiempo de Trabajo Continuo: "+maquina1.getTiempoDeTrabajoContinuo());



    }
}
