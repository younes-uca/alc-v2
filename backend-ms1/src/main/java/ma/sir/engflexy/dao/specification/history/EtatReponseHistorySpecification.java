package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.EtatReponseHistoryCriteria;
import ma.sir.engflexy.bean.history.EtatReponseHistory;


public class EtatReponseHistorySpecification extends AbstractHistorySpecification<EtatReponseHistoryCriteria, EtatReponseHistory> {

    public EtatReponseHistorySpecification(EtatReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatReponseHistorySpecification(EtatReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
