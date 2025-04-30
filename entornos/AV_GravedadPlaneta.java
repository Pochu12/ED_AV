package entornos;

public class AV_GravedadPlaneta {
	//Generamos los atributos que nos piden con su correspondiente tipo:
	private int id;
	private String nombre;
	private double GravedadPlaneta;
	
	//Generamos el constructor por defecto
	public AV_GravedadPlaneta() {}

	
	//Ahora el constructor con todos los argumentos:
	public AV_GravedadPlaneta(int id, String nombre, double gravedadPlaneta) {
		super();
		this.id = id;
		this.nombre = nombre;
		GravedadPlaneta = gravedadPlaneta;
	}

	
	//Ahora el getter and setter:

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getGravedadPlaneta() {
		return GravedadPlaneta;
	}


	public void setGravedadPlaneta(double gravedadPlaneta) {
		GravedadPlaneta = gravedadPlaneta;
	}

	
	//Y el metodo ToString:

	@Override
	public String toString() {
		return "AV_GravedadPlaneta [id=" + id + ", nombre=" + nombre + ", GravedadPlaneta=" + GravedadPlaneta + "]";
	}
	
	
	
	
	
	
}
