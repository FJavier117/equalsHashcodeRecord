import java.util.Objects;

public class Estudiante {
    private String nombre;
    private String edad;
    private String carrera;

    public Estudiante(String nombre, String edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", carrera='" + carrera + '\'' +
                '}';
    }

    public Estudiante(String nombre) {
        this(nombre," ", " ");
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante that)) return false;
        return Objects.equals(nombre, that.nombre) && Objects.equals(edad, that.edad) && Objects.equals(carrera, that.carrera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, carrera);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
