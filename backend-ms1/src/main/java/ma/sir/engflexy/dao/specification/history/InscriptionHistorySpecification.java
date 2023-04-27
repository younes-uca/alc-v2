package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.InscriptionHistoryCriteria;
import ma.sir.engflexy.bean.history.InscriptionHistory;


public class InscriptionHistorySpecification extends AbstractHistorySpecification<InscriptionHistoryCriteria, InscriptionHistory> {

    public InscriptionHistorySpecification(InscriptionHistoryCriteria criteria) {
        super(criteria);
    }

    public InscriptionHistorySpecification(InscriptionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
