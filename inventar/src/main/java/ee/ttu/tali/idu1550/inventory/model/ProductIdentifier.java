package ee.ttu.tali.idu1550.inventory.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
    @Column(name="ID", nullable=false, unique=true)
    private Integer id;
    private String identifier;
    @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name ="PRODUCT_TYPE_FK")
    private ProductType productType;
    
    public ProductIdentifier() {}

    public ProductIdentifier(String identifier, ProductType productType) {
        this.identifier = identifier;
        this.productType = productType;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

}
