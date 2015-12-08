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
@Table(name = "PRODUCT_TYPE", catalog = "INVENTORY")
public class ProductType {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ID", nullable = false, unique = true)
    private Integer id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "ID")
    private ProductIdentifier productIdentifier;

    public ProductType() {
    }

    public ProductType(String name) {
        this.name = name;
    }

    public ProductType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ProductIdentifier getProductIdentifier() {
        return productIdentifier;
    }

    public void setProductIdentifier(ProductIdentifier productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

}
