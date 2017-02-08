/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.expochick.frontend.transporte.converter;

import co.expochick.backend.persistence.entity.Pais;
import co.expochick.frontend.util.AbstractConverter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Mariana
 */
@FacesConverter(forClass = Pais.class)
public class PaisConverter extends AbstractConverter{

    public PaisConverter() {
        this.nombreMB = "paisManagedBean";
    }
    
}