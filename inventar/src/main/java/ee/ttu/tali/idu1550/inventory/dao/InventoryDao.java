package ee.ttu.tali.idu1550.inventory.dao;

import java.util.List;

import ee.ttu.tali.idu1550.inventory.model.Inventory;
import ee.ttu.tali.idu1550.inventory.model.InventoryEntry;
import ee.ttu.tali.idu1550.inventory.model.ProductIdentifier;
import ee.ttu.tali.idu1550.inventory.model.ProductType;

public interface InventoryDao {
    
    public List<InventoryEntry> findInventoryEntry(ProductIdentifier identifier);
    
    public List<ProductType> getProductTypes(Inventory inventory);
    // Reservations?

    // if handle reservations
//    public /* Reservation */ Object makeReservation(/* ReservationRequest */ Object request) {
//        return null;
//    }
//
//    public /* Reservation */ boolean cancelReservation(/* ReservationIdentifier */ Object identifier,
//            /* RuleContext */ Object cancellationContext) {
//        return false;
//    }
//
//    public /* Reservation[] */ Object[] getReservations() {
//        return null;
//    }
//
//    public /* Reservation */ Object findReservation( /* ReservationIdentifier */ Object identifier) {
//        return null;
//    }

    // public Reservation[] findReservation(Date start, Date end, String
    // requesterName)
    
}
