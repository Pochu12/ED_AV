package entornos;

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
		 double masaPersona = persona1.getMasa();
		 double gravedadTierra = planeta1.getGravedadPlaneta();
		 double pesoTierra= masaPersona * gravedadTierra;
		 
		//calculamos el indice de masa corporal y peso de cada persona en el segundo planeta:
		 double masaPersona2 = persona2.getMasa();
		 double gravedadSaturno = planeta2.getGravedadPlaneta();
		 double pesoSaturno = masaPersona2 * gravedadSaturno;

		//calculamos el peso de una persona en el tercer planeta:
		 double gravedadPlutón = planeta2.getGravedadPlaneta();
		 double pesoPlutón = masaPersona2 * gravedadPlutón;
		 
		 //Imprimimos los resultados obtenidos:
		 
		 System.out.println(persona1);
		 System.out.println("La masa de la persona es:" + masaPersona);
		 System.out.println(persona2);
		 System.out.println("La masa de la persona es:" + masaPersona2);
		 System.out.println(planeta1);
		 System.out.println(planeta2);
		 System.out.println(planeta3);
		 System.out.println("Peso es:" + persona1.getNombre()+ "En la tierra"+pesoTierra);
		 System.out.println("Peso es:" + persona1.getNombre()+ "En la tierra"+pesoSaturno);
		 System.out.println("Peso es:" + persona1.getNombre()+ "En la tierra"+pesoPlutón);
	
	
	
	
	}
}
