package ee.ttu.tali.idu1550.inventory.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY", catalog = "INVENTORY")
public class Inventory {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Integer id;

    @OneToMany(mappedBy = "INVENTORY_FK")
    private List<InventoryEntry> inventoryEntries;

    public Inventory() {
    }

    public List<InventoryEntry> getInventoryEntries() {
        return inventoryEntries;
    }

}
