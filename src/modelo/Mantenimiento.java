package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Mantenimiento implements Serializable {
    private LocalDate fecha;
    private String tipo;
    private String observaciones;

    public Mantenimiento(LocalDate fecha, String tipo, String observaciones) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Mantenimiento: " + tipo + " en " + fecha + ". Observaciones: " + observaciones;
    }

}
