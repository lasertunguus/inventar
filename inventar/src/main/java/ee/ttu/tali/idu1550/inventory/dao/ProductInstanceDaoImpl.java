package ee.ttu.tali.idu1550.inventory.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import ee.ttu.tali.idu1550.inventory.ProductInstance;

public class ProductInstanceDaoImpl extends GenericHibernateDao<ProductInstance, Integer> implements ProductInstanceDao {

    @Override
    public ProductInstance findByName(String name) {
        Criteria criteria = getSession().createCriteria(ProductInstance.class);
        criteria.add(Restrictions.eq("name", name));
        return (ProductInstance) criteria.uniqueResult();
    }

}
