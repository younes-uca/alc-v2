package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.TypeReclamationEtudiantHistoryCriteria;
import ma.sir.engflexy.bean.history.TypeReclamationEtudiantHistory;


public class TypeReclamationEtudiantHistorySpecification extends AbstractHistorySpecification<TypeReclamationEtudiantHistoryCriteria, TypeReclamationEtudiantHistory> {

    public TypeReclamationEtudiantHistorySpecification(TypeReclamationEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationEtudiantHistorySpecification(TypeReclamationEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
