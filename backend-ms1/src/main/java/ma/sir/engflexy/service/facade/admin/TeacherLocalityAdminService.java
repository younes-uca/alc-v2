package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.TeacherLocality;
import ma.sir.engflexy.dao.criteria.core.TeacherLocalityCriteria;
import ma.sir.engflexy.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface TeacherLocalityAdminService extends  IService<TeacherLocality,TeacherLocalityCriteria, TeacherLocalityHistoryCriteria>  {

    Long getNextOrdre();



}
