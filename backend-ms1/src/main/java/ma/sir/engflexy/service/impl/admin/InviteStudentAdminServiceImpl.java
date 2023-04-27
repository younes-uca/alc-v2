package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.InviteStudent;
import ma.sir.engflexy.bean.history.InviteStudentHistory;
import ma.sir.engflexy.dao.criteria.core.InviteStudentCriteria;
import ma.sir.engflexy.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.InviteStudentDao;
import ma.sir.engflexy.dao.facade.history.InviteStudentHistoryDao;
import ma.sir.engflexy.dao.specification.core.InviteStudentSpecification;
import ma.sir.engflexy.service.facade.admin.InviteStudentAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.EtudiantAdminService ;


import java.util.List;
@Service
public class InviteStudentAdminServiceImpl extends AbstractServiceImpl<InviteStudent,InviteStudentHistory, InviteStudentCriteria, InviteStudentHistoryCriteria, InviteStudentDao,
InviteStudentHistoryDao> implements InviteStudentAdminService {


    public InviteStudent findByReferenceEntity(InviteStudent t){
        return  dao.findByCode(t.getCode());
    }

    public List<InviteStudent> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(InviteStudent.class,InviteStudentHistory.class, InviteStudentHistoryCriteria.class, InviteStudentSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    public InviteStudentAdminServiceImpl(InviteStudentDao dao, InviteStudentHistoryDao historyDao) {
        super(dao, historyDao);
    }

}