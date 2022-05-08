package cancionero.control;

/**
 * Esta clase provee una forma rapida de almacenar todas las cadenas de texto que se 
 * van a usar en el programa.
 * 
 * Esta clase solo debe contener cadenas, como campos y ningun metodo.
 * Todos sus campos son visibles y es compartida.
 */
public class StringValue {

	public final static String EMPTY_STRING = "";
	public final static String DATE_FORMAT = "YYYY:MM:DD";
	public final static String PROYECT_TITLE = "Cancionero";
	public final static String DATABASE_FILE_NAME_LEGACY = "cancionero_database";
	public final static String DATABASE_FILE_NAME_DEVELOP = "develop_database";
	public final static String DATABASE_REPORT_TEMPLATE_PATH = ".\\CancioneroReport.jrxml";
	
	public final static String ADD_SONG_TEXT = "Agregar";
	public final static String SRCH_SONG_TEXT = "Buscar";
	public final static String SAVE_SONG_TEXT = "Guardar";
	public final static String EMPTY_FIELDS_ERROR_MESSAGE = "Solo puedes dejar vacio el Album y el Artista!.";
	public final static String SAVE_SONG_ERROR_MESSAGE = "Error a la hora de guardar los datos!.";
	public final static String SAVE_SONG_SUCCESS_MESSAGE = "Datos guardados exitosamente!.";
	public final static String NO_SELECTED_SONG_MESSAGE = "No has cargado una cancion en el Visor.";
	public final static String TABLE_TITLE_BORDER = "Mis Canciones";
	public final static String TABLE_DELETEMODE_BORDER = "Modo Eliminar";
	public final static String TABLE_UPDATE_TEXT= "Actualizar";
	public final static String TABLE_SEARCH_TEXTFIELD_TEXT= "Busca canciones, albumes o artistas";
	public static final String TABLE_DELETE_TEXT = "Activa el Modo Eliminar.";
	public final static String TITLE_LIBRARY_TEXT = "Biblioteca de Canciones";
	public final static String TITLE_EDITOR_TEXT = "Editor de Canciones";
	public final static String TITLE_VIEWER_TEXT = "Visualizador de Canciones";
	public final static String FRAME_INTRO_TEXT = "Escuela de Canto y Musica Llanera Cimarron.";
	public final static String LIBRARY_PANEL_TIP = "Visualiza la lista de canciones o busca una cancion.";
	public final static String EDITOR_SONGNAME_TEXT= "Cancion";
	public final static String EDITOR_ARTISTNAME_TEXT= "Artista";
	public final static String EDITOR_ALBUMNAME_TEXT= "Album";
	public final static String EDITOR_ALBUMDATE_TEXT= "Lanzamiento";
	public final static String EDITOR_ALBUMTRACK_TEXT= "Tracks";
	public final static String EDITOR_SONGRHYTHM_TEXT= "Ritmo";
	public final static String EDITOR_SONGBASEC_TEXT= "Tonalidad Base";
	public final static String EDITOR_SONGFAVC_TEXT= "Tonalidad Favorita";
	public final static String EDITOR_SONGCHORD_TEXT= "Acordes y Letra";
	public final static String EDITOR_BTNSAVE_TEXT= "Guardar";
	public final static String EDITOR_PANEL_TIP= "Edita la informacion de las Canciones.";
	
	public final static String VIEWER_BTNEDIT_TIP= "Editar Cancion";
	public final static String VIEWER_BTNREPORT_TIP= "Generar reporte de la Cancion";
	public static final String VIEWER_UNKNOWN_TEXT = "Desconocido.";
	public static final String VIEWER_PANEL_TIP = "Selecciona canciones en la Biblioteca para ver aqui su contenido.";
	
	public final static String SIDEBAR_BTNLIBRARY_TIP= "Mostrar la Biblioteca.";
	public final static String SIDEBAR_BTNEDITOR_TIP= "Mostrar el Editor.";
	public final static String SIDEBAR_BTNVISOR_TIP= "Mostrar el Visualizador.";
	

	public final static String EMOJI_SEARCH = new String(Character.toChars(128269), 0, 2);
	public final static String EMOJI_UPDATE = new String(Character.toChars(128260), 0, 2);
	public final static String EMOJI_EDIT = new String(Character.toChars(128394), 0, 2);
	public final static String EMOJI_DELETE = new String(Character.toChars(128465), 0, 2);
	public final static String EMOJI_PRINT = new String(Character.toChars(128424), 0, 2);
	
	public final static String EMOJI_BOOKS = new String(Character.toChars(128218), 0, 2);
	public final static String EMOJI_MEMO = new String(Character.toChars(128221), 0, 2);
	public final static String EMOJI_GUITAR = new String(Character.toChars(127928), 0, 2);
	public final static String EMOJI_HANDWRITE = new String(Character.toChars(128398), 0, 2);
	public final static String EMOJI_RARECIRCLE = new String(Character.toChars(128795),0, 2);
			
	private StringValue() {
		
	}

}
