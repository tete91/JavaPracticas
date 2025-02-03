
public class Editorial {

	private int id_editorial;
	private String nombre_editorial;
	private String nacionalidad_editorial;
	
	public Editorial() {
		this.id_editorial=0;
		this.nombre_editorial="";
		this.nacionalidad_editorial="";
	}

	public Editorial(int id_editorial, String nombre_editorial, String nacionalidad_editorial) {
		super();
		this.id_editorial = id_editorial;
		this.nombre_editorial = nombre_editorial;
		this.nacionalidad_editorial = nacionalidad_editorial;
	}

	public int getId_editorial() {
		return id_editorial;
	}

	public void setId_editorial(int id_editorial) {
		this.id_editorial = id_editorial;
	}

	public String getNombre_editorial() {
		return nombre_editorial;
	}

	public void setNombre_editorial(String nombre_editorial) {
		this.nombre_editorial = nombre_editorial;
	}

	public String getNacionalidad_editorial() {
		return nacionalidad_editorial;
	}

	public void setNacionalidad_editorial(String nacionalidad_editorial) {
		this.nacionalidad_editorial = nacionalidad_editorial;
	}

	@Override
	public String toString() {
		return "Editorial [id_editorial=" + id_editorial + ", nombre_editorial=" + nombre_editorial
				+ ", nacionalidad_editorial=" + nacionalidad_editorial + "]";
	}
	
	
	
	
}
