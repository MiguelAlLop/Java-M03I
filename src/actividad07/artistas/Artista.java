package actividad07.artistas;

/**
 * @author raulgc
 *
 */
public class Artista {
	
	private String dni, nombre, sexo;
	private int aņoDeNacimiento;
	
	/**Constructor de la clase Artista
	 * @param dni
	 * @param nombre
	 * @param sexo
	 * @param aņoDeNacimiento
	 */
	public Artista(String dni, String nombre, String sexo, int aņoDeNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.sexo = sexo;
		this.aņoDeNacimiento = aņoDeNacimiento;
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
	public int getAņoDeNacimiento() {
		return aņoDeNacimiento;
	}
	public void setAņoDeNacimiento(int aņoDeNacimiento) {
		this.aņoDeNacimiento = aņoDeNacimiento;
	}
}
