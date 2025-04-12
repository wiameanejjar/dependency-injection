package net.anejjar.metier;

import net.anejjar.dao.IDao;

public class IMetierImpl implements IMetier {

    private IDao dao;  // Couplage faible

    /**
     * constructeur avec paramétre pour injecter dans l'attribut
     * dao , un objet d'une classe qui implément l'interface IDao
     * au momznt de l'instantiation (la création de l'objet) */

    public IMetierImpl(IDao dao) {

        this.dao = dao;
    }
    /**
     * si j'utilise le constructeur sans paramétre le moyen qui
     reste pour faire l'injection c'est d'utiliser le setter  */

    public IMetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI/2 * Math.cos(t);
        return res;
    }

    /**
     * setDao c'est pour injecter dans l'attribut dao
     * un Objet de type IDAO càd un objet d'une classe
     * qui implémente l'interface IDAO
     * après l'instantiation
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
