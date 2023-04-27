package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.PackStudentHistoryCriteria;
import ma.sir.engflexy.bean.history.PackStudentHistory;


public class PackStudentHistorySpecification extends AbstractHistorySpecification<PackStudentHistoryCriteria, PackStudentHistory> {

    public PackStudentHistorySpecification(PackStudentHistoryCriteria criteria) {
        super(criteria);
    }

    public PackStudentHistorySpecification(PackStudentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
