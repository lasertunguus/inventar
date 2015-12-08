package ee.ttu.tali.idu1550.inventory.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;

import ee.ttu.tali.idu1550.inventory.config.HibernateConnector;

public abstract class GenericHibernateDao<T, PK extends Serializable> implements GenericDao<T, PK> {

    protected Class<T> entityClass;

    private final HibernateConnector hibernateConnector;

    protected Session getSession() {
        return hibernateConnector.getSession();
    }

    @SuppressWarnings("unchecked")
    public GenericHibernateDao() {
        hibernateConnector = HibernateConnector.getInstance();
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }

    @SuppressWarnings("unchecked")
    @Override
    public PK create(T t) {
        return (PK) getSession().save(t);
    }

    @Override
    public T read(PK id) {
        return (T) getSession().get(entityClass, id);
    }

    @Override
    public void update(T t) {
        getSession().update(t);
    }

    @Override
    public void delete(T t) {
        getSession().delete(t);
    }

}
