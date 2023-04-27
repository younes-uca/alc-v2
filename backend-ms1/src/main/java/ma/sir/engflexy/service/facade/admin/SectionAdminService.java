package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Section;
import ma.sir.engflexy.dao.criteria.core.SectionCriteria;
import ma.sir.engflexy.dao.criteria.history.SectionHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface SectionAdminService extends  IService<Section,SectionCriteria, SectionHistoryCriteria>  {

    List<Section> findByCategorieSectionId(Long id);
    int deleteByCategorieSectionId(Long id);
    List<Section> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<Section> findBySessionCoursId(Long id);
    int deleteBySessionCoursId(Long id);



}
