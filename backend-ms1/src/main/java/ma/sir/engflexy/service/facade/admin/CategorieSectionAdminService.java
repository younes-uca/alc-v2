package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.CategorieSection;
import ma.sir.engflexy.dao.criteria.core.CategorieSectionCriteria;
import ma.sir.engflexy.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface CategorieSectionAdminService extends  IService<CategorieSection,CategorieSectionCriteria, CategorieSectionHistoryCriteria>  {

    List<CategorieSection> findBySuperCategorieSectionId(Long id);
    int deleteBySuperCategorieSectionId(Long id);



}
