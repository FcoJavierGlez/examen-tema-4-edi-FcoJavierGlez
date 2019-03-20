enum Curso {
	PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};

public class Estudiante extends Persona{
	Curso curso;
	protected Estudiante(String nombre, String apellidos, String nif,
			Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.curso = curso;
	}

	
	protected Curso getCurso() {
		return curso;
	}

	
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}
