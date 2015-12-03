package ee.ttu.tali.idu1550.inventory;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY_ENTRY", catalog = "INVENTORY")
public class InventoryEntry {

    public void addProductInstance(ProductInstance instance) {
        // TODO
    }

    public void addProductInstances(ProductIdentifier productIdentifier, int quantity, Date time) {
        // TODO
        // productIdentifier, orderIdentifier???, quantity, time
    }

    public void removeProductInstance(ProductInstance productInstance) {
        // TODO
    }

    // ??? vajalik? mille jaoks?
    public ProductInstance getAnyProductInstance() {
        // TODO
        return null;
    }

    public ProductInstance[] getProductInstances() {
        // TODO
        return null;
    }

    public ProductType getProductType() {
        // TODO
        return null;
    }

    public int getNumberAvailable() {
        // TODO
        return 0;
    }

    // if handle reservations
    public int getNumberReserved() {
        return 0;
    }

    // if handle reservations
    public boolean canAcceptReservationRequest(/* ReservationRequest */ Object request) {
        return false;
    }

}
