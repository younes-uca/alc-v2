package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.TypeReclamationEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeReclamationEtudiantHistoryDao extends AbstractHistoryRepository<TypeReclamationEtudiantHistory,Long> {

}
