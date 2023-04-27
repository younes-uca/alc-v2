package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.AdminHistoryCriteria;
import ma.sir.engflexy.bean.history.AdminHistory;


public class AdminHistorySpecification extends AbstractHistorySpecification<AdminHistoryCriteria, AdminHistory> {

    public AdminHistorySpecification(AdminHistoryCriteria criteria) {
        super(criteria);
    }

    public AdminHistorySpecification(AdminHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
