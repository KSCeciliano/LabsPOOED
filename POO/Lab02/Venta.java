public class Venta {
    private String cliente;
    private double cantidadDePapel;
    private double cantidadDeVidrio;
    private double cantidadDeMetal;
    private double cantidadDeCarton;

    public Venta(String cliente,double cantidadDePapel,double cantidadDeVidrio,
                 double cantidadDeMetal, double cantidadDeCarton ){
        this.cliente = cliente;
        this.cantidadDePapel = cantidadDePapel;
        this.cantidadDeVidrio = cantidadDeVidrio;
        this.cantidadDeMetal = cantidadDeMetal;
        this.cantidadDeCarton = cantidadDeCarton;
    }

    //Getters
    public double getCantidadDePapel() {
        return cantidadDePapel;
    }

    public double getCantidadDeVidrio() {
        return cantidadDeVidrio;
    }

    public double getCantidadDeMetal() {
        return cantidadDeMetal;
    }

    public double getCantidadDeCarton() {
        return cantidadDeCarton;
    }


    public double descontarMateriales(double papelComprado, double cartonComprado, double vidrioComprado, double metalComprado){
        cantidadDePapel = cantidadDePapel - papelComprado;
        return 0;
    }

 }
