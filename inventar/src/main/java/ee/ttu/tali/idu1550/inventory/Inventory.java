package ee.ttu.tali.idu1550.inventory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY", catalog = "INVENTORY")
public class Inventory {
    
    public Inventory() {}

    private List<InventoryEntry> inventoryEntries;

    public void addInventoryEntry(InventoryEntry entry) {
        inventoryEntries.add(entry);
    }

    public void removeInvetoryEntry(InventoryEntry entry) {
        inventoryEntries.remove(entry);
    }

    @OneToMany
    @JoinColumn(name = "id")
    public List<InventoryEntry> getInventoryEntries() {
        return inventoryEntries;
    }

    public List<InventoryEntry> findInventoryEntry(ProductIdentifier identifier) {
        // TODO
        return null;
    }

    public List<ProductType> getProductTypes() {
        Set<ProductType> productTypes = new HashSet<>();
        for (InventoryEntry entry : inventoryEntries) {
            productTypes.add(entry.getProductType());
        }
        return new ArrayList<>(productTypes);
    }

    // Reservations?

    // if handle reservations
    public /* Reservation */ Object makeReservation(/* ReservationRequest */ Object request) {
        return null;
    }

    public /* Reservation */ boolean cancelReservation(/* ReservationIdentifier */ Object identifier,
            /* RuleContext */ Object cancellationContext) {
        return false;
    }

    public /* Reservation[] */ Object[] getReservations() {
        return null;
    }

    public /* Reservation */ Object findReservation( /* ReservationIdentifier */ Object identifier) {
        return null;
    }

    // public Reservation[] findReservation(Date start, Date end, String
    // requesterName)

}
