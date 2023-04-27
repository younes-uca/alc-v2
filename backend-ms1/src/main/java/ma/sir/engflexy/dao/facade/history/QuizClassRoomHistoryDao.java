package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.QuizClassRoomHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizClassRoomHistoryDao extends AbstractHistoryRepository<QuizClassRoomHistory,Long> {

}
