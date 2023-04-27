package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.EtatCoursHistoryCriteria;
import ma.sir.engflexy.bean.history.EtatCoursHistory;


public class EtatCoursHistorySpecification extends AbstractHistorySpecification<EtatCoursHistoryCriteria, EtatCoursHistory> {

    public EtatCoursHistorySpecification(EtatCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatCoursHistorySpecification(EtatCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
