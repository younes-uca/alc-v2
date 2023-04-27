package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.CalendrierProf;
import ma.sir.engflexy.dao.criteria.core.CalendrierProfCriteria;
import ma.sir.engflexy.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface CalendrierProfAdminService extends  IService<CalendrierProf,CalendrierProfCriteria, CalendrierProfHistoryCriteria>  {

    List<CalendrierProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<CalendrierProf> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
