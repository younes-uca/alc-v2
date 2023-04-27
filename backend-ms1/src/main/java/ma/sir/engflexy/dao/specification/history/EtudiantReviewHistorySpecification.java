package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.EtudiantReviewHistoryCriteria;
import ma.sir.engflexy.bean.history.EtudiantReviewHistory;


public class EtudiantReviewHistorySpecification extends AbstractHistorySpecification<EtudiantReviewHistoryCriteria, EtudiantReviewHistory> {

    public EtudiantReviewHistorySpecification(EtudiantReviewHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantReviewHistorySpecification(EtudiantReviewHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
