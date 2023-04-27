package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.TrancheHoraireProf;
import ma.sir.engflexy.dao.criteria.core.TrancheHoraireProfCriteria;
import ma.sir.engflexy.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface TrancheHoraireProfAdminService extends  IService<TrancheHoraireProf,TrancheHoraireProfCriteria, TrancheHoraireProfHistoryCriteria>  {

    List<TrancheHoraireProf> findByProfId(Long id);
    int deleteByProfId(Long id);



}
