package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.ClassRoom;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ClassRoomDao extends AbstractRepository<ClassRoom,Long>  {

    List<ClassRoom> findByProfId(Long id);
    int deleteByProfId(Long id);

    @Query("SELECT NEW ClassRoom(item.id,item.libelle) FROM ClassRoom item")
    List<ClassRoom> findAllOptimized();
}
