package ee.ttu.tali.idu1550.inventory.dao;

import java.util.List;

import ee.ttu.tali.idu1550.inventory.model.ProductIdentifier;
import ee.ttu.tali.idu1550.inventory.model.ProductType;

public interface ProductIdentifierDao {
    
    public List<ProductIdentifier> findByProductType(ProductType productType);

}
