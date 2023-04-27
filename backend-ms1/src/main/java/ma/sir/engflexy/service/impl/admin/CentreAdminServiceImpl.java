package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.Centre;
import ma.sir.engflexy.bean.history.CentreHistory;
import ma.sir.engflexy.dao.criteria.core.CentreCriteria;
import ma.sir.engflexy.dao.criteria.history.CentreHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.CentreDao;
import ma.sir.engflexy.dao.facade.history.CentreHistoryDao;
import ma.sir.engflexy.dao.specification.core.CentreSpecification;
import ma.sir.engflexy.service.facade.admin.CentreAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.engflexy.bean.core.Parcours;

import ma.sir.engflexy.service.facade.admin.ParcoursAdminService ;


import java.util.List;
@Service
public class CentreAdminServiceImpl extends AbstractServiceImpl<Centre,CentreHistory, CentreCriteria, CentreHistoryCriteria, CentreDao,
CentreHistoryDao> implements CentreAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Centre create(Centre t) {
        super.create(t);
        if (t.getParcourss() != null) {
                t.getParcourss().forEach(element-> {
                    element.setCentre(t);
                    parcoursService.create(element);
            });
        }
        return t;
    }

    public Centre findWithAssociatedLists(Long id){
        Centre result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setParcourss(parcoursService.findByCentreId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        parcoursService.deleteByCentreId(id);
    }


    public void updateWithAssociatedLists(Centre centre){
    if(centre !=null && centre.getId() != null){
            List<List<Parcours>> resultParcourss= parcoursService.getToBeSavedAndToBeDeleted(parcoursService.findByCentreId(centre.getId()),centre.getParcourss());
            parcoursService.delete(resultParcourss.get(1));
            ListUtil.emptyIfNull(resultParcourss.get(0)).forEach(e -> e.setCentre(centre));
            parcoursService.update(resultParcourss.get(0),true);
    }
    }

    public Centre findByReferenceEntity(Centre t){
        return  dao.findByRef(t.getRef());
    }


    public void configure() {
        super.configure(Centre.class,CentreHistory.class, CentreHistoryCriteria.class, CentreSpecification.class);
    }

    @Autowired
    private ParcoursAdminService parcoursService ;
    public CentreAdminServiceImpl(CentreDao dao, CentreHistoryDao historyDao) {
        super(dao, historyDao);
    }

}