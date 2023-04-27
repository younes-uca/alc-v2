package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.sir.engflexy.bean.history.TeacherLocalityHistory;


public class TeacherLocalityHistorySpecification extends AbstractHistorySpecification<TeacherLocalityHistoryCriteria, TeacherLocalityHistory> {

    public TeacherLocalityHistorySpecification(TeacherLocalityHistoryCriteria criteria) {
        super(criteria);
    }

    public TeacherLocalityHistorySpecification(TeacherLocalityHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
