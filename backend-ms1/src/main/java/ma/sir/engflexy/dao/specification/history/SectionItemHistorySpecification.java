package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.SectionItemHistoryCriteria;
import ma.sir.engflexy.bean.history.SectionItemHistory;


public class SectionItemHistorySpecification extends AbstractHistorySpecification<SectionItemHistoryCriteria, SectionItemHistory> {

    public SectionItemHistorySpecification(SectionItemHistoryCriteria criteria) {
        super(criteria);
    }

    public SectionItemHistorySpecification(SectionItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
