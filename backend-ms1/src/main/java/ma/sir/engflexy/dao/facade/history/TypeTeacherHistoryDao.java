package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.TypeTeacherHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeTeacherHistoryDao extends AbstractHistoryRepository<TypeTeacherHistory,Long> {

}
