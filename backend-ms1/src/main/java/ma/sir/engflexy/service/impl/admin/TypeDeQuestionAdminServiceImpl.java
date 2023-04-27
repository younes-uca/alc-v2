package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.TypeDeQuestion;
import ma.sir.engflexy.bean.history.TypeDeQuestionHistory;
import ma.sir.engflexy.dao.criteria.core.TypeDeQuestionCriteria;
import ma.sir.engflexy.dao.criteria.history.TypeDeQuestionHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.TypeDeQuestionDao;
import ma.sir.engflexy.dao.facade.history.TypeDeQuestionHistoryDao;
import ma.sir.engflexy.dao.specification.core.TypeDeQuestionSpecification;
import ma.sir.engflexy.service.facade.admin.TypeDeQuestionAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeDeQuestionAdminServiceImpl extends AbstractServiceImpl<TypeDeQuestion,TypeDeQuestionHistory, TypeDeQuestionCriteria, TypeDeQuestionHistoryCriteria, TypeDeQuestionDao,
TypeDeQuestionHistoryDao> implements TypeDeQuestionAdminService {


    public TypeDeQuestion findByReferenceEntity(TypeDeQuestion t){
        return  dao.findByRef(t.getRef());
    }


    public void configure() {
        super.configure(TypeDeQuestion.class,TypeDeQuestionHistory.class, TypeDeQuestionHistoryCriteria.class, TypeDeQuestionSpecification.class);
    }

    public TypeDeQuestionAdminServiceImpl(TypeDeQuestionDao dao, TypeDeQuestionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}