package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.EtudiantClassRoom;
import ma.sir.engflexy.dao.criteria.core.EtudiantClassRoomCriteria;
import ma.sir.engflexy.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface EtudiantClassRoomAdminService extends  IService<EtudiantClassRoom,EtudiantClassRoomCriteria, EtudiantClassRoomHistoryCriteria>  {

    List<EtudiantClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<EtudiantClassRoom> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
