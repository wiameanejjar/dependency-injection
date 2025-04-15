package net.anejjar.ext;

import net.anejjar.dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository("d2")
//@Component("d2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteurs ...");
        double t = 12;
        return t;
    }
}
