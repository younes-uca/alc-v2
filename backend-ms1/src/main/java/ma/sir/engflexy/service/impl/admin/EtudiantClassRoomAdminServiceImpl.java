package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.EtudiantClassRoom;
import ma.sir.engflexy.bean.history.EtudiantClassRoomHistory;
import ma.sir.engflexy.dao.criteria.core.EtudiantClassRoomCriteria;
import ma.sir.engflexy.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.EtudiantClassRoomDao;
import ma.sir.engflexy.dao.facade.history.EtudiantClassRoomHistoryDao;
import ma.sir.engflexy.dao.specification.core.EtudiantClassRoomSpecification;
import ma.sir.engflexy.service.facade.admin.EtudiantClassRoomAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.ClassRoomAdminService ;
import ma.sir.engflexy.service.facade.admin.EtudiantAdminService ;


import java.util.List;
@Service
public class EtudiantClassRoomAdminServiceImpl extends AbstractServiceImpl<EtudiantClassRoom,EtudiantClassRoomHistory, EtudiantClassRoomCriteria, EtudiantClassRoomHistoryCriteria, EtudiantClassRoomDao,
EtudiantClassRoomHistoryDao> implements EtudiantClassRoomAdminService {



    public List<EtudiantClassRoom> findByClassRoomId(Long id){
        return dao.findByClassRoomId(id);
    }
    public int deleteByClassRoomId(Long id){
        return dao.deleteByClassRoomId(id);
    }
    public List<EtudiantClassRoom> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(EtudiantClassRoom.class,EtudiantClassRoomHistory.class, EtudiantClassRoomHistoryCriteria.class, EtudiantClassRoomSpecification.class);
    }

    @Autowired
    private ClassRoomAdminService classRoomService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    public EtudiantClassRoomAdminServiceImpl(EtudiantClassRoomDao dao, EtudiantClassRoomHistoryDao historyDao) {
        super(dao, historyDao);
    }

}