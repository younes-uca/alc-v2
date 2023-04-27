package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.GroupeEtudiantHistoryCriteria;
import ma.sir.engflexy.bean.history.GroupeEtudiantHistory;


public class GroupeEtudiantHistorySpecification extends AbstractHistorySpecification<GroupeEtudiantHistoryCriteria, GroupeEtudiantHistory> {

    public GroupeEtudiantHistorySpecification(GroupeEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudiantHistorySpecification(GroupeEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
