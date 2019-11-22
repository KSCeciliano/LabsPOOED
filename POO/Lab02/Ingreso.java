public class Ingreso {
    private String usuario;
    private double totalDeDesechos;
    double papel;
    double carton;
    double vidrio;
    double metal;
    private double desechosNoReciclables;


    ///Constructores
    public Ingreso(){
        papel = 0;
        carton = 0;
        vidrio = 0;
        metal = 0;
        totalDeDesechos = 0;
    }

    public Ingreso(String usuario, double TotalDeDesechos,
                   double papel, double vidrio, double metal, double carton){
        this.usuario = usuario;
        this.totalDeDesechos = TotalDeDesechos;
        this.papel = papel;
        this.vidrio = vidrio;
        this.metal = metal;
        this.carton = carton;
    }



    //Getters
    public String getUsuario(){
        return usuario;
    }

    public double getTotalDeDesechos(){
        return totalDeDesechos;
    }

    public double getPapel(){
        return papel;
    }

    public double getCarton(){
        return carton;
    }

    public double getVidrio(){
        return vidrio;
    }

    public double getMetal(){
        return metal;
    }

    public double getDesechosNoReciclables(){
        return desechosNoReciclables;
    }


    //Setters
    public void setTotalDeDesechos(double totalDeDesechos){
        this.totalDeDesechos = totalDeDesechos;
    }

    public void setPapel(double papel){
        this.papel = papel;
    }

    public void setCarton(double carton){
        this.carton = carton;
    }

    public void setVidrio(double vidrio){
        this.vidrio = vidrio;
    }

    public void setMetal(double metal){
        this.metal = metal;
    }

    public void setDesechosNoReciclables(double desechosNoReciclables){
        this.desechosNoReciclables = desechosNoReciclables;
    }

    //Métodos
    public void ingresarMateriales(double totalDeDesechos, double kgDePapel,
                                   double kgDeCarton, double kgDeVidrio,
                                   double kgDeMetal, double kgDesechosNoReciclables){
        this.totalDeDesechos = this.totalDeDesechos + totalDeDesechos;
        this.papel = this.papel + kgDePapel;
        this.carton = this.carton + kgDeCarton;
        this.vidrio = this.vidrio + kgDeVidrio;
        this.metal = this.metal + kgDeMetal;
        this.desechosNoReciclables = this.desechosNoReciclables + kgDesechosNoReciclables;
    }
}
