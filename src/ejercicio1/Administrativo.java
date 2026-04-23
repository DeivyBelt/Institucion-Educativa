package ejercicio1;

public class Administrativo extends Persona{
	private String cargo;
	private String dependencia;
	private int salarioFijo;
	
	public Administrativo(int id, String nombre, int edad, String cargo, String dependencia,int salario) {
		super(id, nombre, edad);
		this.cargo = cargo;
		this.dependencia = dependencia;
		this.salarioFijo = salario;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Administrativo "+super.toString()+" Cargo "+this.cargo+" Dependencia "
				+this.dependencia+" Salario "+this.salarioFijo+" Valor a Pagar "+calcularSalario();
	}
	
	@Override
	public int calcularSalario() {
		// TODO Auto-generated method stub
		long deduccion = (salarioFijo * this.PORDEDUCCION/100);
		int valorPagar = (int) (salarioFijo - deduccion);
		return valorPagar;
	}

}
