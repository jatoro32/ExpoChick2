/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.expochick.frontend.transporte.converter;

import co.expochick.backend.persistence.entity.Antinarcoticos;
import co.expochick.frontend.util.AbstractConverter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Mariana
 */
@FacesConverter(forClass = Antinarcoticos.class)
public class AntinarcoticosConverter extends AbstractConverter{

    public AntinarcoticosConverter() {
        this.nombreMB = "antinarcoticosManagedBean";
    }
    
}
