package ee.ttu.tali.idu1550.inventory.service;

import ee.ttu.tali.idu1550.inventory.dao.ProductTypeDaoImpl;
import ee.ttu.tali.idu1550.inventory.model.ProductType;

public class ProductTypeService implements Service<ProductType, Integer> {

    private final ProductTypeDaoImpl productTypeDao;

    public ProductTypeService() {
        productTypeDao = new ProductTypeDaoImpl();
    }

    @Override
    public Integer create(ProductType t) {
        return productTypeDao.create(t);
    }

    @Override
    public ProductType read(Integer pk) {
        return productTypeDao.read(pk);
    }

    @Override
    public void update(ProductType t) {
        productTypeDao.update(t);
    }

    @Override
    public void delete(ProductType t) {
        productTypeDao.delete(t);
    }

}
