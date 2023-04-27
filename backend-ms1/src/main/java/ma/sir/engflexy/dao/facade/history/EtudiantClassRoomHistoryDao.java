package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.EtudiantClassRoomHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantClassRoomHistoryDao extends AbstractHistoryRepository<EtudiantClassRoomHistory,Long> {

}
