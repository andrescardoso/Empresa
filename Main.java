package empresa;

public class Main {

	public static void main(String[] args) {
		
		Empresa empresa1 = new Empresa ("30-50222888-4", "Microsoft");
		System.out.println(empresa1.toString() + "\n");
		
		empresa1.agregarEmpleado(new PlantaPermanente("Juan", 47, 3, true, 2006, 8, 250 ,"22-14123478-3"));
		empresa1.agregarEmpleado(new PlantaTemporaria ("Pepe", "20-12544879-4", 24, 200));
		empresa1.agregarEmpleado(new Gerente ("Luis", 34, 2, false, 2002, 4, 240, "20-19245684-3"));
		empresa1.mostrarEmpleados();
		System.out.println("La cantidad de empleados actualmente es: " + empresa1.cantEmpleados());
		
		System.out.println("El monto final de todos los sueldos de los empleados es: " + empresa1.calculaTotalSueldos());
		
	}
}