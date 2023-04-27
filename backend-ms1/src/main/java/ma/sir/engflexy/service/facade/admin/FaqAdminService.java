package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Faq;
import ma.sir.engflexy.dao.criteria.core.FaqCriteria;
import ma.sir.engflexy.dao.criteria.history.FaqHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface FaqAdminService extends  IService<Faq,FaqCriteria, FaqHistoryCriteria>  {

    List<Faq> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
