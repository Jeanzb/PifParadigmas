package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class EspeciePlanta implements Serializable {
    private String nombreComun;
    private String nombreCientifico;
    private LocalDate fechaPlantacion;

    public EspeciePlanta(String nombreComun, String nombreCientifico, LocalDate fechaPlantacion) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.fechaPlantacion = fechaPlantacion;
    }

    @Override
    public String toString() {
        return nombreComun + " (" + nombreCientifico + "), Plantado el: " + fechaPlantacion;
    }
}
