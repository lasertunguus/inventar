package ee.ttu.tali.idu1550.inventory;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_IDENTIFIER", catalog = "INVENTORY")
public class ProductIdentifier {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private ProductType productType;
    
    public ProductIdentifier() {}

    public ProductIdentifier(ProductType productType) {
        this.productType = productType;
    }

    @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "id")
    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

}
