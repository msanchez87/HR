/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.promerica.hr.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author ssanchez
 * @param <Entity>: contiene la entidad
 * @param <PrimaryKey>: contiene la llave primaria
 */
public abstract class AbstractFacade<Entity, PrimaryKey> {

    @PersistenceContext
    protected EntityManager entityManager;
    protected Class<Entity> entityClass;

    public AbstractFacade(Class<Entity> entityClass) {
        this.entityClass = entityClass;
    }

    public void create(Entity entity) {
        entityManager.persist(entity);
    }

    public Entity find(PrimaryKey primaryKey) {
        return entityManager.find(entityClass, primaryKey);
    }

    public void update(Entity entity) {
        entityManager.merge(entity);
    }

    public void delete(Entity entity) {
        entityManager.remove(entityManager.merge(entity));
    }

    public List<Entity> findAll() {
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery(entityClass);
        return entityManager.createQuery(cq).getResultList();
    }
}
