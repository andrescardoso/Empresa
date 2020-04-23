package empresa;
import java.time.LocalDate;

public class PlantaPermanente extends Empleado {
	
	private static final double jubilacion=0.11;
	private static final double obra_social=0.03;
	private static final int valor_hs=30;
	private static final int valor_ant=10;
	private static final double valor_hsextra=100;
	private int hs_extra;
	
	public PlantaPermanente (String nombre, int edad, int cant_hijos, boolean casado, int ingreso, int hs_extra, int cant_hs,String cuil) { // MÉTODO CONSTRUCTOR
		super(nombre, cuil, edad, cant_hs);
		this.setCant_hijos(cant_hijos);
		this.setIngreso(ingreso);
		this.setHs_extra(hs_extra);
		this.setCuil(cuil);
	}

	// MÉTODOS DE CALCULAR SUELDO
	public double calculaJubilacion() {
		return this.calculaSueldoBase()*this.getJubiliacion();
	}
	public double calculaObraSocial() {
		return this.calculaSueldoBase()*this.getObra_social();
	}
	public int calculaAntiguedad() {
		LocalDate now = LocalDate.now();
		int año = this.getIngreso();
		return now.minusYears(año).getYear(); // AÑO ACTUAL - AÑO ALMACENADO EN INGRESO = OBTIENE CANTIDAD DE AÑOS
	}
	public double importeAntiguedad() {
		return this.calculaAntiguedad()*this.getValor_ant();
	}
	public double salarioFamiliar() {
		return this.getCant_hijos()*super.getImpxhijo() + (this.isCasado()?super.getImpxcasado():0);
	}
	public double calculaSueldoBase() {
		return this.getCanths()*this.getValor_hs()+this.getHs_extra()*this.getValor_hsextra();
	}
	public double calculaSueldoFinal() { // OPERACIONES MATEMÁTICAS ENTRE DEVOLUCIONES DE MÉTODOS
		return this.calculaSueldoBase()+this.salarioFamiliar()+this.importeAntiguedad()-this.calculaJubilacion()-this.calculaObraSocial();
	}
	//
	
	// SETTERS & GETTERS
	public double getJubiliacion() {
		return jubilacion;
	}
	public double getObra_social() {
		return obra_social;
	}
	public int getValor_ant() {
		return valor_ant;
	}
	public int getValor_hs() {
		return valor_hs;
	}
	public double getHs_extra() {
		return hs_extra;
	}
	public void setHs_extra(int hs_extra) {
		this.hs_extra = hs_extra;
	}
	public double getValor_hsextra() {
		return valor_hsextra;
	}
	
	// MÉTODO EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlantaPermanente other = (PlantaPermanente) obj;
		if (hs_extra != other.hs_extra)
			return false;
		return true;
	}
	// MÉTODO CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	// TOSTRING
	public String toString() {
		return "Empleado PERMANENTE\nNombre: " + this.getNombre() + "\nCUIL: " + this.getCuil() + "\nFecha de ingreso: " + this.getIngreso() + "\nEdad: " + this.getEdad() + "\nEstado civil: " + this.devuelveEstadoCivil() +
				"\nCantidad de hijos: " + this.getCant_hijos() + "\n--REMUNERACIONES--\nSueldo BRUTO: " + this.calculaSueldoBase() + "\nAntigüedad: " + this.importeAntiguedad() + "\nSalario familiar: " + this.salarioFamiliar() + "\n--DESCUENTOS--\nJubilación: " + this.calculaJubilacion() + 
				"\nObra social: " + this.calculaObraSocial() + "\n[Sueldo NETO]: " + this.calculaSueldoFinal();
	}
}