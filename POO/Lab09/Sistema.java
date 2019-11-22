import java.util.ArrayList;

class Sistema{
  //Atributos
  private Usuario usuarioSesion;
  static ArrayList<Usuario> usuarios = new ArrayList();

  //Metodos
  public void iniciarSesion(int id){
       usuarios.forEach((Usuario usuario) -> {
           if (usuario.getId() == id){
               System.out.println("Bienvenido " + usuario.getNombre());
               String tipoUsuario = usuario.getClass().getName();
               System.out.println("Usted es un "+tipoUsuario);
               usuarioSesion = usuario;
           }else{
           }
      });
      //RETURN LUEGO DE RECORRER LA LISTA
  }

  public String tipoUsuario(){
      String tipoUsuario = usuarioSesion.getClass().getName();
      return tipoUsuario;
  }

  public void cerrarSesion(){

  }

    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

   
}