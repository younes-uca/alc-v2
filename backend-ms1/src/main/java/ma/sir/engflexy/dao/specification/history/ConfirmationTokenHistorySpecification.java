package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.sir.engflexy.bean.history.ConfirmationTokenHistory;


public class ConfirmationTokenHistorySpecification extends AbstractHistorySpecification<ConfirmationTokenHistoryCriteria, ConfirmationTokenHistory> {

    public ConfirmationTokenHistorySpecification(ConfirmationTokenHistoryCriteria criteria) {
        super(criteria);
    }

    public ConfirmationTokenHistorySpecification(ConfirmationTokenHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
