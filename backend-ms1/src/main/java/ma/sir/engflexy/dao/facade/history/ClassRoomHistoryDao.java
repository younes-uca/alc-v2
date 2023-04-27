package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ClassRoomHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomHistoryDao extends AbstractHistoryRepository<ClassRoomHistory,Long> {

}
