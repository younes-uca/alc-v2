package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.Dictionary;
import ma.sir.engflexy.bean.history.DictionaryHistory;
import ma.sir.engflexy.dao.criteria.core.DictionaryCriteria;
import ma.sir.engflexy.dao.criteria.history.DictionaryHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.DictionaryDao;
import ma.sir.engflexy.dao.facade.history.DictionaryHistoryDao;
import ma.sir.engflexy.dao.specification.core.DictionarySpecification;
import ma.sir.engflexy.service.facade.admin.DictionaryAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.EtudiantAdminService ;


import java.util.List;
@Service
public class DictionaryAdminServiceImpl extends AbstractServiceImpl<Dictionary,DictionaryHistory, DictionaryCriteria, DictionaryHistoryCriteria, DictionaryDao,
DictionaryHistoryDao> implements DictionaryAdminService {



    public List<Dictionary> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(Dictionary.class,DictionaryHistory.class, DictionaryHistoryCriteria.class, DictionarySpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    public DictionaryAdminServiceImpl(DictionaryDao dao, DictionaryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}