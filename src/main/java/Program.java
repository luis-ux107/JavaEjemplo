
public class Program {

	public static void main(String[] args) {
		
		Alumno alumno=new Alumno();
		alumno.setEdad(22);
		alumno.setNombre(" luis enrique ");
		String nombre=alumno.getNombre();
		int edad=alumno.getEdad();
		System.out.print("mi nombre es"+nombre+"y tengo "+edad);

	}

}
