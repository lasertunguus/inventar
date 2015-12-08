package ee.ttu.tali.idu1550.inventory.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_INSTANCE", catalog = "INVENTORY")
public class ProductInstance {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Integer id;
    @Column(name = "NAME", nullable = false)
    private String name;
    // private Reservation reservation
    @ManyToOne() // (cascade = { CascadeType.PERSIST }) don't want REMOVE
    @JoinColumn(name = "PRODUCT_TYPE_FK")
    private ProductType productType;

    public ProductInstance() {
    }

    public ProductInstance(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

}
