package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.SessionCoursHistoryCriteria;
import ma.sir.engflexy.bean.history.SessionCoursHistory;


public class SessionCoursHistorySpecification extends AbstractHistorySpecification<SessionCoursHistoryCriteria, SessionCoursHistory> {

    public SessionCoursHistorySpecification(SessionCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public SessionCoursHistorySpecification(SessionCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
