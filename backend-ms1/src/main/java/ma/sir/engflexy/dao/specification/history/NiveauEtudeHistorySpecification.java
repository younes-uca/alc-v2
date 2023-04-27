package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.NiveauEtudeHistoryCriteria;
import ma.sir.engflexy.bean.history.NiveauEtudeHistory;


public class NiveauEtudeHistorySpecification extends AbstractHistorySpecification<NiveauEtudeHistoryCriteria, NiveauEtudeHistory> {

    public NiveauEtudeHistorySpecification(NiveauEtudeHistoryCriteria criteria) {
        super(criteria);
    }

    public NiveauEtudeHistorySpecification(NiveauEtudeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
