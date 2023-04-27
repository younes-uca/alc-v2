package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.sir.engflexy.bean.history.EtudiantClassRoomHistory;


public class EtudiantClassRoomHistorySpecification extends AbstractHistorySpecification<EtudiantClassRoomHistoryCriteria, EtudiantClassRoomHistory> {

    public EtudiantClassRoomHistorySpecification(EtudiantClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantClassRoomHistorySpecification(EtudiantClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
