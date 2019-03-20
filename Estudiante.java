enum Curso {
	PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};
/**
 * 
 * Clase Estudiante que hereda de la Super Clase Persona. Posee el siguiente campo:
 * <ul>
 * <li>curso</li>
 * </ul>
 * 
 * Posee los siguientes métodos:
 * <ul>
 * <li>Estudiante()</li>
 * <li>getCurso()</li>
 * <li>setCurso()</li>
 * </ul>
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Estudiante extends Persona{
	Curso curso;
	/**
	 * Constructor.
	 * 
	 * @param nombre     Nombre del estudiante.
	 * @param apellidos  Apellidos del estudiante.
	 * @param nif        Nif del estudiante
	 * @param curso      Curso al que pertenece el estudiante.
	 */
	protected Estudiante(String nombre, String apellidos, String nif,
			Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.curso = curso;
	}

	/**
	 * Devuelve el curso en el que está matriculado el estudiante.
	 * 
	 * @return El nombre del curso (String)
	 * 
	 * @author Francisco Javier González Sabariego
	 */
	protected Curso getCurso() {
		return curso;
	}

	
	/**
	 * Asigna el curso en el que se va a matricular el estudiante
	 * 
	 * @param curso  Nombre del curso a matricularse
	 * 
	 * @author Francisco Javier González Sabariego
	 */
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}
