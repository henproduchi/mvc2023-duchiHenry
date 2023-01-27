/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchenryd;

import Controlador.ControllerMP;
import Vista.VistaMP;

/**
 *
 * @author Dell
 */
public class MvcHenryd {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        VistaMP vista = new VistaMP();
        ControllerMP controller = new ControllerMP(vista);
        controller.iniciaControl();
    }
}

