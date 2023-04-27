package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.InviteStudent;
import ma.sir.engflexy.dao.criteria.core.InviteStudentCriteria;
import ma.sir.engflexy.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface InviteStudentAdminService extends  IService<InviteStudent,InviteStudentCriteria, InviteStudentHistoryCriteria>  {

    List<InviteStudent> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
