package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.CentreHistoryCriteria;
import ma.sir.engflexy.bean.history.CentreHistory;


public class CentreHistorySpecification extends AbstractHistorySpecification<CentreHistoryCriteria, CentreHistory> {

    public CentreHistorySpecification(CentreHistoryCriteria criteria) {
        super(criteria);
    }

    public CentreHistorySpecification(CentreHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
