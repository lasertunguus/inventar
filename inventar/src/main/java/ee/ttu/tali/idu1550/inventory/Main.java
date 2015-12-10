package ee.ttu.tali.idu1550.inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ee.ttu.tali.idu1550.inventory.dao.ProductTypeDaoImpl;
import ee.ttu.tali.idu1550.inventory.model.Inventory;
import ee.ttu.tali.idu1550.inventory.model.InventoryEntry;
import ee.ttu.tali.idu1550.inventory.model.ProductIdentifier;
import ee.ttu.tali.idu1550.inventory.model.ProductType;
import ee.ttu.tali.idu1550.inventory.service.InventoryService;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("org.h2.Driver");
//        Connection conn = DriverManager.getConnection("jdbc:h2:./db.h2", "admin", "admin123");
        try {
            Inventory inventory = new Inventory();
            InventoryService inventoryService = new InventoryService();

            ProductType type1 = new ProductType("type1", "dummy");
            ProductType type2 = new ProductType("type2", "dummy");

            ProductTypeDaoImpl productTypeDao = new ProductTypeDaoImpl();

            System.out.println("Creating inventory");
            Integer inventoryId = inventoryService.create(inventory);
            System.out.println("Created inventory with id=" + inventoryId);

            System.out.println("Creating product types");
            productTypeDao.create(type1);
            productTypeDao.create(type2);
            
            System.out.println("Creating product identifiers");
            
//            productInstanceDao.create(type1);
//            productInstanceDao.create(type2);

            InventoryEntry entry = new InventoryEntry();
        } finally {
//            conn.close();
        }
        // entry.se
        // inv.addInventoryEntry(entry);
    }

}
