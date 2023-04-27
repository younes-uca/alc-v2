package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.sir.engflexy.bean.history.CalendrierProfHistory;


public class CalendrierProfHistorySpecification extends AbstractHistorySpecification<CalendrierProfHistoryCriteria, CalendrierProfHistory> {

    public CalendrierProfHistorySpecification(CalendrierProfHistoryCriteria criteria) {
        super(criteria);
    }

    public CalendrierProfHistorySpecification(CalendrierProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
