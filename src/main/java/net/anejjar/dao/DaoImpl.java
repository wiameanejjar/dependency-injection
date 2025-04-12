package net.anejjar.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donées  ");
        double t = 34;
        return t;
    }
}
