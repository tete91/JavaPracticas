
public class Libros {

	private int id_libro;
	private int id_autor;
	private int id_editorial;
	private String titulo;
	private  String isbn;
	private int paginas;
	
	public Libros() {
		this.id_autor=0;
		this.id_libro=0;
		this.id_editorial=0;
		this.titulo="";
		this.isbn="";
		this.paginas=0;
	}

	public Libros(int id_libro, int id_autor, int id_editorial, String titulo, String isbn, int paginas) {
		super();
		this.id_libro = id_libro;
		this.id_autor = id_autor;
		this.id_editorial = id_editorial;
		this.titulo = titulo;
		this.isbn = isbn;
		this.paginas = paginas;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public int getId_editorial() {
		return id_editorial;
	}

	public void setId_editorial(int id_editorial) {
		this.id_editorial = id_editorial;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libros [id_libro=" + id_libro + ", id_autor=" + id_autor + ", id_editorial=" + id_editorial
				+ ", titulo=" + titulo + ", isbn=" + isbn + ", paginas=" + paginas + "]";
	}
	
	
	
}
