package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ServicesHistoryCriteria;
import ma.sir.engflexy.bean.history.ServicesHistory;


public class ServicesHistorySpecification extends AbstractHistorySpecification<ServicesHistoryCriteria, ServicesHistory> {

    public ServicesHistorySpecification(ServicesHistoryCriteria criteria) {
        super(criteria);
    }

    public ServicesHistorySpecification(ServicesHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
