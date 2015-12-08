package ee.ttu.tali.idu1550.inventory.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY_ENTRY", catalog = "INVENTORY")
public class InventoryEntry {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Integer id;
    @OneToMany
    @JoinColumn(name = "PRODUCT_INSTANCE_FK")
    private List<ProductInstance> productInstances;
    @OneToOne
    @JoinColumn(name = "PRODUCT_TYPE_FK")
    private ProductType productType;

    public InventoryEntry() {
    }

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

    public List<ProductInstance> getProductInstances() {
        return productInstances;
    }

    public void setProductInstances(List<ProductInstance> productInstances) {
        this.productInstances = productInstances;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType type) {
        productType = type;
    }

    // if handle reservations
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
