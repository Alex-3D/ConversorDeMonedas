/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programadeconversion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alex3D
 */
public class ControlConversor implements ActionListener {
    
    private InterfazVista vista;
    private ConversorPesosADolares modelo;
    
    public ControlConversor(InterfazVista vista, ConversorPesosADolares modelo)
    {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void actionPerformed(ActionEvent evento) {
        double cantidad = vista.getCantidad();
        if ( evento.getActionCommand().equals(InterfazVista.APESOS) ) {
            vista.escribeCambio( cantidad + " dolares son: "
            + modelo.convertirApesos(cantidad) + " pesos" );
        }
        else if ( evento.getActionCommand().equals(InterfazVista.ADOLARES)) {
            vista.escribeCambio( cantidad + " pesos son: "
            + modelo.convertirAmoneda(cantidad) + " dolares" );
        }
        else
            vista.escribeCambio( "ERROR" );
     }
}
