package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.TypeReclamationProfCriteria;
import ma.sir.engflexy.bean.core.TypeReclamationProf;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeReclamationProfSpecification extends  AbstractSpecification<TypeReclamationProfCriteria, TypeReclamationProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public TypeReclamationProfSpecification(TypeReclamationProfCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationProfSpecification(TypeReclamationProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
