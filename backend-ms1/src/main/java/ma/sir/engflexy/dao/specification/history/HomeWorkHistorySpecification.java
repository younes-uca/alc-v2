package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.HomeWorkHistoryCriteria;
import ma.sir.engflexy.bean.history.HomeWorkHistory;


public class HomeWorkHistorySpecification extends AbstractHistorySpecification<HomeWorkHistoryCriteria, HomeWorkHistory> {

    public HomeWorkHistorySpecification(HomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkHistorySpecification(HomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
