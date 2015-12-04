package ee.ttu.tali.idu1550.inventory.dao;

import ee.ttu.tali.idu1550.inventory.ProductType;

public interface ProductTypeDao {
    
    public void save(ProductType productType);
    
    public void update(ProductType productType);
    
    public ProductType findByName(String name);

}
