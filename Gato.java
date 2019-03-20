/**
 * Clase Gato. Posee los siguientes método:
 * <ul>
 * <li>Gato()</li>
 * <li>maullar()</li>
 * </ul>
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Gato {

  private String maulla;
  
  /**
   * Constructor
   * 
   * @author Francisco Javier González Sabariego
   */
  protected Gato() {
				
	}
  
  /**
   * Hace maullar al gato.
   * 
   * @author Francisco Javier González Sabariego
   */
	void maullar() {
		maulla = "Miau";
    System.out.println(maulla);
	}

}
