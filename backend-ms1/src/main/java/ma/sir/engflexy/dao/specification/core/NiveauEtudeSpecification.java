package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.NiveauEtudeCriteria;
import ma.sir.engflexy.bean.core.NiveauEtude;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class NiveauEtudeSpecification extends  AbstractSpecification<NiveauEtudeCriteria, NiveauEtude>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public NiveauEtudeSpecification(NiveauEtudeCriteria criteria) {
        super(criteria);
    }

    public NiveauEtudeSpecification(NiveauEtudeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
