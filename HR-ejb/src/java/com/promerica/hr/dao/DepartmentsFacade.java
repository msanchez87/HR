/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.promerica.hr.dao;

import com.promerica.hr.model.Departments;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author ssanchez
 */
@Stateless
@LocalBean
public class DepartmentsFacade extends AbstractFacade<Departments, Short> {

    public DepartmentsFacade() {
        super(Departments.class);
    }

    public List<Departments> findAll() {
        return super.findAll();
    }
}
