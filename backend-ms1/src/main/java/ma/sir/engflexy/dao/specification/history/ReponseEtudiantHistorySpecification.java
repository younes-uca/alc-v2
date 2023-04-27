package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ReponseEtudiantHistoryCriteria;
import ma.sir.engflexy.bean.history.ReponseEtudiantHistory;


public class ReponseEtudiantHistorySpecification extends AbstractHistorySpecification<ReponseEtudiantHistoryCriteria, ReponseEtudiantHistory> {

    public ReponseEtudiantHistorySpecification(ReponseEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseEtudiantHistorySpecification(ReponseEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
