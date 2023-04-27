package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.sir.engflexy.bean.history.ReponseEtudiantHomeWorkHistory;


public class ReponseEtudiantHomeWorkHistorySpecification extends AbstractHistorySpecification<ReponseEtudiantHomeWorkHistoryCriteria, ReponseEtudiantHomeWorkHistory> {

    public ReponseEtudiantHomeWorkHistorySpecification(ReponseEtudiantHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseEtudiantHomeWorkHistorySpecification(ReponseEtudiantHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
