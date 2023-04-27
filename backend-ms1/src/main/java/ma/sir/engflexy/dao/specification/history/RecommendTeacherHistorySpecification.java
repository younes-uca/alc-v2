package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.sir.engflexy.bean.history.RecommendTeacherHistory;


public class RecommendTeacherHistorySpecification extends AbstractHistorySpecification<RecommendTeacherHistoryCriteria, RecommendTeacherHistory> {

    public RecommendTeacherHistorySpecification(RecommendTeacherHistoryCriteria criteria) {
        super(criteria);
    }

    public RecommendTeacherHistorySpecification(RecommendTeacherHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
