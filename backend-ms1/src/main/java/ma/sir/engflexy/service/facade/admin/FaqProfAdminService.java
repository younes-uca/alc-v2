package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.FaqProf;
import ma.sir.engflexy.dao.criteria.core.FaqProfCriteria;
import ma.sir.engflexy.dao.criteria.history.FaqProfHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface FaqProfAdminService extends  IService<FaqProf,FaqProfCriteria, FaqProfHistoryCriteria>  {

    List<FaqProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<FaqProf> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqProf> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
