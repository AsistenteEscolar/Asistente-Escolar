
public class ListaMaterias {
	
	// Una lista de materias contiene un arreglo de Materias como atributo //
	private int noMaterias;
	private Materia[] listaMaterias;
	
	// Nuestro constructor sin params crea un arreglo de materias de 7 materias por default. //
	public ListaMaterias( ){
		
		noMaterias = 0;
		listaMaterias = new Materia[ noMaterias ];
	}

	// Nuestro constructor sin params crea un arreglo de materias de 7 materias por default //
	public ListaMaterias( int n ){
		
		noMaterias = n;
		listaMaterias = new Materia[ noMaterias ];
	}
	

	public Materia materiaEn( int index ){
		
		// El índice debe ser mayor que 0 y menor que la cantidad de alumnos //
		if ( index < 0 || index > noMaterias ){
			
			// De lo contrario, regresa un usuario nulo //
			return new Materia( );
			
			// Si el indice es correcto, regresa el valor indicado de la lista // 
		} else return listaMaterias[ index ];

	}

	public void agregarMateria( Materia reference ){
		
		//Incrementa el tamaño del arreglo de materias en uno//
		masMateria( );
		
		// Guarda la materia en la última casilla del arreglo //
		guardarMateriaEn( noMaterias - 1, reference);
	}

	public void masMateria( ){
		
		//incrementa la cantidad de Materias //
		noMaterias++;
		
		// crea un arreglo temporal con el nuevo tamaño //
		Materia[ ] temp = new Materia[ noMaterias];
		
		// Itera la lista de materias y almacena sus materias en el arreglo temporal //
		for( int i = 0; i < listaMaterias.length; i++ ){
			
			temp[i] = listaMaterias[i];
		}
	
		// la lista de materias recibe el tamaño y valor del arreglo nuevo //. 
		listaMaterias = temp;
		
	}

	public void menosMateria( ) {
		
		
		// Variable auxiliar //
		int aux_1 = 0;
		// Decrementamos la cantidad de Materias //
		noMaterias--;
		// Creamos un arreglo con noMaterias que ahora es menor. //
		Materia[] temp = new Materia[noMaterias];

		// el arreglo temporal almacena los objetos de la listaMaterias. //
		for (int i = 0; i < listaMaterias.length; i++) {

			// siempre y cuando no sean nulos. //
			if (listaMaterias[i] != null) {

				temp[ aux_1++ ] = listaMaterias[i];
			}
		}
		// Se recibe el tamaño y valor del arreglo nuevo. //
		listaMaterias = temp;
	}
	
	public void guardarMateriaEn( int indice, Materia mat_ref ) {
		
		// Si el indice es mayor/igual que 0 y menor que el tamaño de la lista, almacena la materia en el lugar del indice  //
		if ( indice >= 0 && indice< noMaterias)	listaMaterias[ indice ] = mat_ref;
		// De lo contrario, imprime un mensaje //
		else System.out.println( " El índice se encuentra fuera del rango" );
	}
	
	public boolean eliminar( String nombre_materia ){
		
		// Se itera por la lista de materias//
		for ( int i = 0; i< noMaterias; i++) {
			
			//Si la materia en la posicion i tiene el mismo nombre que lo que recibimos de param...///
			if ( listaMaterias[i].getNombre_materia( ).equals( nombre_materia ) ) {  
				
				// Se nulifica la materia almacenada en la pos i de la lista de materias //
				listaMaterias[i] = null;
				
				// Decrementa el tamaño del arreglo en 1. //
				menosMateria( );

				// Ya no hay necesidad de seguir iterando. Se detiene el método regresando "true". //
				return true;
			}
		}
		
		// Si no se llegara a encontrar la materia en el arreglo, se regresa "false" //
		return false;
	}
	
	public void printLista( ) {
		
		for( int i = 0; i < noMaterias; i++ ){
			
			listaMaterias[i].printMateria( );
			System.out.println( );
		}
		
	
	}

	public void printHorario( ) {
		
		for( int i = 0; i < noMaterias; i++ ){
			
			System.out.println( listaMaterias[i].getDia( ) );
			System.out.println( listaMaterias[i].getNombre_materia( ) );
			System.out.println( listaMaterias[i].getSalon( ) );
			System.out.println( listaMaterias[i].getHora_inicio( ) + " - " + listaMaterias[i].getHora_final( ) );
			System.out.println( listaMaterias[i].getSalon( ) );
			System.out.println( );
		}

	}

	
	public int getNoMaterias() {
		return noMaterias;
	}

	
	public Materia[] getListaMaterias() {
		return listaMaterias;
	}

	
	public void setNoMaterias(int noMaterias) {
		this.noMaterias = noMaterias;
	}

	
	public void setListaMaterias(Materia[] listaMaterias) {
		this.listaMaterias = listaMaterias;
	}



}