package net.anejjar.pres;

import net.anejjar.dao.IDao;
import net.anejjar.metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    //FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao d = (IDao) cDao.newInstance();
        System.out.println(d.getData());



    }
}
