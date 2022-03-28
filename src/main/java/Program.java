
public class Program {

	public static void main(String[] args) {
		
		Alumno alumno=new Alumno();
		alumno.setEdad(22);
		alumno.setNombre(" luis enrique ");
		String nombre=alumno.getNombre();
		int edad=alumno.getEdad();
		
		Mascota mascota=new Mascota();
		mascota.setEdad(4);
		mascota.setRaza("piitbul");
		String raza= mascota.getRaza();
		int edadanimal=mascota.getEdad();
		
		System.out.print("mi nombre es"+nombre+"y tengo "+edad +" ademas, mi mascota es un "+ raza+" y tiene "+edadanimal +" años");
		

	}

}
