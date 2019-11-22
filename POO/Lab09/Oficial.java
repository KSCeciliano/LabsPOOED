import java.util.ArrayList;

public class Oficial extends Usuario{
    //Atributos
    private static ArrayList<Trabajo> trabajosAsignados = new ArrayList();
    
    
    //Constructores
    public Oficial(){
        
    }
    
    public Oficial(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }
    
    //Getters
    public ArrayList<Trabajo> getTrabajosAsignados(){
        return trabajosAsignados;
    }
    
    //Setters
    
    
    //Metodos
    public void addTrabajo(Trabajo trabajo){
        trabajosAsignados.add(trabajo);
    }
}
