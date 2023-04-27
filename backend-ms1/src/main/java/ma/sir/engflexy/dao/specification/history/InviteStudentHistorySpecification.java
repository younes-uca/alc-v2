package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.sir.engflexy.bean.history.InviteStudentHistory;


public class InviteStudentHistorySpecification extends AbstractHistorySpecification<InviteStudentHistoryCriteria, InviteStudentHistory> {

    public InviteStudentHistorySpecification(InviteStudentHistoryCriteria criteria) {
        super(criteria);
    }

    public InviteStudentHistorySpecification(InviteStudentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
