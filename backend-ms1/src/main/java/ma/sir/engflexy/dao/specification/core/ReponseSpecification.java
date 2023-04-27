package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.ReponseCriteria;
import ma.sir.engflexy.bean.core.Reponse;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ReponseSpecification extends  AbstractSpecification<ReponseCriteria, Reponse>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("lib", criteria.getLib(),criteria.getLibLike());
        addPredicateLong("numero", criteria.getNumero(), criteria.getNumeroMin(), criteria.getNumeroMax());
        addPredicateFk("etatReponse","id", criteria.getEtatReponse()==null?null:criteria.getEtatReponse().getId());
        addPredicateFk("etatReponse","id", criteria.getEtatReponses());
        addPredicateFk("etatReponse","code", criteria.getEtatReponse()==null?null:criteria.getEtatReponse().getCode());
        addPredicateFk("question","id", criteria.getQuestion()==null?null:criteria.getQuestion().getId());
        addPredicateFk("question","id", criteria.getQuestions());
        addPredicateFk("question","libelle", criteria.getQuestion()==null?null:criteria.getQuestion().getLibelle());
    }

    public ReponseSpecification(ReponseCriteria criteria) {
        super(criteria);
    }

    public ReponseSpecification(ReponseCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
