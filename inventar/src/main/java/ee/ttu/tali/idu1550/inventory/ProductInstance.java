package ee.ttu.tali.idu1550.inventory;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_INSTANCE", catalog = "INVENTORY")
public class ProductInstance {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    @Column(name = "NAME", nullable = false)
    private String name;
    // private Reservation reservation

    private ProductType productType;
    
    public ProductInstance() {}
    
    public ProductInstance(String name) {
        this.name = name;
    }

    @ManyToOne // (cascade = { CascadeType.PERSIST }) don't want to use REMOVE,
               // since that would delete the ProductType as well
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
