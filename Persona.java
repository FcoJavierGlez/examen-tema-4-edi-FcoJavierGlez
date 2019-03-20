
public class Persona {

  protected String nombre;
  protected String apellidos;
  protected String nif;

  public Persona() {
    super();
  }

  protected String getNombre() {
  	return nombre;
  }

  protected void setNombre(String nombre) {
  	this.nombre = nombre;
  }

  protected String getApellidos() {
  	return apellidos;
  }

  protected void setApellidos(String apellidos) {
  	this.apellidos = apellidos;
  }

  protected String getNif() {
  	return nif;
  }

  protected void setNif(String nif) {
  	this.nif = nif;
  }

}