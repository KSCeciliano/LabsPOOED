public class Usuario {
   //Atributos
   protected String nombre;
   protected int id;
   
   
   //Constructores
   public Usuario(){
       
   }

   public Usuario(String nombre, int id){
     this.nombre = nombre;
     this.id = id;
   }
   
   
   //Getters 
   public String getNombre(){
       return nombre;
   }
   
   public int getId(){
       return id;
   }
}
