package claseunoabril;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable {

    int id;
    String nombre;
    LocalDate fechaNacimiento; // Formato YYYY-MM-DD

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
    }

    public int edad() {
        return (int) this.fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public String toString() {
        return "ID: " + this.id
                + " Edad: " + edad()
                + " Nombre: " + this.nombre + "\n";

    }

    @Override
    public int compareTo(Object a) {
        Socio socioComparar = (Socio) a;

        return this.edad() - socioComparar.edad();

    }
}
