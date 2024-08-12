/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class ProductoRefrigerado extends Producto {
    private String codigoOrganismo;
    private String fechaEnvasado;
    private double temperaturaRecomendada;
    private String paisOrigen;

    public ProductoRefrigerado() {
    }

    
    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoOrganismo, String fechaEnvasado, double temperaturaRecomendada, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisOrigen = paisOrigen;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" +
                "codigoOrganismo='" + codigoOrganismo + '\'' +
                ", fechaEnvasado='" + fechaEnvasado + '\'' +
                ", temperaturaRecomendada=" + temperaturaRecomendada +
                ", paisOrigen='" + paisOrigen + '\'' +
                "} " + super.toString();
    }
}
