package ee.ttu.tali.idu1550.inventory.service;

import ee.ttu.tali.idu1550.inventory.dao.InventoryEntryDao;
import ee.ttu.tali.idu1550.inventory.dao.InventoryEntryDaoImpl;
import ee.ttu.tali.idu1550.inventory.model.InventoryEntry;

public class InventoryEntryService implements Service<InventoryEntry, Integer> {
    
    private final InventoryEntryDao inventoryEntryDao;

    public InventoryEntryService() {
        inventoryEntryDao = new InventoryEntryDaoImpl();
    }

    @Override
    public Integer create(InventoryEntry t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InventoryEntry read(Integer pk) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(InventoryEntry t) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(InventoryEntry t) {
        // TODO Auto-generated method stub
        
    }

}
