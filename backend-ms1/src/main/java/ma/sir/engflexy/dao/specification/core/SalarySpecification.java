package  ma.sir.engflexy.dao.specification.core;

import ma.sir.engflexy.zynerator.specification.AbstractSpecification;
import ma.sir.engflexy.dao.criteria.core.SalaryCriteria;
import ma.sir.engflexy.bean.core.Salary;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SalarySpecification extends  AbstractSpecification<SalaryCriteria, Salary>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateInt("mois", criteria.getMois(), criteria.getMoisMin(), criteria.getMoisMax());
        addPredicateInt("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateBigDecimal("nbrSessionMensuel", criteria.getNbrSessionMensuel(), criteria.getNbrSessionMensuelMin(), criteria.getNbrSessionMensuelMax());
        addPredicateBool("payer", criteria.getPayer());
        addPredicateBigDecimal("totalPayment", criteria.getTotalPayment(), criteria.getTotalPaymentMin(), criteria.getTotalPaymentMax());
        addPredicateBigDecimal("totalBonusClassAverage", criteria.getTotalBonusClassAverage(), criteria.getTotalBonusClassAverageMin(), criteria.getTotalBonusClassAverageMax());
        addPredicateBigDecimal("totalBonusWorkload", criteria.getTotalBonusWorkload(), criteria.getTotalBonusWorkloadMin(), criteria.getTotalBonusWorkloadMax());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","id", criteria.getProfs());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
    }

    public SalarySpecification(SalaryCriteria criteria) {
        super(criteria);
    }

    public SalarySpecification(SalaryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
