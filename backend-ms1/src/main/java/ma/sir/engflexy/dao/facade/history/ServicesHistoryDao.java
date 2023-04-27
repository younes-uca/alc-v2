package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ServicesHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesHistoryDao extends AbstractHistoryRepository<ServicesHistory,Long> {

}