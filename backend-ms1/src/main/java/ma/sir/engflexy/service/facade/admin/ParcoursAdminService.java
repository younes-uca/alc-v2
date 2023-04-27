package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Parcours;
import ma.sir.engflexy.dao.criteria.core.ParcoursCriteria;
import ma.sir.engflexy.dao.criteria.history.ParcoursHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ParcoursAdminService extends  IService<Parcours,ParcoursCriteria, ParcoursHistoryCriteria>  {

    List<Parcours> findByCentreId(Long id);
    int deleteByCentreId(Long id);



}
