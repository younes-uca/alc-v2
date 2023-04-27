package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ParcoursHistoryCriteria;
import ma.sir.engflexy.bean.history.ParcoursHistory;


public class ParcoursHistorySpecification extends AbstractHistorySpecification<ParcoursHistoryCriteria, ParcoursHistory> {

    public ParcoursHistorySpecification(ParcoursHistoryCriteria criteria) {
        super(criteria);
    }

    public ParcoursHistorySpecification(ParcoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
