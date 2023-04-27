package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Prof;
import ma.sir.engflexy.dao.criteria.core.ProfCriteria;
import ma.sir.engflexy.dao.criteria.history.ProfHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ProfAdminService extends  IService<Prof,ProfCriteria, ProfHistoryCriteria>  {

    List<Prof> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<Prof> findByCategorieProfId(Long id);
    int deleteByCategorieProfId(Long id);
    List<Prof> findByTypeTeacherId(Long id);
    int deleteByTypeTeacherId(Long id);



}
