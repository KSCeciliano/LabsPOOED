import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Trabajo {
    //Atributos
    private String nombre;
    private String ubicacion;
    private Date inicio;
    private Boolean continuo;
    private Date fin;
    
    DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
    
    
    //Constructores
    public Trabajo(){
        
    }
    
    public Trabajo(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    
    //Getters
    public String getNombre(){ return nombre; }
    
    public String getUbicacion(){ return ubicacion; }
    
    public Date getInicio(){ return inicio; }
    
    public Boolean getContinuo(){ return continuo; }
    
    public Date getFin(){ return fin; }
    
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    
    public void setInicio(String inicio) throws ParseException{
        this.inicio = format.parse(inicio);        
    }
    
    public void SetContinuo(Boolean continuo){
        this.continuo = continuo;        
    }
    
    public void setFin(String fin) throws ParseException{
        this.fin = format.parse(fin);   
    }
}
