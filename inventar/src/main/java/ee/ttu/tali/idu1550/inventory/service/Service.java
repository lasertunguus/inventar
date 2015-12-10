package ee.ttu.tali.idu1550.inventory.service;

import java.io.Serializable;

public interface Service<T, PK extends Serializable> {
    
    public PK create(T t);

    public T read(PK pk);

    public void update(T t);

    public void delete(T t);

}
