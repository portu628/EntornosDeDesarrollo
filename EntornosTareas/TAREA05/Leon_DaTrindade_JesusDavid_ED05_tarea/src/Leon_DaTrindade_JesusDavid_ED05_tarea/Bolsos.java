package Leon_DaTrindade_JesusDavid_ED05_tarea;

/**
 * Especificación de un tipo de producto determinado (Bolsos) que se venderá a través de la tienda.
 */
public class Bolsos {

	private String tipo;

	/**
	 * 
	 * @param articulo
	 * @param tipo
	 */
	public Bolsos(Articulos articulo, String tipo) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		return this.tipo;
	}

	public Articulos getArticulo() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 * @param articulo
	 */
	public void setArticulo(Articulos articulo) {
		throw new UnsupportedOperationException();
	}

}