/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.expochick.frontend.login.converter;

import co.expochick.backend.persistence.entity.Telefono;
import co.expochick.frontend.util.AbstractConverter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Mariana
 */
@FacesConverter(forClass = Telefono.class)
public class TelefonoConverter extends AbstractConverter{

    public TelefonoConverter() {
        this.nombreMB = "telefonoManagedBean";
    }
    
}