/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.expochick.frontend.transporte.converter;

import co.expochick.backend.persistence.entity.Continente;
import co.expochick.frontend.util.AbstractConverter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Mariana
 */
@FacesConverter(forClass = Continente.class)
public class ContinenteConverter extends AbstractConverter{

    public ContinenteConverter() {
        this.nombreMB = "continenteManagedBean";
    }
    
}