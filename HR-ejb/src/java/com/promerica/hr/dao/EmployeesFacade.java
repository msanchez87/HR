/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.promerica.hr.dao;

import com.promerica.hr.model.Employees;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ssanchez
 */
@Stateless
@LocalBean
@WebService
public class EmployeesFacade extends AbstractFacade<Employees, Integer>{

    public EmployeesFacade(){
        super(Employees.class);
    }
    
    public List<Employees> findAll(){
        return super.findAll();
    }
}
