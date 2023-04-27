package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.WorkloadBonus;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.WorkloadBonus;
import java.util.List;


@Repository
public interface WorkloadBonusDao extends AbstractRepository<WorkloadBonus,Long>  {
    WorkloadBonus findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW WorkloadBonus(item.id,item.code) FROM WorkloadBonus item")
    List<WorkloadBonus> findAllOptimized();
}
