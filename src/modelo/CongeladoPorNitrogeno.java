/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class CongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicionNitrogeno;

    public CongeladoPorNitrogeno() {
    }

    
    public CongeladoPorNitrogeno(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada,
                                 String metodoCongelacion, int tiempoExposicionNitrogeno) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getTiempoExposicionNitrogeno() {
        return tiempoExposicionNitrogeno;
    }

    public void setTiempoExposicionNitrogeno(int tiempoExposicionNitrogeno) {
        this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
    }

    @Override
    public String toString() {
        return "CongeladoPorNitrogeno{" +
                "metodoCongelacion='" + metodoCongelacion + '\'' +
                ", tiempoExposicionNitrogeno=" + tiempoExposicionNitrogeno +
                "} " + super.toString();
    }
}

