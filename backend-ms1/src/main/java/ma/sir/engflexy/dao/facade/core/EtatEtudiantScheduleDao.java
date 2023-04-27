package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.EtatEtudiantSchedule;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.EtatEtudiantSchedule;
import java.util.List;


@Repository
public interface EtatEtudiantScheduleDao extends AbstractRepository<EtatEtudiantSchedule,Long>  {
    EtatEtudiantSchedule findByLibelle(String libelle);
    int deleteByLibelle(String libelle);


    @Query("SELECT NEW EtatEtudiantSchedule(item.id,item.libelle) FROM EtatEtudiantSchedule item")
    List<EtatEtudiantSchedule> findAllOptimized();
}
