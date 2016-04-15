public class IniciarPrograma {

	public static void main( String[] args throws IOException ) {

		// * Creamos a nuestros navegadores. //
		Menu nav_menu              = new Menu( 0 );
		Horario nav_horario        = new Horario( 0 );
		ListaDeMaterias nav_lm	   = new ListaDeMaterias( 0 );
		Calificacion nav_califi    = new Calificacion( 0 );
		Actividad nav_activ        = new Actividad( 0 );
		User nav_usr               = new User( 0 );
		Login login       		   = new Login( 0 );
		Database db 			   = new Database( 0 );
		General nav_gen			   = new General;

		// *Variables de control. //
		int opcion;
		boolean verificador = login.interfazIniciarSesion( );

		// * Si en algún momento gusta salirse el usuario , se cambia el verificador //
	   //  a falso y se termina el programa. 										//
		do {

			// * Se ejecuta el método interfazMenu y este regresa un valor entero. //
		   //	 Se ejecuta la opción que el usuario haya elegido. 				  //
			opcion = nav_menu.interfazMenu( );
		
			switch ( opcion ) {

				case 1: nav_horario.interfazHorario( ); 	  break; 
				case 2: nav_lm.interfazLM( ); 				  break;
				case 3:	nav_activ.interfazActividades( ); 	  break;  
				case 4:	nav_califi.interfazCalificaciones( ); break;
				case 5: verificador = false;				  break;
			}		
		} while ( verificador );

		// * nav_gen.terminarPrograma ( en la línea 34 ) guarda la información, //
		//   cierra el flujo de la base de datos y elimina los navegadores.  	//
		nav_gen.terminarPrograma( );
		}
	}
}