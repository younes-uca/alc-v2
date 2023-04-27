package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Reponse;
import ma.sir.engflexy.dao.criteria.core.ReponseCriteria;
import ma.sir.engflexy.dao.criteria.history.ReponseHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ReponseAdminService extends  IService<Reponse,ReponseCriteria, ReponseHistoryCriteria>  {

    List<Reponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<Reponse> findByQuestionId(Long id);
    int deleteByQuestionId(Long id);



}
