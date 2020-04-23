package empresa;

public abstract class Empleado {
	
	private String cuil;
	private int edad;
	private int cant_hijos;
	private int cant_hs;
	private int ingreso;
	private boolean casado;
	private String nombre;
	private static final double impxhijo=10;
	private static final double impxcasado=20;
	
	public Empleado (String nombre, String cuil, int edad, int cant_hs) { // MÉTODO CONSTRUCTOR QUE VA A HEREDAR TEMPORARIO
		this.setNombre(nombre);
		this.setCuil(cuil);
		this.setEdad(edad);
		this.setCanths(cant_hs);
	}
	
	public Empleado (String nombre, int edad, int cant_hijos, boolean casado, int ingreso) { // MÉTODO CONSTRUCTOR QUE VA A HEREDAR PERMANENTE
		this.setCant_hijos(cant_hijos);
		this.setIngreso(ingreso);
		this.setNombre(nombre);
		this.setCasado(casado);
		this.setEdad(edad);
	}
	
	public String devuelveEstadoCivil() {
		if (this.isCasado()==true)
			return "Casado";
		else return "Soltero";
	}
	
	public abstract double calculaSueldoFinal(); // TODOS LOS EMPLEADOS TIENEN UN SUELDO FINAL, ABSTRACTO PARA QUE PUEDA ACCEDER A ELLOS DESDE CLASE EMPRESA
	
	// SETTERS & GETTERS
	public int getIngreso() {
		return ingreso;
	}
	public void setIngreso(int ingreso) {
		this.ingreso=ingreso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil=cuil;
	}
	public int getCanths() {
		return cant_hs;
	}
	public void setCanths(int cant_hs) {
		this.cant_hs=cant_hs;
	}
	public double getImpxhijo() {
		return impxhijo;
	}
	public double getImpxcasado() {
		return impxcasado;
	}
	public int getCant_hijos() {
		return cant_hijos;
	}
	public void setCant_hijos(int cant_hijos) {
		this.cant_hijos = cant_hijos;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//
	
	// MÉTODO EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (cant_hijos != other.cant_hijos)
			return false;
		if (cant_hs != other.cant_hs)
			return false;
		if (casado != other.casado)
			return false;
		if (cuil == null) {
			if (other.cuil != null)
				return false;
		} else if (!cuil.equals(other.cuil))
			return false;
		if (edad != other.edad)
			return false;
		if (ingreso != other.ingreso)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		}
		return true;
	}
	// MÉTODO CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	// TOSTRING
	public String toString() {
		return "Empleado\nNombre: " + this.getNombre() + "\nCUIL: " + this.getCuil() + "\nFecha de ingreso: " + this.getIngreso() + "\nEdad: " + this.getEdad() + "\nEstado civil: " + this.devuelveEstadoCivil() +
				"\nCantidad de hijos: " + this.getCant_hijos();
	}
}
