package entornos;


/**
 * @author adrian.vega
 * @version 1.0
 * 
 * Esta clase está creada para poder hacer las operaciones y almacenar los datos que hemos ido generando
 * tendremos los de las clases Persona_AV, GravedadPlaneta
 */
public class main {
	
	public static void main(String[] args){
		
		//Creamos las instancias de dos objetos de la clase Persona
		 Persona_AV persona1 = new Persona_AV(1, "Maria", 76, 1.76, 22);
		 Persona_AV persona2 = new Persona_AV(2, "Marcos", 80, 1.80, 21);
		 
		 
		 
	     //Creamos las instancias de tres objetos de la clase Gravedad

		 AV_GravedadPlaneta planeta1 = new AV_GravedadPlaneta(1, "Tierra", 10);
		 AV_GravedadPlaneta planeta2 = new AV_GravedadPlaneta(2, "Saturno", 7.0);
		 AV_GravedadPlaneta planeta3 = new AV_GravedadPlaneta(3, "Plutón", 9.8);
		 
		
		 
		 //calculamos el indice de masa corporal y peso de cada persona en el primer planeta:
		 double masaPersona = calcularIMC(persona1);
		 double gravedadTierra = planeta1.getGravedadPlaneta();
		 double pesoTierra = calcularPeso(masaPersona, gravedadTierra);
		 
		//calculamos el indice de masa corporal y peso de cada persona en el segundo planeta:
		 double masaPersona2 = persona2.getMasa();
		 double gravedadSaturno = planeta2.getGravedadPlaneta();
		 double pesoSaturno = masaPersona2 * gravedadSaturno;

		//calculamos el peso de una persona en el tercer planeta:
		 double gravedadPlutón = planeta2.getGravedadPlaneta();
		 double pesoPlutón = masaPersona2 * gravedadPlutón;
		 
		 //Imprimimos los resultados obtenidos:
		 ImprimirResultados(masaPersona, pesoTierra);
		 
		 System.out.println(persona1);
		 System.out.println("La masa de la persona es:" + masaPersona);
		 System.out.println(persona2);
		 System.out.println("La masa de la persona es:" + masaPersona2);
		 System.out.println(planeta1);
		 System.out.println(planeta2);
		 System.out.println(planeta3);
		 System.out.println("Peso es:" + persona1.getNombre()+ "En la tierra"+pesoTierra);
		 System.out.println("Peso es:" + persona1.getNombre()+ "En Saturno"+pesoSaturno);
		 System.out.println("Peso es:" + persona1.getNombre()+ "En Plutón"+pesoPlutón);
	
	
	
	//a la hora de hacer los metodos se nos genera estos codigos de aquí, cuales ordenamos.
	}

	private static void ImprimirResultados(double masaPersona, double pesoTierra) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param masaPersona
	 * @param gravedadTierra
	 * @return
	 */
	private static double calcularPeso(double masaPersona, double gravedadTierra) {
		double pesoTierra= masaPersona * gravedadTierra;
		return pesoTierra;
	}

	/**
	 * @param persona1
	 * @return
	 */
	private static double calcularIMC(Persona_AV persona1) {
		double masaPersona = persona1.getMasa();
		return masaPersona;
	}
}
