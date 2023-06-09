package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.SuperCategorieSection;
import ma.sir.engflexy.bean.history.SuperCategorieSectionHistory;
import ma.sir.engflexy.dao.criteria.core.SuperCategorieSectionCriteria;
import ma.sir.engflexy.dao.criteria.history.SuperCategorieSectionHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.SuperCategorieSectionDao;
import ma.sir.engflexy.dao.facade.history.SuperCategorieSectionHistoryDao;
import ma.sir.engflexy.dao.specification.core.SuperCategorieSectionSpecification;
import ma.sir.engflexy.service.facade.admin.SuperCategorieSectionAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.engflexy.bean.core.CategorieSection;

import ma.sir.engflexy.service.facade.admin.CategorieSectionAdminService ;


import java.util.List;
@Service
public class SuperCategorieSectionAdminServiceImpl extends AbstractServiceImpl<SuperCategorieSection,SuperCategorieSectionHistory, SuperCategorieSectionCriteria, SuperCategorieSectionHistoryCriteria, SuperCategorieSectionDao,
SuperCategorieSectionHistoryDao> implements SuperCategorieSectionAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public SuperCategorieSection create(SuperCategorieSection t) {
        super.create(t);
        if (t.getCategorieSections() != null) {
                t.getCategorieSections().forEach(element-> {
                    element.setSuperCategorieSection(t);
                    categorieSectionService.create(element);
            });
        }
        return t;
    }

    public SuperCategorieSection findWithAssociatedLists(Long id){
        SuperCategorieSection result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setCategorieSections(categorieSectionService.findBySuperCategorieSectionId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        categorieSectionService.deleteBySuperCategorieSectionId(id);
    }


    public void updateWithAssociatedLists(SuperCategorieSection superCategorieSection){
    if(superCategorieSection !=null && superCategorieSection.getId() != null){
            List<List<CategorieSection>> resultCategorieSections= categorieSectionService.getToBeSavedAndToBeDeleted(categorieSectionService.findBySuperCategorieSectionId(superCategorieSection.getId()),superCategorieSection.getCategorieSections());
            categorieSectionService.delete(resultCategorieSections.get(1));
            ListUtil.emptyIfNull(resultCategorieSections.get(0)).forEach(e -> e.setSuperCategorieSection(superCategorieSection));
            categorieSectionService.update(resultCategorieSections.get(0),true);
    }
    }

    public SuperCategorieSection findByReferenceEntity(SuperCategorieSection t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(SuperCategorieSection.class,SuperCategorieSectionHistory.class, SuperCategorieSectionHistoryCriteria.class, SuperCategorieSectionSpecification.class);
    }

    @Autowired
    private CategorieSectionAdminService categorieSectionService ;
    public SuperCategorieSectionAdminServiceImpl(SuperCategorieSectionDao dao, SuperCategorieSectionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}