package prueba;

public class Main {
	
	public static void main (String[] args) {
		
		System.out.println("Bienvenidos!");
		
		Persona p1=new Persona();
		p1.setApellido("Quito");
		p1.setNombre("Esteban");
		p1.setDni(33877883);
		
		//Opcion1		
		Persona p2=new Persona(p1);
		
		if (p1==p2){
			
			System.out.println("Somos el mismo");
		}else {
			System.out.println("Somos parecidos" + p1.toString());
			System.out.println("Somos parecidos" + p2.toString());
		}
		
		//Opcion2
		Persona p3=new Persona();
		p3.setApellido("Quito");
		p3.setNombre("Esteban");
		p3.setDni(33877883);
		
		if(p1==p3){
			System.out.println("Somos el mismo");
		}else {
			System.out.println("Somos parecidos" + p1.toString());
			System.out.println("Somos parecidos" + p3.toString());
		}
		
			
		
	}

}
