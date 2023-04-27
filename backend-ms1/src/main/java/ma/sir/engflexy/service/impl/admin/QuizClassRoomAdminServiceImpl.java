package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.QuizClassRoom;
import ma.sir.engflexy.bean.history.QuizClassRoomHistory;
import ma.sir.engflexy.dao.criteria.core.QuizClassRoomCriteria;
import ma.sir.engflexy.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.QuizClassRoomDao;
import ma.sir.engflexy.dao.facade.history.QuizClassRoomHistoryDao;
import ma.sir.engflexy.dao.specification.core.QuizClassRoomSpecification;
import ma.sir.engflexy.service.facade.admin.QuizClassRoomAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.QuizAdminService ;
import ma.sir.engflexy.service.facade.admin.ClassRoomAdminService ;


import java.util.List;
@Service
public class QuizClassRoomAdminServiceImpl extends AbstractServiceImpl<QuizClassRoom,QuizClassRoomHistory, QuizClassRoomCriteria, QuizClassRoomHistoryCriteria, QuizClassRoomDao,
QuizClassRoomHistoryDao> implements QuizClassRoomAdminService {



    public List<QuizClassRoom> findByClassRoomId(Long id){
        return dao.findByClassRoomId(id);
    }
    public int deleteByClassRoomId(Long id){
        return dao.deleteByClassRoomId(id);
    }
    public List<QuizClassRoom> findByQuizId(Long id){
        return dao.findByQuizId(id);
    }
    public int deleteByQuizId(Long id){
        return dao.deleteByQuizId(id);
    }

    public void configure() {
        super.configure(QuizClassRoom.class,QuizClassRoomHistory.class, QuizClassRoomHistoryCriteria.class, QuizClassRoomSpecification.class);
    }

    @Autowired
    private QuizAdminService quizService ;
    @Autowired
    private ClassRoomAdminService classRoomService ;
    public QuizClassRoomAdminServiceImpl(QuizClassRoomDao dao, QuizClassRoomHistoryDao historyDao) {
        super(dao, historyDao);
    }

}