package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.HomeWorkQuestion;
import ma.sir.engflexy.dao.criteria.core.HomeWorkQuestionCriteria;
import ma.sir.engflexy.dao.criteria.history.HomeWorkQuestionHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface HomeWorkQuestionAdminService extends  IService<HomeWorkQuestion,HomeWorkQuestionCriteria, HomeWorkQuestionHistoryCriteria>  {

    List<HomeWorkQuestion> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<HomeWorkQuestion> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);



}
