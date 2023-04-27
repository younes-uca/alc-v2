package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.ClassRoom;
import ma.sir.engflexy.dao.criteria.core.ClassRoomCriteria;
import ma.sir.engflexy.dao.criteria.history.ClassRoomHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ClassRoomAdminService extends  IService<ClassRoom,ClassRoomCriteria, ClassRoomHistoryCriteria>  {

    List<ClassRoom> findByProfId(Long id);
    int deleteByProfId(Long id);



}
