package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.TeacherLocalityHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherLocalityHistoryDao extends AbstractHistoryRepository<TeacherLocalityHistory,Long> {

}
