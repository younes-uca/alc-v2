package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Dictionary;
import ma.sir.engflexy.dao.criteria.core.DictionaryCriteria;
import ma.sir.engflexy.dao.criteria.history.DictionaryHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface DictionaryAdminService extends  IService<Dictionary,DictionaryCriteria, DictionaryHistoryCriteria>  {

    List<Dictionary> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
