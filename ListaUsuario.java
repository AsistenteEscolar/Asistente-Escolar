
public class ListaUsuario {

	private int noUsuarios;
	private Usuario[] listaUsuarios;
	
	// Constructor que crea una lista de 10 usuarios //
	public ListaUsuario( ){
		
		noUsuarios = 10;
		listaUsuarios = new Usuario[ noUsuarios ];		
	}
	
	// Constructor que crea una lista de n usuarios //
	public ListaUsuario( int i_noUsuarios ){
		
		noUsuarios = i_noUsuarios;
		listaUsuarios = new Usuario[ noUsuarios ];		
	}	
	
	// Getters //
	public int getNoUsuarios() {
		return noUsuarios;
	}
	
	public Usuario[] getListaUsuarios() {
		return listaUsuarios;
	}

	// Setters //
	public void setNoUsuarios(int noUsuarios) {
		this.noUsuarios = noUsuarios;
	}
	
	public void setListaUsuarios(Usuario[] listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	public boolean iniciarSesion( Usuario reference ){
		
		Usuario p = new Usuario( );
		boolean usuario_encontrado = false;
		boolean contrasena_encontrada = false;
		int i = 0;
		
		do {
			
			// Inicializamos el usuario que recorre el arreglo con el que se encuentra en la pos i de la lista de Usuarios. //
			p = usuarioEn( i );
			
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

					} else {
						
						
						contrasena_encontrada = false;

					}
				} else {
					
					usuario_encontrado = false;
				}
				
				i++;
				
			} else break;
				
			
		} while ( i < this.noUsuarios || p != null );
	
		// Regresa el valor de ambas banderas //
		return usuario_encontrado && contrasena_encontrada;
	
	}

	
	public Usuario usuarioEn( int index ){
		
		// El índice debe ser mayor que 0 y menor que la cantidad de alumnos //
		if ( index < 0 || index > noUsuarios ){
			
			// De lo contrario, regresa un usuario nulo //
			return new Usuario( );
			
			// Si el indice es correcto, regresa el valor indicado de la lista // 
		} else return listaUsuarios[ index ];

	}
	
	
	// Este método agrega a un usuario a la lista //
	public void agregarUsuario( Usuario reference ){
		
		// Busca en la lista un espacio vació. //
		for ( int i = 0; i < noUsuarios; i++ ){
			
			// Si lo encuentra...
			if( listaUsuarios[ i ] == null ) {
				
				// ...almancena al usuario e imprime que se ha alojado. //
				listaUsuarios[ i ] = reference;
				System.out.println( "Se ha alojado al usuario." );
				noUsuarios++;
				return;
			}
		}
	}
	
	public void borrarUsuario( Usuario reference ) {
		
		
		
	}
}