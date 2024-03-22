package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	protected static ArrayList <Pais> listado = new ArrayList<>();
	
	public Pais () {
		listado.add(this);
	}
	
	public Pais(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	// Métodos
	public static Pais paisMasVendedor() {
		ArrayList <Pais> paises = new ArrayList<>();
		Pais masRepetido = null;
		int maxRepeticiones = 0;
		
		if (Fabricante.listado != null) {
			for (Fabricante fabrica : Fabricante.listado) {
				if (listado.contains(fabrica.getPais())) {
					paises.add(fabrica.getPais());
				}
				
			}
			
		}
		if (paises != null) {
	        for (int i = 0; i < paises.size(); i++) {
	            Pais elementoActual = paises.get(i);
	            int contador = 0;

	            for (int j = 0; j < paises.size(); j++) {
	                if (paises.get(j).equals(elementoActual)) {
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
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}