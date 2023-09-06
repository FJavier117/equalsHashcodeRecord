public class Main {
    public static void main(String[] args)
    {
        Estudiante estudiante1 = new Estudiante("Ejemplo");
        Estudiante estudiante2 = new Estudiante("Ejemplo");
        if (estudiante1.equals(estudiante2)){
            System.out.println("son iguales");
            System.out.println(estudiante1.hashCode());
            System.out.println(estudiante2.hashCode());
        }

        Estudiante1 es1 = new Estudiante1("nombre 1");
        Estudiante1 es2 = new Estudiante1("nombre 2");
        System.out.println(es1.nombre());
        System.out.println(es2.nombre());



    }
}