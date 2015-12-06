package ee.ttu.tali.idu1550.inventory.dao;

import ee.ttu.tali.idu1550.inventory.ProductType;

public interface ProductTypeDao {
    
    public ProductType findByName(String name);

}
