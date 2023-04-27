package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.Faq;
import ma.sir.engflexy.bean.history.FaqHistory;
import ma.sir.engflexy.dao.criteria.core.FaqCriteria;
import ma.sir.engflexy.dao.criteria.history.FaqHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.FaqDao;
import ma.sir.engflexy.dao.facade.history.FaqHistoryDao;
import ma.sir.engflexy.dao.specification.core.FaqSpecification;
import ma.sir.engflexy.service.facade.admin.FaqAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.FaqTypeAdminService ;


import java.util.List;
@Service
public class FaqAdminServiceImpl extends AbstractServiceImpl<Faq,FaqHistory, FaqCriteria, FaqHistoryCriteria, FaqDao,
FaqHistoryDao> implements FaqAdminService {



    public List<Faq> findByFaqTypeId(Long id){
        return dao.findByFaqTypeId(id);
    }
    public int deleteByFaqTypeId(Long id){
        return dao.deleteByFaqTypeId(id);
    }

    public void configure() {
        super.configure(Faq.class,FaqHistory.class, FaqHistoryCriteria.class, FaqSpecification.class);
    }

    @Autowired
    private FaqTypeAdminService faqTypeService ;
    public FaqAdminServiceImpl(FaqDao dao, FaqHistoryDao historyDao) {
        super(dao, historyDao);
    }

}