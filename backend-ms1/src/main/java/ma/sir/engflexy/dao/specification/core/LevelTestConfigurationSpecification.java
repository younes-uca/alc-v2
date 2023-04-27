package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.LevelTestConfigurationCriteria;
import ma.sir.engflexy.bean.core.LevelTestConfiguration;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LevelTestConfigurationSpecification extends  AbstractSpecification<LevelTestConfigurationCriteria, LevelTestConfiguration>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("noteMin", criteria.getNoteMin(), criteria.getNoteMinMin(), criteria.getNoteMinMax());
        addPredicateBigDecimal("noteMax", criteria.getNoteMax(), criteria.getNoteMaxMin(), criteria.getNoteMaxMax());
        addPredicateFk("parcours","id", criteria.getParcours()==null?null:criteria.getParcours().getId());
        addPredicateFk("parcours","id", criteria.getParcourss());
        addPredicateFk("parcours","code", criteria.getParcours()==null?null:criteria.getParcours().getCode());
    }

    public LevelTestConfigurationSpecification(LevelTestConfigurationCriteria criteria) {
        super(criteria);
    }

    public LevelTestConfigurationSpecification(LevelTestConfigurationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
