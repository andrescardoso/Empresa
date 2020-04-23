package empresa;

public class Gerente extends PlantaPermanente {
	private static final int valor_hs=50;
	private static final int valor_ant=20;
	
	public Gerente(String nombre, int edad, int cant_hijos, boolean casado, int ingreso, int hs_extra, int cant_hs,String cuil) { // MÉTODO CONSTRUCTOR
		super(nombre, edad, cant_hijos, casado, ingreso, hs_extra, cant_hs, cuil);
	}
	
	public double calculaSueldoFinal() { 
		return this.calculaSueldoBase()+this.salarioFamiliar()+this.importeAntiguedad()-this.calculaJubilacion()-this.calculaObraSocial();
	}
	
	// SETTERS & GETTERS
	public int getValor_ant() {
		return valor_ant;
	}
	public int getValor_hs() {
		return valor_hs;
	}
	
	// EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	// CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	// TOSTRING
	public String toString() {
			return "Empleado GERENTE\nNombre: " + this.getNombre() + "\nCUIL: " + this.getCuil() + "\nFecha de ingreso: " + this.getIngreso() + "\nEdad: " + this.getEdad() + "\nEstado civil: " + this.devuelveEstadoCivil() +
					"\nCantidad de hijos: " + this.getCant_hijos() + "\n--REMUNERACIONES--\nSueldo BRUTO: " + this.calculaSueldoBase() + "\nAntigüedad: " + this.importeAntiguedad() + "\nSalario familiar: " + this.salarioFamiliar() + "\n--DESCUENTOS--\nJubilación: " + this.calculaJubilacion() + 
					"\nObra social: " + this.calculaObraSocial() + "\n[Sueldo NETO]: " + this.calculaSueldoFinal();
		}
}
