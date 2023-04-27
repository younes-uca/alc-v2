package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.WorkloadBonusCriteria;
import ma.sir.engflexy.bean.core.WorkloadBonus;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class WorkloadBonusSpecification extends  AbstractSpecification<WorkloadBonusCriteria, WorkloadBonus>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateInt("nombreSession", criteria.getNombreSession(), criteria.getNombreSessionMin(), criteria.getNombreSessionMax());
        addPredicateBigDecimal("prix", criteria.getPrix(), criteria.getPrixMin(), criteria.getPrixMax());
    }

    public WorkloadBonusSpecification(WorkloadBonusCriteria criteria) {
        super(criteria);
    }

    public WorkloadBonusSpecification(WorkloadBonusCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
