public class Administrador extends Usuario{
    private Trabajo trabajoAsignar;
    private Oficial oficialActualizar;
    
    
    //Constructores
    public Administrador(){
        
    }
    
    public Administrador(String nombre, int id){
        this.id = id;
        this.nombre = nombre;
    }
    
    //Getters
    public Trabajo getTrabajoAsignar(){
        return trabajoAsignar;
    }
    
    public Oficial getOficialActualizar(){
        return oficialActualizar;
    }
    
    
    //Setters
    public void setTrabajoAsignar(Trabajo trabajo){
        trabajoAsignar = trabajo;
    }
    
    public void setOficialActualizar(Oficial oficial){
        oficialActualizar = oficial;
    }
    
    //Metodos
    public void asignarTrabajo(){
        oficialActualizar.addTrabajo(trabajoAsignar);
    }
    
}
