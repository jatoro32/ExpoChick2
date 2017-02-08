/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.expochick.frontend.login.converter;

import co.expochick.backend.persistence.entity.Cliente;
import co.expochick.frontend.util.AbstractConverter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Mariana
 */
@FacesConverter(forClass = Cliente.class)
public class ClienteConverter extends AbstractConverter{

    public ClienteConverter() {
        this.nombreMB = "clienteManagedBean";
    }
    
}