package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.SalaryHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryHistoryDao extends AbstractHistoryRepository<SalaryHistory,Long> {

}
