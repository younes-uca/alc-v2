package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.SalaryHistoryCriteria;
import ma.sir.engflexy.bean.history.SalaryHistory;


public class SalaryHistorySpecification extends AbstractHistorySpecification<SalaryHistoryCriteria, SalaryHistory> {

    public SalaryHistorySpecification(SalaryHistoryCriteria criteria) {
        super(criteria);
    }

    public SalaryHistorySpecification(SalaryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
