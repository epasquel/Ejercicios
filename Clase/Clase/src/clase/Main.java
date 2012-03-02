
package clase;


public class Main {

    public static void main(String[] args) {
        
        Alumno objAlumno1 = new Alumno();
        Alumno objAlumno2 = new Alumno();
        Alumno objAlumno3 = new Alumno();
        Alumno objAlumno4 = new Alumno();

        objAlumno1.setNombre("Ebert");
        objAlumno2.setNombre("Bryan");
        objAlumno3.setNombre("Alisson");
        objAlumno4.setNombre("Javier");

        System.out.println(objAlumno2.getNombre());
        System.out.println(objAlumno1.saludar(objAlumno2));
        System.out.println(objAlumno2.saludar(objAlumno3));
        System.out.println(objAlumno1.saludar(objAlumno3));
        System.out.println(objAlumno3.saludar(objAlumno4));


    }

}
