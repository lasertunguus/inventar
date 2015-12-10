package ee.ttu.tali.idu1550.inventory.service;

import ee.ttu.tali.idu1550.inventory.dao.ProductIdentifierDaoImpl;
import ee.ttu.tali.idu1550.inventory.model.ProductIdentifier;

public class ProductIdentifierService implements Service<ProductIdentifier, Integer> {

    private final ProductIdentifierDaoImpl productIdentifierDao;

    public ProductIdentifierService() {
        productIdentifierDao = new ProductIdentifierDaoImpl();
    }

    @Override
    public Integer create(ProductIdentifier t) {
        return productIdentifierDao.create(t);
    }

    @Override
    public ProductIdentifier read(Integer pk) {
        return productIdentifierDao.read(pk);
    }

    @Override
    public void update(ProductIdentifier t) {
        productIdentifierDao.update(t);
    }

    @Override
    public void delete(ProductIdentifier t) {
        productIdentifierDao.delete(t);
    }

}
