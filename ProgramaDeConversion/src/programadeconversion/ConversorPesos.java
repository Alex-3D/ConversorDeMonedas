/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadeconversion;

/**
 *
 * @author Alex3D
 */
public class ConversorPesos {
    protected final double cambio;
    
    public ConversorPesos(double factorCambio){
        cambio = factorCambio;
    }
    
    public double convertirAmoneda(double cantidadMonedas) {
        return cantidadMonedas*cambio;
    }
    
    public double convertirApesos(double cantidadMonedas){
        return cantidadMonedas/cambio;
    }
}
