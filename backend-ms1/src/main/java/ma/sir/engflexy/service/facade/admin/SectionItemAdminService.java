package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.SectionItem;
import ma.sir.engflexy.dao.criteria.core.SectionItemCriteria;
import ma.sir.engflexy.dao.criteria.history.SectionItemHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface SectionItemAdminService extends  IService<SectionItem,SectionItemCriteria, SectionItemHistoryCriteria>  {

    List<SectionItem> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
