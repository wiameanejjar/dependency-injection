package net.anejjar.pres;

import net.anejjar.metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.anejjar");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("RES ="+ metier.calcul());
    }
}
