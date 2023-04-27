package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.sir.engflexy.bean.history.TrancheHoraireProfHistory;


public class TrancheHoraireProfHistorySpecification extends AbstractHistorySpecification<TrancheHoraireProfHistoryCriteria, TrancheHoraireProfHistory> {

    public TrancheHoraireProfHistorySpecification(TrancheHoraireProfHistoryCriteria criteria) {
        super(criteria);
    }

    public TrancheHoraireProfHistorySpecification(TrancheHoraireProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
