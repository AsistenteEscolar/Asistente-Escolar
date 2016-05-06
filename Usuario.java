
public class Usuario {

	private int 			  cuenta;
	private String			  nombre;
	private String 			  contra;
	private String			  grupo;
	private ListaMaterias 	  listaM;

	
	// Constructor vacío que previene crear un usuario nulo //
	public Usuario( ){
		
		cuenta = 0;
		nombre = "";
		contra = "";
		grupo  = "";
		setListaMaterias( );
	}
	
	// Contructor que recibe los datos incluídos // 
	public Usuario( int i_cuenta, String i_nombre, String i_contra, String i_grupo  ){
		
		cuenta = i_cuenta;
		nombre = i_nombre;
		contra = i_contra;
		grupo  = i_grupo;
		setListaMaterias( );
	}
	
	// Constructor que recibe otro usuario y copia sus valores //
	public Usuario( Usuario reference ){
		
		this.cuenta = reference.cuenta;
		this.nombre = reference.nombre;		
		this.contra = reference.contra;		
		this.grupo  = reference.grupo;
		setListaMaterias( );
	}
	
	

	public ListaMaterias getListaM() {
	
		return listaM;
	}

	public void setListaM( ListaMaterias listaM ) {
	
		this.listaM = listaM;
	}

	// Getters //
	public int getCuenta() {
	
		return cuenta;
	}

	public String getNombre() {
	
		return nombre;
	}

	public String getContra() {
	
		return contra;
	}

	public String getGrupo() {
	
		return grupo;
	}

	// Setters // 
	public void setCuenta(int cuenta) {
		
		this.cuenta = cuenta;
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}

	public void setContra(String contra) {
		
		this.contra = contra;
	}

	public void setGrupo(String grupo) {
		
		this.grupo = grupo;
	}
	
	// Imprime los datos del usuario que lo ejecuta //
	public void printUser( ){
		
		System.out.println( "Cuenta: " + this.getCuenta( ) );
		System.out.println( "Nombre: " + this.getNombre( ) );
		System.out.println( "Contra: " + this.getContra( ) );
		System.out.println( "Grupo: " + this.getGrupo( ) );
	}
	
	public void setListaMaterias( ) {
		
		listaM = new ListaMaterias( );
		
		if ( grupo.equals( "A" ) || grupo.equals( "a" ) ) {

			listaM.agregarMateria( new Materia( "Matematicas II", "Olga Mijangos", "C240", "LUNES", "7:00 PM", "10:00 PM", 20.0, 20.0, 60.0 ) );
			listaM.agregarMateria( new Materia( "Programacion", "Martin de Jesus Reyes", "D265", "MARTES", "7:00 PM", "10:00 PM", 20.0, 20.0, 60.0) );
			listaM.agregarMateria( new Materia( "Redes", "Hector Fragoso", "D163", "MIERCOLES", "7:00 PM", "10:00 PM", 20.0, 20.0, 60.0 ) );
			listaM.agregarMateria( new Materia( "Sistemas Operativos", "Juan Delgado", "DPB05", "JUEVES", "7:00 PM", "10:00 PM", 20.0, 20.0, 60.0 ) );
			listaM.agregarMateria( new Materia( "Estructuras de Datos", "Alfonso Rivero", "B124", "VIERNES", "7:00 PM", "10:00 PM", 20.0, 20.0, 60.0 ) );
			listaM.agregarMateria( new Materia( "Ingles para Informatica", "Gustavo Jaime", "B213", "SABADO", "9:00 AM", "12:00 PM", 20.0, 20.0, 60.0 ) );
			listaM.agregarMateria( new Materia( "Desarrollo Personal y Espiritualidad", "Monica Armella", "B213", "SABADO", "12:00 PM", "3:00 PM", 20.0, 20.0, 60.0) );			
			
		} else if ( grupo.equals( "B" ) || grupo.equals( "b" ) ){

			listaM.agregarMateria( new Materia( "Redes", "Oscar Aguilar", "D159", "LUNES", "7:00 PM", "10:00 PM", 20.0, 20.0, 60.0  ) );
			listaM.agregarMateria( new Materia( "Estructuras de Datos", "Alfonso Rivero", "D271", "MARTES", "7:00 PM", "10:00 PM", 20.0, 20.0, 60.0  ) );
			listaM.agregarMateria( new Materia( "Sistemas Operativos", "Juan Delgado", "LPB14", "MIERCOLES", "7:00 PM", "10:00 PM", 20.0, 20.0, 60.0 ) );		
			listaM.agregarMateria( new Materia( "Matematicas II", "Eugenio Talavera", "B220", "JUEVES", "7:00 PM", "10:00 PM" , 20.0, 20.0, 60.0 ) );
			listaM.agregarMateria( new Materia( "Programacion", "Martin de Jesus Reyes", "B218", "VIERNES", "7:00 PM", "10:00 PM", 20.0, 20.0, 60.0  ) );
			listaM.agregarMateria( new Materia( "Desarrollo Personal y Espiritualidad", "Monica Armella", "B127", "SABADO", "9:00 AM", "12:00 PM", 20.0, 20.0, 60.0 ) );
			listaM.agregarMateria( new Materia( "Ingles para Informatica", "Gustavo Jaime", "D159", "SABADO", "12:00 PM", "3:00 PM", 20.0, 20.0, 60.0  ) );
			
		} else {
			
			return;
		}
	}
	

	
	
	
	
}
