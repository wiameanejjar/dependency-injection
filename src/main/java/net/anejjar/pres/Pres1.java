package net.anejjar.pres;

import net.anejjar.dao.DaoImpl;
import net.anejjar.ext.DaoImplV2;
import net.anejjar.metier.IMetierImpl;


public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        //DaoImpl d = new DaoImpl();
        IMetierImpl metier = new IMetierImpl(d);
        metier.setDao(d); // Injection des dépendances via le setter
        System.out.println("RES ="+metier.calcul());
    }
}
