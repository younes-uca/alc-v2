package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.CoursHistoryCriteria;
import ma.sir.engflexy.bean.history.CoursHistory;


public class CoursHistorySpecification extends AbstractHistorySpecification<CoursHistoryCriteria, CoursHistory> {

    public CoursHistorySpecification(CoursHistoryCriteria criteria) {
        super(criteria);
    }

    public CoursHistorySpecification(CoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
