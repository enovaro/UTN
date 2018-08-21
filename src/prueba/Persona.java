package prueba;

public class Persona {
	
	public String nombre;
	
	public String apellido;
	
	public Integer dni;
	
	public Persona(Persona pers){
		this.nombre = pers.nombre;
		this.apellido = pers.apellido;
		this.dni = pers.dni;
						
	}
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellido(){
		return this.apellido;
	}
	
	public Integer getDni(){
		return this.dni;
	}
	
	public void setNombre (String nombre){
		this.nombre=nombre;
		
	}
	
	public void setApellido (String apellido){
		this.apellido=apellido;
	}
	
	public void setDni (Integer dni){
		
		this.dni=dni;
	}
	
	@Override
	public String toString(){
		return "algo"+toString();
	}
	
	
	

	
	

}
