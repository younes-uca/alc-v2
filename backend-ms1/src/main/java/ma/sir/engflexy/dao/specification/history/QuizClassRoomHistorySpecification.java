package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.sir.engflexy.bean.history.QuizClassRoomHistory;


public class QuizClassRoomHistorySpecification extends AbstractHistorySpecification<QuizClassRoomHistoryCriteria, QuizClassRoomHistory> {

    public QuizClassRoomHistorySpecification(QuizClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizClassRoomHistorySpecification(QuizClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
