package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.ReclamationProf;
import ma.sir.engflexy.dao.criteria.core.ReclamationProfCriteria;
import ma.sir.engflexy.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ReclamationProfAdminService extends  IService<ReclamationProf,ReclamationProfCriteria, ReclamationProfHistoryCriteria>  {

    List<ReclamationProf> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<ReclamationProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ReclamationProf> findByTypeReclamationProfId(Long id);
    int deleteByTypeReclamationProfId(Long id);



}
