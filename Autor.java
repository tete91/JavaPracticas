
public class Autor {

	private int id_autor;
	private String nombre_autor;
	private String apellidos_autor;
	private String nacionalidad;
	private String fecha;
	
	public Autor() {
		this.id_autor=0;
		this.nombre_autor="";
		this.apellidos_autor="";
		this.nacionalidad="";
		this.fecha="";
	}
	
	public Autor(int id, String nombre, String apellidos, String nacionalidad, String fecha) {
		this.id_autor = id;
		this.nombre_autor=nombre;
		this.apellidos_autor=apellidos;
		this.nacionalidad=nacionalidad;
		this.fecha=fecha;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getNombre_autor() {
		return nombre_autor;
	}

	public void setNombre_autor(String nombre_autor) {
		this.nombre_autor = nombre_autor;
	}

	public String getApellidos_autor() {
		return apellidos_autor;
	}

	public void setApellidos_autor(String apellidos_autor) {
		this.apellidos_autor = apellidos_autor;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Autor [id_autor=" + id_autor + ", nombre_autor=" + nombre_autor + ", apellidos_autor=" + apellidos_autor
				+ ", nacionalidad=" + nacionalidad + ", fecha=" + fecha + "]";
	}
	
	
	
}
