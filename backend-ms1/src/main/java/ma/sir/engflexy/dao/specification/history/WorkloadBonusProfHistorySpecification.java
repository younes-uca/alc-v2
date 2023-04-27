package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.sir.engflexy.bean.history.WorkloadBonusProfHistory;


public class WorkloadBonusProfHistorySpecification extends AbstractHistorySpecification<WorkloadBonusProfHistoryCriteria, WorkloadBonusProfHistory> {

    public WorkloadBonusProfHistorySpecification(WorkloadBonusProfHistoryCriteria criteria) {
        super(criteria);
    }

    public WorkloadBonusProfHistorySpecification(WorkloadBonusProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
