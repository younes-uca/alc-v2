package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecificationEnhanced;
import ma.sir.engflexy.dao.criteria.core.ServicesCriteria;
import ma.sir.engflexy.bean.core.Services;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ServicesSpecification extends  AbstractSpecificationEnhanced<ServicesCriteria, Services>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public ServicesSpecification(ServicesCriteria criteria) {
        super(criteria);
    }

    public ServicesSpecification(ServicesCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
