import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	static Scanner scan = new Scanner( System.in );
	static Usuario usuario_activo = new Usuario( );
	static ListaUsuarios usuarios_db = new ListaUsuarios( );
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		usuarios_db.agregarUsuario( new Usuario( 1979727, "eddy", "welcome", "A" ) );
		
		boolean login_verificacion = false;
		
		// seccion de inicio de sesion //
		do {	
			
			switch ( UI_inicioSesion( ) ) {
				
				case 1: login_verificacion = login( ); 		 break;
				case 2: crearUsuario( ); break;
				default: System.out.println( "Opcion invalida");
			}
		} while ( login_verificacion == false );
	
	// Sólo podremos llegar a esta parte si se verifica un inicio de sesión apropiado
		
		boolean exit_verificacion = false;
		
		do {
			
			switch( UI_menuPrincipal( ) ){
			
				case 1: usuario_activo.getListaM( ).printLista( ); break;
				case 2: usuario_activo.getListaM( ).printHorario( ); break;
//				case 3: printCalificaciones( );
				case 4:  exit_verificacion = true; break;
				
			}
			
		} while( !exit_verificacion );
		
	}
	
	public static int UI_inicioSesion( ){
		
		
		System.out.println( "Bienvenido");
		System.out.println( );
		System.out.println( "1.) Login ");
		System.out.println( "2.) Crear Usuario  ");
		System.out.println( );
		System.out.print( "Elige una opcion: " );
		
		return scan.nextInt( );
	}
	
	public static int UI_menuPrincipal( ){
		
		System.out.println( "1.) Ver materias. " );
		System.out.println( "2.) Ver horario  " );
		System.out.println( "3.) Salir" );
		System.out.println( );
		System.out.print( "Elige una opcion: " );
		
		return scan.nextInt( );
			
	}
	
//	public static void printCalificaciones( ){
//		
//		for( int i = 0; i < usuario_activo.getListaM( ).getNoMaterias( ); i++ ){
//			
//			System.out.println( "Materia: " + usuario_activo.getListaM().getListaMaterias()[i].getNombre_materia( ) );
//			System.out.println( "Calificacion: " + usuario_activo.getListaM().getListaMaterias()[i].promedio( usuario_activo.getListaM( ).getListaMaterias( )[i].getCotejo( ), usuario_activo.getListaM( ).getListaMaterias( )[i].getListaA( ) ) );
//			System.out.println( );
//		}
//	}
//	
//	public static void UI_menuActividades( ){
//		
//		
//	
//	}
	
	public static boolean login( ) throws IOException{
		
		System.out.print( "Cuenta ( solo dígitos ): " );
		usuario_activo.setCuenta( scan.nextInt( ) );
		System.out.println( );
		System.out.print( "Contrasena: ");
		usuario_activo.setContra( br.readLine( ) );
		
		if ( usuarios_db.iniciarSesion( usuario_activo ) ){
			
			usuario_activo = usuarios_db.copiarUsuario( usuario_activo );
			System.out.println( "Se inicio sesion correctamente. ");
			return true;
		} else {
			
			System.out.println( "No se pudo iniciar la sesion. ");
			return false;
		}
	}
	
	public static boolean login( Usuario creado ) throws IOException{
		
		
		if ( usuarios_db.iniciarSesion( creado ) ){
			
			usuario_activo = usuarios_db.copiarUsuario( creado );
			System.out.println( "Se inicio sesion correctamente. ");
			return true;
		} else {
			
			System.out.println( "No se pudo iniciar la sesion. ");
			return false;
		}
		
		
	}

	
	public static void crearUsuario ( ) throws IOException{
		
		System.out.print( "No de Cuenta: " );
		usuario_activo.setCuenta( scan.nextInt( ) );
		System.out.println( );
		System.out.print( "Contrasena: " );
		usuario_activo.setContra( br.readLine( ) );
		System.out.println( );
		System.out.print( "Nombre: " );
		usuario_activo.setNombre( br.readLine( ) );		
		System.out.println( );
		System.out.print( "Grupo: " );
		usuario_activo.setGrupo( br.readLine( ) );		
	
		usuarios_db.agregarUsuario( new Usuario( usuario_activo ) );
		System.out.println( );
	
	}


	
}

