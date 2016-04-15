public class Materia {
	
	private String nombre_materia;
	private String nombre_profesor;
	private BufferedReader br = new BufferedReader( InputStreamReader( System.in ) );
	
	public Materia( ) {
		
		getMateria( );
	}
	public Materia( String n_materia ) {
		
		getMateria( n_materia );
	}
	public Materia( String n_materia, String n_profesor ) {
		
		getMateria( n_materia, n_profesor );
	}
	public Materia( int x ) {
	}

	public void getMateria( ) {

		// Captura el nombre de la materia y verifica que no exista la excepción . Tira error si se cumple la excepción. //
		try {

			System.out.println( "Define el nombre de la materia: " );
			this.nombre_materia = br.readLine( );
		} catch ( IOException ioe ) {

			System.out.println( "XXXXX ERROR: SE HA INTERRUMPIDO EL FLUJO DE ENTRADA. XXXXX" );
		}

		// Captura el nombre del profesor y verifica que no exista la excepción . Tira error si se cumple la excepción. //
		try {

			System.out.println( "Define el nombre del nombre_profesor: " );
			this.nombre_profesor = br.readLine( );
		} catch ( IOException ioe ) {

			System.out.println( "XXXXX ERROR: SE HA INTERRUMPIDO EL FLUJO DE ENTRADA. XXXXX" );
		}
	}
	public void getMateria( String n_materia ) {

		// Captura el nombre de la materia y verifica que no exista la excepción . Tira error si se cumple la excepción. //
		this.nombre_materia = n_materia;

		// Captura el nombre del profesor y verifica que no exista la excepción . Tira error si se cumple la excepción. //
		try {

			System.out.print( "Define el nombre del nombre de la materia: " );
			this.nombre_profesor = br.readLine();
			System.out.println();
			} catch ( IOException ioe ) {

			System.out.println( "XXXXX ERROR: SE HA INTERRUMPIDO EL FLUJO DE ENTRADA. XXXXX" );
			}
	}
	public void getMateria( String n_materia, n_profesor ) {

		// Captura el nombre de la materia y verifica que no exista la excepción . Tira error si se cumple la excepción. //
		this.nombre_materia  = n_materia;
		this.nombre_profesor = n_profesor;
	}

	// Este método no hace nada. Sólo se utiliza al inicio del programa para crear el navegador. //
	public void getMateria( int x ) {
	}





}