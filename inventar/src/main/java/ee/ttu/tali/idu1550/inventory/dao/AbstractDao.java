package ee.ttu.tali.idu1550.inventory.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractDao<T> {
    
    private SessionFactory sessionFactory;
    
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    public void persist(T entity) {
        getSession().persist(entity);
    }
    
    public void delete(T entity) {
        getSession().delete(entity);
    }

}
