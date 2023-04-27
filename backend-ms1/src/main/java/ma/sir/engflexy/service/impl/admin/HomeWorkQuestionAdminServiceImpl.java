package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.HomeWorkQuestion;
import ma.sir.engflexy.bean.history.HomeWorkQuestionHistory;
import ma.sir.engflexy.dao.criteria.core.HomeWorkQuestionCriteria;
import ma.sir.engflexy.dao.criteria.history.HomeWorkQuestionHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.HomeWorkQuestionDao;
import ma.sir.engflexy.dao.facade.history.HomeWorkQuestionHistoryDao;
import ma.sir.engflexy.dao.specification.core.HomeWorkQuestionSpecification;
import ma.sir.engflexy.service.facade.admin.HomeWorkQuestionAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.engflexy.bean.core.HoweWorkQSTReponse;

import ma.sir.engflexy.service.facade.admin.HoweWorkQSTReponseAdminService ;
import ma.sir.engflexy.service.facade.admin.HomeWorkAdminService ;
import ma.sir.engflexy.service.facade.admin.TypeDeQuestionAdminService ;


import java.util.List;
@Service
public class HomeWorkQuestionAdminServiceImpl extends AbstractServiceImpl<HomeWorkQuestion,HomeWorkQuestionHistory, HomeWorkQuestionCriteria, HomeWorkQuestionHistoryCriteria, HomeWorkQuestionDao,
HomeWorkQuestionHistoryDao> implements HomeWorkQuestionAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public HomeWorkQuestion create(HomeWorkQuestion t) {
        super.create(t);
        if (t.getHoweWorkQSTReponses() != null) {
                t.getHoweWorkQSTReponses().forEach(element-> {
                    element.setHomeWorkQuestion(t);
                    howeWorkQSTReponseService.create(element);
            });
        }
        return t;
    }

    public HomeWorkQuestion findWithAssociatedLists(Long id){
        HomeWorkQuestion result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setHoweWorkQSTReponses(howeWorkQSTReponseService.findByHomeWorkQuestionId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        howeWorkQSTReponseService.deleteByHomeWorkQuestionId(id);
    }


    public void updateWithAssociatedLists(HomeWorkQuestion homeWorkQuestion){
    if(homeWorkQuestion !=null && homeWorkQuestion.getId() != null){
            List<List<HoweWorkQSTReponse>> resultHoweWorkQSTReponses= howeWorkQSTReponseService.getToBeSavedAndToBeDeleted(howeWorkQSTReponseService.findByHomeWorkQuestionId(homeWorkQuestion.getId()),homeWorkQuestion.getHoweWorkQSTReponses());
            howeWorkQSTReponseService.delete(resultHoweWorkQSTReponses.get(1));
            ListUtil.emptyIfNull(resultHoweWorkQSTReponses.get(0)).forEach(e -> e.setHomeWorkQuestion(homeWorkQuestion));
            howeWorkQSTReponseService.update(resultHoweWorkQSTReponses.get(0),true);
    }
    }

    public HomeWorkQuestion findByReferenceEntity(HomeWorkQuestion t){
        return  dao.findByRef(t.getRef());
    }

    public List<HomeWorkQuestion> findByTypeDeQuestionId(Long id){
        return dao.findByTypeDeQuestionId(id);
    }
    public int deleteByTypeDeQuestionId(Long id){
        return dao.deleteByTypeDeQuestionId(id);
    }
    public List<HomeWorkQuestion> findByHomeWorkId(Long id){
        return dao.findByHomeWorkId(id);
    }
    public int deleteByHomeWorkId(Long id){
        return dao.deleteByHomeWorkId(id);
    }

    public void configure() {
        super.configure(HomeWorkQuestion.class,HomeWorkQuestionHistory.class, HomeWorkQuestionHistoryCriteria.class, HomeWorkQuestionSpecification.class);
    }

    @Autowired
    private HoweWorkQSTReponseAdminService howeWorkQSTReponseService ;
    @Autowired
    private HomeWorkAdminService homeWorkService ;
    @Autowired
    private TypeDeQuestionAdminService typeDeQuestionService ;
    public HomeWorkQuestionAdminServiceImpl(HomeWorkQuestionDao dao, HomeWorkQuestionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}