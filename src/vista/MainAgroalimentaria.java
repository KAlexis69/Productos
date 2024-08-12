/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.*;

public class MainAgroalimentaria {

    public static void main(String[] args) {
        // Creación de productos frescos
        ProductoFresco fresco = new ProductoFresco("2024-07-02", 1001, "2024-06-27", "Ecuador");
        System.out.println(fresco);

        // Creación de productos refrigerados
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("2024-12-02", 2002, "ORG-1234", "2024-06-28", 4.0, "España");
        System.out.println(refrigerado);

        // Creación de productos congelados
        ProductoCongelado congelado = new ProductoCongelado("2025-06-30", 3003, "2024-06-29", "Argentina", -18.0);
        System.out.println(congelado);

        // Creación de productos congelados por aire
        CongeladoPorAire congeladoAire = new CongeladoPorAire("2025-07-02", 4004, "2024-06-30", "Chile", -20.0, 78.0, 20.0, 1.0, 1.0);
        System.out.println(congeladoAire);

        // Creación de productos congelados por agua
        CongeladoPorAgua congeladoAgua = new CongeladoPorAgua("2025-07-03", 5005, "2024-07-01", "Brasil", -15.0, 3.5);
        System.out.println(congeladoAgua);

        // Creación de productos congelados por nitrógeno
        CongeladoPorNitrogeno congeladoNitrogeno = new CongeladoPorNitrogeno("2025-07-04", 6006, "2024-07-02", "Colombia", -25.0, "Método rápido", 30);
        System.out.println(congeladoNitrogeno);
    }
}
