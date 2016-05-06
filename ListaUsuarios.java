public class ListaUsuarios {

	// Una lista de usuarios contiene un arreglo de Usuarios como atributo //
	private int noUsuarios;
	private Usuario[] listaUsuarios;

	// Nuestro constructor sin params crea un arreglo de usuarios de 7 usuarios
	// por default. //
	public ListaUsuarios() {

		noUsuarios = 0;
		listaUsuarios = new Usuario[noUsuarios];
	}

	// Nuestro constructor sin params crea un arreglo de usuarios de 7 usuarios
	// por default //
	public ListaUsuarios(int n) {

		noUsuarios = n;
		listaUsuarios = new Usuario[noUsuarios];
	}

	public Usuario usuarioEn( int index ) {

		// El índice debe ser mayor que 0 y menor que la cantidad de alumnos //
		if (index < 0 || index > noUsuarios) {

			// De lo contrario, regresa un usuario nulo //
			return new Usuario();

			// Si el indice es correcto, regresa el valor indicado de la lista
			// //
		} else
			return listaUsuarios[index];

	}

	public void agregarUsuario(Usuario reference) {

		// Incrementa el tamaño del arreglo de usuarios en uno//
		masUsuario();

		// Guarda el usuario en la última casilla del arreglo //
		guardarUsuarioEn(noUsuarios - 1, reference);
		
		System.out.println( "El usuario ha sido alojado." );
	}

	public void masUsuario() {

		// incrementa la cantidad de Usuarios //
		noUsuarios++;

		// crea un arreglo temporal con el nuevo tamaño //
		Usuario[] temp = new Usuario[noUsuarios];

		// Itera la lista de usuarios y almacena sus usuarios en el arreglo
		// temporal //
		for (int i = 0; i < listaUsuarios.length; i++) {

			temp[i] = listaUsuarios[i];
		}

		// la lista de usuarios recibe el tamaño y valor del arreglo nuevo //.
		listaUsuarios = temp;

	}

	public void menosUsuario() {

		// Variable auxiliar //
		int aux_1 = 0;
		// Decrementamos la cantidad de Usuarios //
		noUsuarios--;
		// Creamos un arreglo con noUsuarios que ahora es menor. //
		Usuario[] temp = new Usuario[noUsuarios];

		// el arreglo temporal almacena los objetos de la listaUsuarios. //
		for (int i = 0; i < listaUsuarios.length; i++) {

			// siempre y cuando no sean nulos. //
			if (listaUsuarios[i] != null) {

				temp[aux_1++] = listaUsuarios[i];
			}
		}
		// Se recibe el tamaño y valor del arreglo nuevo. //
		listaUsuarios = temp;
	}

	public Usuario copiarUsuario( Usuario referencia ){
		
		for( int i = 0; i < noUsuarios; i++ ) {
			
			if( referencia.getCuenta( ) == listaUsuarios[i].getCuenta( ) ) return usuarioEn( i );
		}
		
		return new Usuario( );
	}
	
	public void guardarUsuarioEn(int indice, Usuario mat_ref) {

		// Si el indice es mayor/igual que 0 y menor que el tamaño de la lista,
		// almacena el usuario en el lugar del indice //
		if ( indice >= 0 && indice < noUsuarios)
			listaUsuarios[indice] = mat_ref;
		// De lo contrario, imprime un mensaje //
		else
			System.out.println(" El índice se encuentra fuera del rango");
	}

	public boolean eliminar(int ref_cuenta) {

		// Se itera por la lista de usuarios//
		for (int i = 0; i < noUsuarios; i++) {

			// Si el usuario en la posicion i tiene el mismo nombre que lo que
			// recibimos de param...///
			if (listaUsuarios[i].getCuenta() == ref_cuenta) {

				// Se nulifica el usuario almacenada en la pos i de la lista de
				// usuarios //
				listaUsuarios[i] = null;

				// Decrementa el tamaño del arreglo en 1. //
				menosUsuario();

				// Ya no hay necesidad de seguir iterando. Se detiene el método
				// regresando "true". //
				return true;
			}
		}

		// Si no se llegara a encontrar el usuario en el arreglo, se regresa
		// "false" //
		return false;
	}

	public boolean iniciarSesion( Usuario reference ){
		
		Usuario p = new Usuario( );
		boolean usuario_encontrado = false;
		boolean contrasena_encontrada = false;
		int i = 0;
		
		do {
			
			// Inicializamos el usuario que recorre el arreglo con el que se encuentra en la pos i de la lista de Usuarios. //
			p = usuarioEn( i );
			if ( p == null ) break;
			// Si el usuario inicializado no es nulo...
			if (p != null ) {
				
				//...y el no de cuenta del usuario p y coincide con la cuenta otorgada por usuario...
				if( p.getCuenta( ) == reference.getCuenta( ) ){
					
					// Se levanta la bandera indicando que el usuario existe //
					usuario_encontrado = true;
					
					// Si la contrasena de ambos coincide
					if ( p.getContra( ).equals( reference.getContra( ) ) ) {
						
						// ...se levanta la bandera indicando que coinciden //
						contrasena_encontrada = true;
						break;
					} else {
						
						
						contrasena_encontrada = false;

					}
				} else {
					
					usuario_encontrado = false;
				}
				
				i++;
				
			}
				
			
		} while ( i < this.noUsuarios || p != null );
	
		// Regresa el valor de ambas banderas //
		return usuario_encontrado && contrasena_encontrada;
	
	}
	
	
	
}
