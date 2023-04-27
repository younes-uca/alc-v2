package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.SectionItem;
import ma.sir.engflexy.bean.history.SectionItemHistory;
import ma.sir.engflexy.dao.criteria.core.SectionItemCriteria;
import ma.sir.engflexy.dao.criteria.history.SectionItemHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.SectionItemDao;
import ma.sir.engflexy.dao.facade.history.SectionItemHistoryDao;
import ma.sir.engflexy.dao.specification.core.SectionItemSpecification;
import ma.sir.engflexy.service.facade.admin.SectionItemAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.SectionAdminService ;


import java.util.List;
@Service
public class SectionItemAdminServiceImpl extends AbstractServiceImpl<SectionItem,SectionItemHistory, SectionItemCriteria, SectionItemHistoryCriteria, SectionItemDao,
SectionItemHistoryDao> implements SectionItemAdminService {



    public List<SectionItem> findBySectionId(Long id){
        return dao.findBySectionId(id);
    }
    public int deleteBySectionId(Long id){
        return dao.deleteBySectionId(id);
    }

    public void configure() {
        super.configure(SectionItem.class,SectionItemHistory.class, SectionItemHistoryCriteria.class, SectionItemSpecification.class);
    }

    @Autowired
    private SectionAdminService sectionService ;
    public SectionItemAdminServiceImpl(SectionItemDao dao, SectionItemHistoryDao historyDao) {
        super(dao, historyDao);
    }

}