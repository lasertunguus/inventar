package ee.ttu.tali.idu1550.inventory.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import ee.ttu.tali.idu1550.inventory.ProductInstance;
import ee.ttu.tali.idu1550.inventory.ProductType;

public class ProductTypeDaoImpl extends GenericHibernateDao<ProductType, Integer> implements ProductTypeDao {

    @Override
    public ProductType findByName(String name) {
        Criteria criteria = getSession().createCriteria(ProductInstance.class);
        criteria.add(Restrictions.eq("name", name));
        return (ProductType) criteria.uniqueResult();
    }

}
