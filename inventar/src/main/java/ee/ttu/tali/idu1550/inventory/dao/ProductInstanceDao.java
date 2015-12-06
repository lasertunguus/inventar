package ee.ttu.tali.idu1550.inventory.dao;

import ee.ttu.tali.idu1550.inventory.ProductInstance;

public interface ProductInstanceDao {
    
    public ProductInstance findByName(String name);
    
}
