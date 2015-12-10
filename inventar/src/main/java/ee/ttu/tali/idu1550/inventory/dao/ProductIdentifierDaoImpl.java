package ee.ttu.tali.idu1550.inventory.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import ee.ttu.tali.idu1550.inventory.model.ProductIdentifier;
import ee.ttu.tali.idu1550.inventory.model.ProductInstance;
import ee.ttu.tali.idu1550.inventory.model.ProductType;

public class ProductIdentifierDaoImpl extends GenericHibernateDao<ProductIdentifier, Integer>
        implements ProductIdentifierDao {

    @Override
    public List<ProductIdentifier> findByProductType(ProductType productType) {
        // TODO
        return null;
    }

}
