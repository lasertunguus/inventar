package ee.ttu.tali.idu1550.inventory.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import ee.ttu.tali.idu1550.inventory.ProductInstance;
import ee.ttu.tali.idu1550.inventory.ProductType;

public class ProductTypeDaoImpl extends AbstractDao<ProductType> implements ProductTypeDao {

    @Override
    public void save(ProductType productType) {
        persist(productType);
    }

    @Override
    public void update(ProductType productType) {
        update(productType);
    }

    @Override
    public ProductType findByName(String name) {
        Criteria criteria = getSession().createCriteria(ProductInstance.class);
        criteria.add(Restrictions.eq("name", name));
        return (ProductType) criteria.uniqueResult();
    }

}
