package empresa;

public class PlantaTemporaria extends Empleado {
	
	private static final int valor_hs=20;
	
	public PlantaTemporaria(String nombre, String cuil,int edad,int cant_hs) { // MÉTODO CONSTRUCTOR
		super(nombre, cuil, edad, cant_hs);
	}

	// GETTER
	public int getValor_hs() {
		return valor_hs;
	}
	
	// MÉTODO CALCULAPAGA
	public double calculaSueldoFinal() {
		return this.getCanths()*this.getValor_hs();
	}
	
	// MÉTODO EQUALS
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
		return "Empleado TEMPORARIO\nNombre: " + this.getNombre() + "\nCUIL: " + this.getCuil() + "\nEdad: " + this.getEdad() + "\nHoras trabajadas: " + this.getCanths() + "\nPaga correspondiente: " +
				this.calculaSueldoFinal();
	}
	
}
