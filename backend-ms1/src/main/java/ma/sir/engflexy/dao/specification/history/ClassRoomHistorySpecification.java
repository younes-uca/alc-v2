package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ClassRoomHistoryCriteria;
import ma.sir.engflexy.bean.history.ClassRoomHistory;


public class ClassRoomHistorySpecification extends AbstractHistorySpecification<ClassRoomHistoryCriteria, ClassRoomHistory> {

    public ClassRoomHistorySpecification(ClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassRoomHistorySpecification(ClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
