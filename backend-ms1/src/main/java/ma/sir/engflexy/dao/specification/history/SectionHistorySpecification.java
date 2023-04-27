package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.SectionHistoryCriteria;
import ma.sir.engflexy.bean.history.SectionHistory;


public class SectionHistorySpecification extends AbstractHistorySpecification<SectionHistoryCriteria, SectionHistory> {

    public SectionHistorySpecification(SectionHistoryCriteria criteria) {
        super(criteria);
    }

    public SectionHistorySpecification(SectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
