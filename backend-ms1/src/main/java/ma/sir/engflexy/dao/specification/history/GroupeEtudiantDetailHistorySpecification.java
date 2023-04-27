package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.sir.engflexy.bean.history.GroupeEtudiantDetailHistory;


public class GroupeEtudiantDetailHistorySpecification extends AbstractHistorySpecification<GroupeEtudiantDetailHistoryCriteria, GroupeEtudiantDetailHistory> {

    public GroupeEtudiantDetailHistorySpecification(GroupeEtudiantDetailHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudiantDetailHistorySpecification(GroupeEtudiantDetailHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
