package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.TypeHomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeHomeWorkHistoryDao extends AbstractHistoryRepository<TypeHomeWorkHistory,Long> {

}
