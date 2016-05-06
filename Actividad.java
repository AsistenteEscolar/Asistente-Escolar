public class Actividad {

	private String nombre_actividad;
	private String nombre_materia;
	private double calificacion;
	private String tag;
	
	// Constructor sin params para evitar un objeto nulo //
	public Actividad( ){
		
		nombre_actividad = "";
		nombre_materia	 = "";
		calificacion 	 = 10;

	}
	

	// Constructor con los atributos //
	public Actividad( String nombre_act, String nombre_mat, double calif  ){
		
		nombre_actividad = nombre_act;
		nombre_materia	 = nombre_mat;
		calificacion 	 = calif;
	}
	// Recibe un objeto Actividad, Tarea o Examen y copia sus valores //
	public Actividad( Actividad reference ){
		
		this.nombre_actividad = reference.nombre_actividad;
		this.nombre_materia	 = reference.nombre_materia;
		this.calificacion 	 = reference.calificacion;
	}
	
	public String getNombre_actividad() {

		return nombre_actividad;
	}

	public String getNombre_materia() {
		
		return nombre_materia;
	}

	public double getCalificacion() {
		
		return calificacion;
	}

	public void setNombre_actividad( String nombre_actividad ) {
		
		this.nombre_actividad = nombre_actividad;
	}

	public void setNombre_materia(String nombre_materia) {
		
		this.nombre_materia = nombre_materia;
	}

	public void setCalificacion(double calificacion) {
		
		this.calificacion = calificacion;
	}	

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public void printActividad( ){
		
		System.out.println( "Actividad:		" + nombre_actividad );
		System.out.println( "Materia:		" + nombre_materia );
		System.out.println( "Calificación:	" + calificacion );
	}
	

}
