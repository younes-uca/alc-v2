package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.InviteStudent;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.InviteStudent;
import java.util.List;


@Repository
public interface InviteStudentDao extends AbstractRepository<InviteStudent,Long>  {
    InviteStudent findByCode(String code);
    int deleteByCode(String code);

    List<InviteStudent> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

    @Query("SELECT NEW InviteStudent(item.id,item.code) FROM InviteStudent item")
    List<InviteStudent> findAllOptimized();
}
