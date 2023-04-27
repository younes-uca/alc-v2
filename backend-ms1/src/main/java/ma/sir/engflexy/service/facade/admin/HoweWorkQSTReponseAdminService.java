package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.HoweWorkQSTReponse;
import ma.sir.engflexy.dao.criteria.core.HoweWorkQSTReponseCriteria;
import ma.sir.engflexy.dao.criteria.history.HoweWorkQSTReponseHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface HoweWorkQSTReponseAdminService extends  IService<HoweWorkQSTReponse,HoweWorkQSTReponseCriteria, HoweWorkQSTReponseHistoryCriteria>  {

    List<HoweWorkQSTReponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<HoweWorkQSTReponse> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);



}
