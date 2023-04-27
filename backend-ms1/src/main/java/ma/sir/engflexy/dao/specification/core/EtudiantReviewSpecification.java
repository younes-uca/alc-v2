package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.EtudiantReviewCriteria;
import ma.sir.engflexy.bean.core.EtudiantReview;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EtudiantReviewSpecification extends  AbstractSpecification<EtudiantReviewCriteria, EtudiantReview>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("review", criteria.getReview(), criteria.getReviewMin(), criteria.getReviewMax());
        addPredicate("comment", criteria.getComment(),criteria.getCommentLike());
        addPredicate("dateReview", criteria.getDateReview(), criteria.getDateReviewFrom(), criteria.getDateReviewTo());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiants());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","id", criteria.getProfs());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("cours","id", criteria.getCours()==null?null:criteria.getCours().getId());
        addPredicateFk("cours","id", criteria.getCourss());
        addPredicateFk("cours","code", criteria.getCours()==null?null:criteria.getCours().getCode());
    }

    public EtudiantReviewSpecification(EtudiantReviewCriteria criteria) {
        super(criteria);
    }

    public EtudiantReviewSpecification(EtudiantReviewCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
