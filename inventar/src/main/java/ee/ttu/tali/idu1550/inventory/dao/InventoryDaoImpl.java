package ee.ttu.tali.idu1550.inventory.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ee.ttu.tali.idu1550.inventory.model.Inventory;
import ee.ttu.tali.idu1550.inventory.model.InventoryEntry;
import ee.ttu.tali.idu1550.inventory.model.ProductIdentifier;
import ee.ttu.tali.idu1550.inventory.model.ProductType;

public class InventoryDaoImpl extends GenericHibernateDao<Inventory, Integer>
        implements InventoryDao {

    @Override
    public List<InventoryEntry> findInventoryEntry(ProductIdentifier identifier) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ProductType> getProductTypes(Inventory inventory) {
        Set<ProductType> productTypes = new HashSet<>();
        for (InventoryEntry entry : inventory.getInventoryEntries()) {
            productTypes.add(entry.getProductType());
        }
        return new ArrayList<>(productTypes);
    }

}
