public class Proyecto extends Actividad{
	
	private String indicacion;
	private String fechaEntrega;	
	
	// Constructor vac�o para evitar objetos nulos //
	public Proyecto( ) {
	
		super( );
		indicacion = "";
		fechaEntrega = "00/00/0000";
		super.setTag( "proyecto" );
	}
	
	// Constructor con parametros necesarios de la superclase y de esta clase //
	public Proyecto( String nombre_act, String nombre_mat, double calif, String indic, String fechEntr ){
		
		super( nombre_act, nombre_mat, calif );
		indicacion = indic;
		fechaEntrega = fechEntr;
		super.setTag( "proyecto" );
	}
	
	// Constructor que copia la Tarea de referencia //
	public Proyecto ( Proyecto reference ) {
		
		super( reference.getNombre_actividad( ), reference.getNombre_materia( ), reference.getCalificacion( ) );
		indicacion		= reference.getIndicacion( ); 
		fechaEntrega	= reference.getFechaEntrega( );
		super.setTag( "proyecto" );
	}

	public String getIndicacion() {
		return indicacion;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setIndicacion(String indicacion) {
		this.indicacion = indicacion;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	
	public void printTarea( ){
		
		printActividad( );
		System.out.println( "Indicaciones: 		" + indicacion );
		System.out.println( "Fecha de Entrega: 	" + fechaEntrega );
	}

}