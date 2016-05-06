public class Examen extends Actividad{

	private int aciertos_obtenidos;


public Examen (){

	super();
	aciertos_obtenidos = 0;
	super.setTag( "examen" );
}

//contructor con los atributos de Actividad, agrgandole el atributo de Examen //
public Examen ( String nombre_act, String nombre_mat, double calif, int aciertos_obt){

		super(nombre_act, nombre_mat, calif);
        aciertos_obtenidos = aciertos_obt;
        super.setTag( "examen" );

}

//contructor, crea examen
public Examen (Examen ref){

	super(ref.getNombre_actividad(), ref.getNombre_materia(), ref.getCalificacion());
	aciertos_obtenidos = ref.getAciertos_obtenidos();
}

//setters & getters
public int getAciertos_obtenidos( ) {

	return aciertos_obtenidos;
}

public void setAciertos_obtenidos(int aciertos_obt){

aciertos_obtenidos = aciertos_obt;

}

}