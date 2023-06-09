package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.QuizClassRoom;
import ma.sir.engflexy.dao.criteria.core.QuizClassRoomCriteria;
import ma.sir.engflexy.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface QuizClassRoomAdminService extends  IService<QuizClassRoom,QuizClassRoomCriteria, QuizClassRoomHistoryCriteria>  {

    List<QuizClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<QuizClassRoom> findByQuizId(Long id);
    int deleteByQuizId(Long id);



}
