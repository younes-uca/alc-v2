package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.StatutFreeTrialCriteria;
import ma.sir.engflexy.bean.core.StatutFreeTrial;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class StatutFreeTrialSpecification extends  AbstractSpecification<StatutFreeTrialCriteria, StatutFreeTrial>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("style", criteria.getStyle(),criteria.getStyleLike());
    }

    public StatutFreeTrialSpecification(StatutFreeTrialCriteria criteria) {
        super(criteria);
    }

    public StatutFreeTrialSpecification(StatutFreeTrialCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
