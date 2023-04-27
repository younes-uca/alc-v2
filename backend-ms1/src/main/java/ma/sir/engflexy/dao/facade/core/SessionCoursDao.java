package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.SessionCours;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.SessionCours;
import java.util.List;


@Repository
public interface SessionCoursDao extends AbstractRepository<SessionCours,Long>  {
    SessionCours findByReference(String reference);
    int deleteByReference(String reference);

    List<SessionCours> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<SessionCours> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<SessionCours> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<SessionCours> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);

    @Query("SELECT NEW SessionCours(item.id,item.reference) FROM SessionCours item")
    List<SessionCours> findAllOptimized();
}
