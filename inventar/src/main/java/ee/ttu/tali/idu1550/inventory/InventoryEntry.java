package ee.ttu.tali.idu1550.inventory;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY_ENTRY", catalog = "INVENTORY")
public class InventoryEntry {
    
    private List<ProductInstance> productInstances;
    private ProductType productType;

    public void addProductInstance(ProductInstance instance) {
        getProductInstances().add(instance);
    }

    public void addProductInstances(ProductIdentifier productIdentifier, int quantity, Date time) {
        // TODO
        // productIdentifier, orderIdentifier???, quantity, time
    }

    public void removeProductInstance(ProductInstance instance) {
        getProductInstances().remove(instance);
    }

    // ??? vajalik? mille jaoks?
    public ProductInstance getAnyProductInstance() {
        // TODO
        return null;
    }

    @OneToMany
    @JoinColumn(name="id")
    public List<ProductInstance> getProductInstances() {
        return productInstances;
    }

    public void setProductInstances(List<ProductInstance> productInstances) {
        this.productInstances = productInstances;
    }

    @OneToMany
    @JoinColumn(name="id")
    public ProductType getProductType() {
        return productType;
    }
    
    public void setProductType(ProductType type) {
        productType = type;
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
