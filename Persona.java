/**
 * Clase Persona, contiene los campos:
 * <ul>
 * <li>nombre</li>
 * <li>apellidos</li>
 * <li>nif</li>
 * </ul>
 * 
 * Y los métodos:
 * <ul>
 * <li>Persona()</li>
 * <li>getNombre()</li>
 * <li>setNombre()</li>
 * <li>getApellido()</li>
 * <li>setApellido()</li>
 * <li>getNif()</li>
 * <li>setNif()</li>
 * </ul>
 * @author Francisco Javier González Sabariego
 *
 */
public class Persona {

  protected String nombre;
  protected String apellidos;
  protected String nif;
  
  /**
   * Constructor.
   */
  public Persona() {
    super();
  }
  
  /**
   * Devuelve el nombre nombre de la persona.
   * 
   * @return  Nombre de la persona (String)
   * @author Francisco Javier González Sabariego
   */
  protected String getNombre() {
  	return nombre;
  }
  
  /**
   * Asigna el nombre de la persona.
   * 
   * @param nombre  Nombre de la person a asignar (String)
   * 
   * @author Francisco Javier González Sabariego
   */
  protected void setNombre(String nombre) {
  	this.nombre = nombre;
  }
  
  /**
   * Obtén el apellido de la persona.
   * 
   * @return  Apellido de la persona (String)
   */
  protected String getApellidos() {
  	return apellidos;
  }
  
  /**
   * Asigna los apellidos de la persona.
   * 
   * @param apellidos Apellidos a asignar (String)
   * 
   * @author Francisco Javier González Sabariego
   */
  protected void setApellidos(String apellidos) {
  	this.apellidos = apellidos;
  }
  
  /**
   * Obtén el NIF de la persona.
   * 
   * @return  NIF que posee la persona (String)
   * @author Francisco Javier González Sabariego
   */
  protected String getNif() {
  	return nif;
  }
  /**
   * Asigna el NIF que se desea asociar a una persona.
   * 
   * @param nif NIF de la persona (String)
   * @author Francisco Javier González Sabariego
   */
  protected void setNif(String nif) {
  	this.nif = nif;
  }

}