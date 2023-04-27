package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Question;
import ma.sir.engflexy.dao.criteria.core.QuestionCriteria;
import ma.sir.engflexy.dao.criteria.history.QuestionHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface QuestionAdminService extends  IService<Question,QuestionCriteria, QuestionHistoryCriteria>  {

    List<Question> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<Question> findByQuizId(Long id);
    int deleteByQuizId(Long id);
    List<Question> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);



}
