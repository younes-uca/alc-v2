package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.ScheduleProf;
import ma.sir.engflexy.dao.criteria.core.ScheduleProfCriteria;
import ma.sir.engflexy.dao.criteria.history.ScheduleProfHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ScheduleProfAdminService extends  IService<ScheduleProf,ScheduleProfCriteria, ScheduleProfHistoryCriteria>  {

    List<ScheduleProf> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<ScheduleProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ScheduleProf> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
