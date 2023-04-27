package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.TrancheHoraireProfCriteria;
import ma.sir.engflexy.bean.core.TrancheHoraireProf;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TrancheHoraireProfSpecification extends  AbstractSpecification<TrancheHoraireProfCriteria, TrancheHoraireProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("startHour", criteria.getStartHour(),criteria.getStartHourLike());
        addPredicate("endHour", criteria.getEndHour(),criteria.getEndHourLike());
        addPredicateInt("day", criteria.getDay(), criteria.getDayMin(), criteria.getDayMax());
        addPredicateInt("groupIndex", criteria.getGroupIndex(), criteria.getGroupIndexMin(), criteria.getGroupIndexMax());
        addPredicateLong("profsId", criteria.getProfsId(), criteria.getProfsIdMin(), criteria.getProfsIdMax());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","id", criteria.getProfs());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
    }

    public TrancheHoraireProfSpecification(TrancheHoraireProfCriteria criteria) {
        super(criteria);
    }

    public TrancheHoraireProfSpecification(TrancheHoraireProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
