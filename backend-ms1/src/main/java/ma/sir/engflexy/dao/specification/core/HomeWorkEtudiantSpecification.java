package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.HomeWorkEtudiantCriteria;
import ma.sir.engflexy.bean.core.HomeWorkEtudiant;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class HomeWorkEtudiantSpecification extends  AbstractSpecification<HomeWorkEtudiantCriteria, HomeWorkEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("note", criteria.getNote(), criteria.getNoteMin(), criteria.getNoteMax());
        addPredicate("dateHomeWork", criteria.getDateHomeWork(), criteria.getDateHomeWorkFrom(), criteria.getDateHomeWorkTo());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiants());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
        addPredicateFk("homeWork","id", criteria.getHomeWork()==null?null:criteria.getHomeWork().getId());
        addPredicateFk("homeWork","id", criteria.getHomeWorks());
        addPredicateFk("resultatHomeWork","id", criteria.getResultatHomeWork()==null?null:criteria.getResultatHomeWork().getId());
        addPredicateFk("resultatHomeWork","id", criteria.getResultatHomeWorks());
        addPredicateFk("resultatHomeWork","code", criteria.getResultatHomeWork()==null?null:criteria.getResultatHomeWork().getCode());
    }

    public HomeWorkEtudiantSpecification(HomeWorkEtudiantCriteria criteria) {
        super(criteria);
    }

    public HomeWorkEtudiantSpecification(HomeWorkEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
