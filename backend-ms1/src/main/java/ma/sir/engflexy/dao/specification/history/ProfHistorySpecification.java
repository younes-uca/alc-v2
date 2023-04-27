package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ProfHistoryCriteria;
import ma.sir.engflexy.bean.history.ProfHistory;


public class ProfHistorySpecification extends AbstractHistorySpecification<ProfHistoryCriteria, ProfHistory> {

    public ProfHistorySpecification(ProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ProfHistorySpecification(ProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
