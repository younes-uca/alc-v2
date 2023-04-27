package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.TypeReclamationProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeReclamationProfHistoryDao extends AbstractHistoryRepository<TypeReclamationProfHistory,Long> {

}
