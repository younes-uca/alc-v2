package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.WorkloadBonusHistoryCriteria;
import ma.sir.engflexy.bean.history.WorkloadBonusHistory;


public class WorkloadBonusHistorySpecification extends AbstractHistorySpecification<WorkloadBonusHistoryCriteria, WorkloadBonusHistory> {

    public WorkloadBonusHistorySpecification(WorkloadBonusHistoryCriteria criteria) {
        super(criteria);
    }

    public WorkloadBonusHistorySpecification(WorkloadBonusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
