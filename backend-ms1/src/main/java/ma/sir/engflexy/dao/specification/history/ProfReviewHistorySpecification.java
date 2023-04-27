package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.sir.engflexy.bean.history.ProfReviewHistory;


public class ProfReviewHistorySpecification extends AbstractHistorySpecification<ProfReviewHistoryCriteria, ProfReviewHistory> {

    public ProfReviewHistorySpecification(ProfReviewHistoryCriteria criteria) {
        super(criteria);
    }

    public ProfReviewHistorySpecification(ProfReviewHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
