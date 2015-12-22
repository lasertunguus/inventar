package ee.ttu.tali.idu1550.inventory;

import java.sql.SQLException;

import ee.ttu.tali.idu1550.inventory.model.Inventory;
import ee.ttu.tali.idu1550.inventory.model.InventoryEntry;
import ee.ttu.tali.idu1550.inventory.model.ProductIdentifier;
import ee.ttu.tali.idu1550.inventory.model.ProductType;
import ee.ttu.tali.idu1550.inventory.service.InventoryService;
import ee.ttu.tali.idu1550.inventory.service.ProductIdentifierService;
import ee.ttu.tali.idu1550.inventory.service.ProductTypeService;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("org.h2.Driver");
//        Connection conn = DriverManager.getConnection("jdbc:h2:./db.h2", "admin", "admin123");
        try {
            Inventory inventory = new Inventory();
            InventoryService inventoryService = new InventoryService();
            ProductTypeService productTypeService = new ProductTypeService();
            ProductIdentifierService productIdentifierService = new ProductIdentifierService();

            ProductType type1 = new ProductType("type1", "dummy");
            ProductType type2 = new ProductType("type2", "dummy");
            
            ProductIdentifier identifier1 = new ProductIdentifier("identifier1", type1);
            ProductIdentifier identifier2 = new ProductIdentifier("identifier2", type2);
            
            System.out.println("Creating product identifiers");
            productIdentifierService.create(identifier1);
            productIdentifierService.create(identifier2);
            
            System.out.println("Setting identifiers to types");
            type1.setProductIdentifier(identifier1);
            type2.setProductIdentifier(identifier2);

            System.out.println("Creating inventory");
            Integer inventoryId = inventoryService.create(inventory);
            System.out.println("Created inventory with id=" + inventoryId);

            System.out.println("Creating product types");
            productTypeService.create(type1);
            productTypeService.create(type2);
            
            
            
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
