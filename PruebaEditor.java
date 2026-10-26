public class Prueba {
	public static void main(String[] args) {
	EditorTexto editor = new EditorTexto();
	editor.escribir("Hola mundo");
	editor.insertar(5, "gran ");
	editor.del(0, 5);
	System.out.println(editor.obtenerTexto());
	editor.undo();
	System.out.println(editor.obtenerTexto());
	}
}
