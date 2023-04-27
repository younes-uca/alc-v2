package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.TypeReclamationProfHistoryCriteria;
import ma.sir.engflexy.bean.history.TypeReclamationProfHistory;


public class TypeReclamationProfHistorySpecification extends AbstractHistorySpecification<TypeReclamationProfHistoryCriteria, TypeReclamationProfHistory> {

    public TypeReclamationProfHistorySpecification(TypeReclamationProfHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationProfHistorySpecification(TypeReclamationProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
