package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.RecommendTeacherHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendTeacherHistoryDao extends AbstractHistoryRepository<RecommendTeacherHistory,Long> {

}
