package entornos;

public class Persona_AV {
	
	//creamos los atributos de la clase persona_AV con los datos que nos piden
	private int id;
	private String nombre;
	private double masa;
	private double altura;
	private int edad;
	//Este es el constructor por defecto:
	public Persona_AV() {}
	
	
	// Este es el constructor con todos los argumentos.
	public Persona_AV(int id, String nombre, double masa, double altura, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.masa = masa;
		this.altura = altura;
		this.edad = edad;
	}

	// Aquí tenemos los metodos getter y setter
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

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Aqui tenemos el método ToString:
	@Override
	public String toString() {
		return "Persona_AV [id=" + id + ", nombre=" + nombre + ", masa=" + masa + ", altura=" + altura + ", edad="
				+ edad + "]";
	}
	
	
	
}
