package ejercicio1;

public class Docente extends Persona{
	private String especialidad;
	private int numeroHoras;
	private int valorHora;
	
	public Docente(int id, String nombre, int edad, String especialidad, int numeroHoras,int valorHora) {
		super(id, nombre, edad);
		this.especialidad = especialidad;
		this.numeroHoras = numeroHoras;
		this.valorHora = valorHora;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Docente "+super.toString()+" Especialidad "+this.especialidad
				+" Salario "+" Valor a Pagar "+calcularSalario();
	}
	
	@Override
	public int calcularSalario() {
		// TODO Auto-generated method stub
		int salarioBase = (this.numeroHoras * this.valorHora);
		int valoraPagar = (salarioBase - (salarioBase * (this.PORDEDUCCION/100)));
		return valoraPagar;
	}

}
