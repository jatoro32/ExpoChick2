/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.expochick.frontend.exportacion.converter;

import co.expochick.backend.persistence.entity.DetallePedido;
import co.expochick.frontend.util.AbstractConverter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author USUARIO
 */
@FacesConverter(forClass = DetallePedido.class)
public class DetallePedidoConverter extends AbstractConverter{

    public DetallePedidoConverter() {
        this.nombreMB = "detallePedidoManagedBean";
    }
    
}
