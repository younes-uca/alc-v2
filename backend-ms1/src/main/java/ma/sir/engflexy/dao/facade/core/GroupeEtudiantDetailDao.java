package ma.sir.engflexy.dao.facade.core;

import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.GroupeEtudiantDetail;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface GroupeEtudiantDetailDao extends AbstractRepository<GroupeEtudiantDetail,Long>  {

    List<GroupeEtudiantDetail> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<GroupeEtudiantDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
