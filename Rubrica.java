public class Rubrica {

	private double valor_tareas;
	private double valor_proyectos;
	private double valor_examenes;
	
	public Rubrica ( ){
		
		valor_tareas 	= 60.0;
		valor_proyectos = 20.0;
		valor_examenes 	= 20.0;
	}
	
	public Rubrica ( double tareas, double proyectos, double examenes ){
		
		valor_tareas 	= 60.0;
		valor_proyectos = 20.0;
		valor_examenes 	= 20.0;
	}

	public double getValor_tareas() {
	
		return valor_tareas;
	}

	public double getValor_proyectos() {
		
		return valor_proyectos;
	}

	public double getValor_examenes() {
		
		return valor_examenes;
	}

	public void setValor_tareas(double valor_tareas) {
		
		this.valor_tareas = valor_tareas;
	}

	public void setValor_proyectos(double valor_proyectos) {
		
		this.valor_proyectos = valor_proyectos;
	}

	public void setValor_examenes(double valor_examenes) {
		
		this.valor_examenes = valor_examenes;
	}
	

	

	
}
