package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.sir.engflexy.bean.history.ReclamationProfHistory;


public class ReclamationProfHistorySpecification extends AbstractHistorySpecification<ReclamationProfHistoryCriteria, ReclamationProfHistory> {

    public ReclamationProfHistorySpecification(ReclamationProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ReclamationProfHistorySpecification(ReclamationProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
