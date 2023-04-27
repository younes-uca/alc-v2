package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ReponseHistoryCriteria;
import ma.sir.engflexy.bean.history.ReponseHistory;


public class ReponseHistorySpecification extends AbstractHistorySpecification<ReponseHistoryCriteria, ReponseHistory> {

    public ReponseHistorySpecification(ReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseHistorySpecification(ReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
