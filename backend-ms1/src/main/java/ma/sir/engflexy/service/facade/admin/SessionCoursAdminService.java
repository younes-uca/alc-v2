package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.SessionCours;
import ma.sir.engflexy.dao.criteria.core.SessionCoursCriteria;
import ma.sir.engflexy.dao.criteria.history.SessionCoursHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface SessionCoursAdminService extends  IService<SessionCours,SessionCoursCriteria, SessionCoursHistoryCriteria>  {

    List<SessionCours> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<SessionCours> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<SessionCours> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<SessionCours> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);



}
