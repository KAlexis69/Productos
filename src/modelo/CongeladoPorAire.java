/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class CongeladoPorAire extends ProductoCongelado {
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public CongeladoPorAire() {
    }

    
    public CongeladoPorAire(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaRecomendada,
                            double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public double getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }

    public void setPorcentajeNitrogeno(double porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }

    public double getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }

    public void setPorcentajeOxigeno(double porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }

    public double getPorcentajeDioxidoCarbono() {
        return porcentajeDioxidoCarbono;
    }

    public void setPorcentajeDioxidoCarbono(double porcentajeDioxidoCarbono) {
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
    }

    public double getPorcentajeVaporAgua() {
        return porcentajeVaporAgua;
    }

    public void setPorcentajeVaporAgua(double porcentajeVaporAgua) {
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public String toString() {
        return "CongeladoPorAire{" +
                "porcentajeNitrogeno=" + porcentajeNitrogeno +
                ", porcentajeOxigeno=" + porcentajeOxigeno +
                ", porcentajeDioxidoCarbono=" + porcentajeDioxidoCarbono +
                ", porcentajeVaporAgua=" + porcentajeVaporAgua +
                "} " + super.toString();
    }
}
