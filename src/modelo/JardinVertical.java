package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class JardinVertical implements Serializable {
    private int id;
    private String Ubicacion;
    private List<EspeciePlanta> especiesPlantas;
    private String estado;
    private List<Mantenimiento> historialMantenimientos;
    private double nivelRiego;

    public JardinVertical(int id, String ubicacion, List<EspeciePlanta> especiesPlantas, String estado, List<Mantenimiento> historialMantenimientos, double nivelRiego) {
        this.id = id;
        this.Ubicacion = ubicacion;
        this.estado = estado;
        this.especiesPlantas = new ArrayList<>();
        this.historialMantenimientos = new ArrayList<>();
        this.nivelRiego = nivelRiego;
    }

    public void agregarEspeciePlanta(EspeciePlanta especiePlanta) {
        especiesPlantas.add(especiePlanta);
    }
    public void agregarHistorialMantenimiento(Mantenimiento m) {
        historialMantenimientos.add(m);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public List<EspeciePlanta> getEspeciesPlantas() {
        return especiesPlantas;
    }

    public void setEspeciesPlantas(List<EspeciePlanta> especiesPlantas) {
        this.especiesPlantas = especiesPlantas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Mantenimiento> getHistorialMantenimientos() {
        return historialMantenimientos;
    }

    public void setHistorialMantenimientos(List<Mantenimiento> historialMantenimientos) {
        this.historialMantenimientos = historialMantenimientos;
    }

    public double getNivelRiego() {
        return nivelRiego;
    }

    public void setNivelRiego(double nivelRiego) {
        this.nivelRiego = nivelRiego;
    }
}
