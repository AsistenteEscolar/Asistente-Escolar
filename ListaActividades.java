public class ListaActividades {

	// Una lista de actividades contiene un arreglo de Actividades como atributo //
	private int noActividades;
	private Actividad[] listaActividades;
	
	// Nuestro constructor sin params crea un arreglo de actividades vacío //
	public ListaActividades( ) {

		noActividades = 0;
		listaActividades = new Actividad[noActividades];
	}

	public ListaActividades( int n ) {

		noActividades = n;
		listaActividades = new Actividad[noActividades];
	}
	
	// Getters // 
	public int getNoActividades() {
		
		return noActividades;
	}

	public Actividad[] getListaActividades() {
		
		return listaActividades;
	}

	// Setters // 
	public void setNoActividades(int noActividades) {
		this.noActividades = noActividades;
	}

	public void setListaActividades(Actividad[] listaActividades) {
		this.listaActividades = listaActividades;
	}

	public Actividad valorEn( int index ) {

		// El índice debe ser mayor que 0 y menor que la cantidad de alumnos //
		if (index < 0 || index > noActividades) {

			// De lo contrario, regresa un usuario nulo //
			return new Actividad();

			// Si el indice es correcto, regresa el valor indicado de la lista
			// //
		} else
			return listaActividades[index];

	}

	public void agregar(Actividad reference) {

		// Incrementa el tamaño del arreglo de actividades en uno//
		mas();

		// Guarda la actividad en la última casilla del arreglo //
		guardarEn(noActividades - 1, reference);
	}

	public void mas() {

		// incrementa la cantidad de Actividades //
		noActividades++;

		// crea un arreglo temporal con el nuevo tamaño //
		Actividad[] temp = new Actividad[noActividades];

		// Itera la lista de actividades y almacena sus actividades en el arreglo
		// temporal //
		for (int i = 0; i < listaActividades.length; i++) {

			temp[i] = listaActividades[i];
		}

		// la lista de actividades recibe el tamaño y valor del arreglo nuevo //.
		listaActividades = temp;

	}

	public void menos() {

		// Variable auxiliar //
		int aux_1 = 0;
		// Decrementamos la cantidad de Actividades //
		noActividades--;
		// Creamos un arreglo con noActividades que ahora es menor. //
		Actividad[] temp = new Actividad[noActividades];

		// el arreglo temporal almacena los objetos de la listaActividades. //
		for (int i = 0; i < listaActividades.length; i++) {

			// siempre y cuando no sean nulos. //
			if (listaActividades[i] != null) {

				temp[aux_1++] = listaActividades[i];
			}
		}
		// Se recibe el tamaño y valor del arreglo nuevo. //
		listaActividades = temp;
	}

	public void guardarEn(int indice, Actividad mat_ref) {

		// Si el indice es mayor/igual que 0 y menor que el tamaño de la lista,
		// almacena la actividad en el lugar del indice //
		if (indice >= 0 && indice < noActividades)
			listaActividades[indice] = mat_ref;
		// De lo contrario, imprime un mensaje //
		else
			System.out.println(" El índice se encuentra fuera del rango");
	}

	public boolean eliminar(String nombre_actividad) {

		// Se itera por la lista de actividades//
		for (int i = 0; i < noActividades; i++) {

			// Si la actividad en la posicion i tiene el mismo nombre que lo que
			// recibimos de param...///
			if (listaActividades[i].getNombre_actividad().equals(nombre_actividad)) {

				// Se nulifica la actividad almacenada en la pos i de la lista de
				// actividades //
				listaActividades[i] = null;

				// Decrementa el tamaño del arreglo en 1. //
				menos();

				// Ya no hay necesidad de seguir iterando. Se detiene el método
				// regresando "true". //
				return true;
			}
		}

		// Si no se llegara a encontrar la actividad en el arreglo, se regresa
		// "false" //
		return false;
	}

}
