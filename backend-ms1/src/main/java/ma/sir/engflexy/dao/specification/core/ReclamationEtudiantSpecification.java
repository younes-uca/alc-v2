package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.ReclamationEtudiantCriteria;
import ma.sir.engflexy.bean.core.ReclamationEtudiant;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ReclamationEtudiantSpecification extends  AbstractSpecification<ReclamationEtudiantCriteria, ReclamationEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("dateReclamation", criteria.getDateReclamation(), criteria.getDateReclamationFrom(), criteria.getDateReclamationTo());
        addPredicate("setFrom", criteria.getSetFrom(),criteria.getSetFromLike());
        addPredicate("img", criteria.getImg(),criteria.getImgLike());
        addPredicateBool("traite", criteria.getTraite());
        addPredicate("dateTraitement", criteria.getDateTraitement(), criteria.getDateTraitementFrom(), criteria.getDateTraitementTo());
        addPredicate("dateReponse", criteria.getDateReponse(), criteria.getDateReponseFrom(), criteria.getDateReponseTo());
        addPredicateBool("postView", criteria.getPostView());
        addPredicate("objetReclamationEtudiant", criteria.getObjetReclamationEtudiant(),criteria.getObjetReclamationEtudiantLike());
        addPredicate("username", criteria.getUsername(),criteria.getUsernameLike());
        addPredicateFk("typeReclamationEtudiant","id", criteria.getTypeReclamationEtudiant()==null?null:criteria.getTypeReclamationEtudiant().getId());
        addPredicateFk("typeReclamationEtudiant","id", criteria.getTypeReclamationEtudiants());
        addPredicateFk("typeReclamationEtudiant","code", criteria.getTypeReclamationEtudiant()==null?null:criteria.getTypeReclamationEtudiant().getCode());
    }

    public ReclamationEtudiantSpecification(ReclamationEtudiantCriteria criteria) {
        super(criteria);
    }

    public ReclamationEtudiantSpecification(ReclamationEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
