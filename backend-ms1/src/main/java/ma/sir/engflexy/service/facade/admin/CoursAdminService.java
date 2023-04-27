package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Cours;
import ma.sir.engflexy.dao.criteria.core.CoursCriteria;
import ma.sir.engflexy.dao.criteria.history.CoursHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface CoursAdminService extends  IService<Cours,CoursCriteria, CoursHistoryCriteria>  {

    List<Cours> findByEtatCoursId(Long id);
    int deleteByEtatCoursId(Long id);
    List<Cours> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);



}
