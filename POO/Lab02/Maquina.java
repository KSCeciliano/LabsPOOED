public class Maquina {
    private String modelo;
    private int serie;
    private int tiempoDeTrabajoContinuo;
    private boolean iniciada;

    public Maquina(String modelo, int serie, int tiempoDeTrabajoContinuo, boolean iniciada){
        this.modelo = modelo;
        this.serie = serie;
        this. tiempoDeTrabajoContinuo = tiempoDeTrabajoContinuo;
        this.iniciada = iniciada;
    }

    //Getters
    public String getModelo() {
        return modelo;
    }

    public int getSerie() {
        return serie;
    }

    public int getTiempoDeTrabajoContinuo() {
        return tiempoDeTrabajoContinuo;
    }


    public void iniciarMaquina(){
        iniciada = true;
    }

    }
