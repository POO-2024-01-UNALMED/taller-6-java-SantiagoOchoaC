package vehiculos;


public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int CantidadVehiculos;
	
	public Camioneta() {
		
	}
	// Constructor
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		CantidadVehiculos++;
	}
	
	// Métodos 

	
	// Métodos get y set
    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }

}
