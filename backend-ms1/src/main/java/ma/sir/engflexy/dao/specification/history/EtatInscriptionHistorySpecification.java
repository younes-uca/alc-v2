package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.EtatInscriptionHistoryCriteria;
import ma.sir.engflexy.bean.history.EtatInscriptionHistory;


public class EtatInscriptionHistorySpecification extends AbstractHistorySpecification<EtatInscriptionHistoryCriteria, EtatInscriptionHistory> {

    public EtatInscriptionHistorySpecification(EtatInscriptionHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatInscriptionHistorySpecification(EtatInscriptionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
