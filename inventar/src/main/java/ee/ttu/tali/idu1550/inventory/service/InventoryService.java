package ee.ttu.tali.idu1550.inventory.service;

import java.util.List;

import ee.ttu.tali.idu1550.inventory.dao.InventoryDaoImpl;
import ee.ttu.tali.idu1550.inventory.model.Inventory;
import ee.ttu.tali.idu1550.inventory.model.InventoryEntry;
import ee.ttu.tali.idu1550.inventory.model.ProductIdentifier;
import ee.ttu.tali.idu1550.inventory.model.ProductType;

public class InventoryService {

    private static InventoryDaoImpl inventoryDao;

    public InventoryService() {
        inventoryDao = new InventoryDaoImpl();
    }

    public Integer create(Inventory inventory) {
        return inventoryDao.create(inventory);
    }

    public Inventory read(Integer id) {
        return inventoryDao.read(id);
    }

    public void update(Inventory inventory) {
        inventoryDao.update(inventory);
    }

    public void delete(Inventory inventory) {
        inventoryDao.delete(inventory);
    }

    public void addInventoryEntry(Inventory inventory, InventoryEntry entry) {
        inventory.getInventoryEntries().add(entry);
        inventoryDao.update(inventory);
    }

    public void removeInvetoryEntry(Inventory inventory, InventoryEntry entry) {
        inventory.getInventoryEntries().remove(entry);
        inventoryDao.update(inventory);
    }

    public List<InventoryEntry> findInventoryEntry(ProductIdentifier identifier) {
        // TODO
        return null;
    }

    public List<ProductType> getProductTypes(Inventory inventory) {
        return inventoryDao.getProductTypes(inventory);
    }

}
