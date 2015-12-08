package ee.ttu.tali.idu1550.inventory.dao;

import ee.ttu.tali.idu1550.inventory.model.ProductInstance;

public interface ProductInstanceDao {
    
    public ProductInstance findByName(String name);
    
}
