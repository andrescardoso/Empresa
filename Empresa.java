package empresa;
import java.util.*;

public class Empresa {
	private ArrayList<Empleado> empleados;
	private String cuit;
	private String razon_social;
	
	public Empresa (String cuit, String razonSocial) { // M�TODO CONSTRUCTOR
		this.setCuit(cuit);
		this.setRazon_social(razonSocial);
		this.setEmpleados(new ArrayList<Empleado>());
		
	}
	
	// SETTERS & GETTERS
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getRazon_social() {
		return razon_social;
	}
	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}
	//
	// M�TODOS DEL ARRAYLIST EMPLEADO
	public ArrayList<Empleado> getEmpleados() {
		return this.empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	public void agregarEmpleado(Empleado empleado) {
		this.getEmpleados().add(empleado);
	}
	public void quitarEmpleado(int numeroempleado) {
		this.getEmpleados().remove(numeroempleado);
	}
	public int cantEmpleados() {
		return empleados.size();
	}
	public void mostrarEmpleados() { // IMPRESI�N EN CONSOLA DE LA LISTA
		for (Empleado empleado : this.getEmpleados())
			System.out.println(empleado+"\n");
	}
	public double calculaTotalSueldos() {
		double acumSueldo=0;
		for (Empleado empleado: this.getEmpleados())
			acumSueldo+=empleado.calculaSueldoFinal();
		return acumSueldo;
	}
	
	// M�TODO EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cuit == null) {
			if (other.cuit != null)
				return false;
		} else if (!cuit.equals(other.cuit))
			return false;
		if (razon_social == null) {
			if (other.razon_social != null)
				return false;
		} else if (!razon_social.equals(other.razon_social))
			return false;
		return true;
	}
	// M�TODO CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	// TOSTRING
	public String toString() {
		return "---DATOS DE LA EMPRESA---\nRaz�n Social: " + this.getRazon_social() + "\n" + "CUIT: " + this.getCuit();
	}
}