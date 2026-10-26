public class EditorTexto {
	private StringBuilder contenido;
	private StringBuilder anterior;
	
	public EditorTexto() {
		contenido = new StringBuilder();
		anterior = null;
	}

	private void copia() {
		anterior = new StringBuilder(contenido);
	}

	private boolean indice(int pos) {
		return pos >= 0 && pos <= contenido.length();
	}

	private boolean rango(int inicio, int fin) {
		return inicio >= 0 && inicio <=fin && fin <= contenido.length();
	}

	public void escribir (String texto) {
		if (texto == null || texto.isEmpty()) return;
		copia();
		contenido.append(texto);
	}

	public void insertar(int posc, String texto) {
		if (texto == null || texto.isEmpty() || !indice(posc)) return;
		copia();
		contenido.insert(posc, texto);
	}

	public void del(int inicio, int fin) {
		if (!rango(inicio, fin) || inicio == fin) return;
		copia();
		contenido.delete(inicio, fin);
	}

	public void reemplazar(int inicio, int fin, String texto) {
		if (texto == null || !rango(inicio, fin)) return;
		copia();
		contenido.replace(inicio, fin, texto);
	}

	public void undo() {
		if (anterior == null) return;
		contenido = anterior;
		anterior = null;
	}

	public String obtenerTexto() {
		return contenido.toString();
	}
}
