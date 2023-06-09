package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.LangueCriteria;
import ma.sir.engflexy.bean.core.Langue;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LangueSpecification extends  AbstractSpecification<LangueCriteria, Langue>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public LangueSpecification(LangueCriteria criteria) {
        super(criteria);
    }

    public LangueSpecification(LangueCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
