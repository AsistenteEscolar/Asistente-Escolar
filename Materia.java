public class Materia {
	
	private String nombre_materia;
	private String nombre_profesor;
	private String salon;
	private String dia;
	private String hora_inicio;
	private String hora_final;
	//private Rubrica cotejo;
	//private double promedio;
	//private ListaActividades listaA;
	
	public Materia( ){
		
		nombre_materia  = "";
		nombre_profesor = "";
		salon 			= "";		
		dia 			= "";
		hora_inicio 	= "";
		hora_final 		= "";
//		setCotejo( 20.0, 20.0, 60.0);
		
	}

	public Materia ( String imateria, String iprofesor, String isalon, String idia, String ihorai, String ihoraf, double tareas, double proyectos, double examenes ){
		
		nombre_materia  = imateria;
		nombre_profesor = iprofesor;
		salon 			= isalon;		
		dia 			= idia;
		hora_inicio 	= ihorai;
		hora_final 		= ihoraf;		
		//setCotejo( tareas, proyectos, examenes );
	}
	
	// Getters //
	
	//public Rubrica getCotejo() {
		
		//return cotejo;
	//}
	
	public String getNombre_materia( ) {
		
		return nombre_materia;
	}
	
	public String getNombre_profesor() {
		
		return nombre_profesor;
	}

	public String getSalon() {
		
		return salon;
	}

	public String getDia() {
		
		return dia;
	}

	public String getHora_inicio() {
		
		return hora_inicio;
	}

	public String getHora_final() {
		
		return hora_final;
	}

//	public double getPromedio() {
	//	return promedio;
	//}
//
//	public ListaActividades getListaA() {
//		return listaA;
//	}

	// Setters //
	public void setNombre_materia( String nombre_materia){
		
		this.nombre_materia = nombre_materia;
	}
	
	public void setNombre_profesor(String nombre_profesor) {
		
		this.nombre_profesor = nombre_profesor;
	}

	public void setSalon(String salon) {
		
		this.salon = salon;
	}

	public void setDia(String dia) {
		
		this.dia = dia;
	}

	public void setHora_inicio(String hora_inicio) {
		
		this.hora_inicio = hora_inicio;
	}

	public void setHora_final(String hora_final) {
		
		this.hora_final = hora_final;
	}

//	public void setCotejo( double tareas, double proyectos, double examenes ) {
//		
//		if( tareas + proyectos + examenes == 100 ){
//			
//			cotejo.setValor_tareas( tareas );
//			cotejo.setValor_proyectos( proyectos );
//			cotejo.setValor_examenes( examenes);
//		} else {
//			
//			cotejo.setValor_tareas( 20.0 );
//			cotejo.setValor_proyectos( 20.0 );
//			cotejo.setValor_examenes( 60.0 );
//		}
//		
//	}
//
//	public double promedio( Rubrica ref_cotejo, ListaActividades ref_lista ) {
//		
//		double tareas = 0;
//		double proyectos = 0;
//		double examenes = 0;
//		
//		int t = 0;
//		int p = 0;
//		int e = 0;
//		
//		double prom_t = 0;
//		double prom_p = 0;
//		double prom_e = 0;
//		
//		for ( int i = 0; i < ref_lista.getNoActividades( ); i++ ){
//			
//			// Si la actividad en la lista de actividades tiene el tag de "tareas" //
//			if( ref_lista.getListaActividades( )[i].getTag( ).equals( "tarea" ) ){
//				
//				// Suma a la variable tareas la calificación obtenida en esa tarea y aumento el contador de cantidad de tareas//
//				tareas += ref_lista.getListaActividades()[i].getCalificacion( );
//				t++;
//			}
//			
//			// Si la actividad en la lista de actividades tiene el tag de "proyecto" //
//			if( ref_lista.getListaActividades( )[i].getTag( ).equals( "proyecto" ) ){
//				
//				// Suma a la variable proyectos la calificación obtenida en ese proyecto y aumento el contador de cantidad de proyectos//
//				proyectos += ref_lista.getListaActividades()[i].getCalificacion( );
//				p++;
//			}
//
//			// Si la actividad en la lista de actividades tiene el tag de "examen" //
//			if( ref_lista.getListaActividades( )[i].getTag( ).equals( "examen" ) ){
//				
//				// Suma a la variable examenes la calificación obtenida en ese examen y aumento el contador de cantidad de examenes//
//				examenes += ref_lista.getListaActividades()[i].getCalificacion( );
//				e++;
//			}
//			
//		}
//			
//			// El promedio de cada actividad es igual al cociente de la suma de las calificaciones obtenidas en cada actividad, entre la cantidad de actividades // 
//			
//			prom_t = tareas		/ t;
//			prom_p = proyectos	/ p;			
//			prom_e = examenes	/ e;			
//			
//			// Regla de tres para encontrar el puntaje final de cada elemento de la lista de cotejo // 
//	
//			double final_t = ( prom_t * cotejo.getValor_tareas() ) 	  / 100;
//			double final_p = ( prom_p * cotejo.getValor_proyectos() ) / 100;
//			double final_e = ( prom_p * cotejo.getValor_proyectos() ) / 100;
//			
//			return final_t + final_p + final_e;
//			
//		}
//
//	public void setListaA(ListaActividades listaA) {
//		
//		this.listaA = listaA;
//	}
	
	public void printMateria( ) {
		
		  System.out.println( "Materia:	" + nombre_materia );
		  System.out.println( "Docente:	" + nombre_profesor );
		  System.out.println( "Salon:		" + salon);
		  System.out.println( "Horario:	" + dia + " " + hora_inicio + " - " + hora_final );
		}
		
	
}
