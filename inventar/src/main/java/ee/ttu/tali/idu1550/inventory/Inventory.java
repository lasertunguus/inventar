package ee.ttu.tali.idu1550.inventory;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY", catalog = "INVENTORY")
public class Inventory {
    
    public void addInventoryEntry(InventoryEntry entry) {
        // TODO
    }
    
    public void removeInvetoryEntry(InventoryEntry entry) {
        // TODO
    }
    
    public InventoryEntry[] getInventoryEntries() {
        // TODO
        return null;
    }
    
    public InventoryEntry[] findInventoryEntry(ProductIdentifier identifier) {
        // TODO
        return null;
    }
    
    public ProductType[] getProductTypes() {
        // TODO
        return null;
    }
    
    // Reservations?
    
    // if handle reservations
    public /* Reservation */ Object makeReservation(/* ReservationRequest */ Object request) {
        return null;
    }
    
    public /* Reservation */ boolean cancelReservation(/* ReservationIdentifier */ Object identifier, /* RuleContext */ Object cancellationContext) {
        return false;
    }
    
    public /* Reservation[] */ Object[] getReservations() {
        return null;
    }
    
    public /* Reservation */ Object findReservation( /* ReservationIdentifier */ Object identifier) {
        return null;
    }
    
    // public Reservation[] findReservation(Date start, Date end, String requesterName)

}
