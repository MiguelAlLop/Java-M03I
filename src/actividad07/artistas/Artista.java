package actividad07.artistas;

/**
 * @author raulgc
 *
 */
public class Artista {
	
	private String dni, nombre, sexo;
	private int a�oDeNacimiento;
	
	/**Constructor de la clase Artista
	 * @param dni
	 * @param nombre
	 * @param sexo
	 * @param a�oDeNacimiento
	 */
	public Artista(String dni, String nombre, String sexo, int a�oDeNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.sexo = sexo;
		this.a�oDeNacimiento = a�oDeNacimiento;
	}
	
	public Artista() {
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getA�oDeNacimiento() {
		return a�oDeNacimiento;
	}
	public void setA�oDeNacimiento(int a�oDeNacimiento) {
		this.a�oDeNacimiento = a�oDeNacimiento;
	}
}
