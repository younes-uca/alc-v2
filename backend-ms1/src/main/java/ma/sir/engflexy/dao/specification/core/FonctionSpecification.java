package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.FonctionCriteria;
import ma.sir.engflexy.bean.core.Fonction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FonctionSpecification extends  AbstractSpecification<FonctionCriteria, Fonction>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public FonctionSpecification(FonctionCriteria criteria) {
        super(criteria);
    }

    public FonctionSpecification(FonctionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
