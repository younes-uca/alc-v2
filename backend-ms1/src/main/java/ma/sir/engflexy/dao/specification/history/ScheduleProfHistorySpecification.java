package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ScheduleProfHistoryCriteria;
import ma.sir.engflexy.bean.history.ScheduleProfHistory;


public class ScheduleProfHistorySpecification extends AbstractHistorySpecification<ScheduleProfHistoryCriteria, ScheduleProfHistory> {

    public ScheduleProfHistorySpecification(ScheduleProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ScheduleProfHistorySpecification(ScheduleProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
