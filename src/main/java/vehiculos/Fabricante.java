package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	protected static ArrayList <Fabricante> listado = new ArrayList<>();
	
	public Fabricante () {
		listado.add(this);
	}
	// Constructor
	public Fabricante(String nombre, Pais pais) {
		this();
		this.nombre = nombre;
		this.pais = pais;
	}
	
	// Métodos
	public static Fabricante fabricaMayorVentas() {
		ArrayList <Fabricante> fabricantes = new ArrayList<>();
		Fabricante masRepetido = null;
		int maxRepeticiones = 0;
		
		if (Vehiculo.listado != null) {
			for (Vehiculo vehiculo : Vehiculo.listado) {
				if (listado.contains(vehiculo.getFabricante())) {
					fabricantes.add(vehiculo.getFabricante());
				}
				
			}
			
		}
		if (fabricantes != null) {
	        for (int i = 0; i < fabricantes.size(); i++) {
	            Fabricante elementoActual = fabricantes.get(i);
	            int contador = 0;

	            for (int j = 0; j < fabricantes.size(); j++) {
	                if (fabricantes.get(j).equals(elementoActual)) {
	                    contador++;
	                }
	            }

	            if (contador > maxRepeticiones) {
	                maxRepeticiones = contador;
	                masRepetido = elementoActual;
	            }
	        }
	    }
		return masRepetido;
}
	
	// Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
	
}
