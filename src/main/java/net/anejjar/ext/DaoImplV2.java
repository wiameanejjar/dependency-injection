package net.anejjar.ext;

import net.anejjar.dao.IDao;


public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteurs ...");
        double t = 12;
        return t;
    }
}
