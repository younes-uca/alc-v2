package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.ResultatHomeWork;
import ma.sir.engflexy.bean.history.ResultatHomeWorkHistory;
import ma.sir.engflexy.dao.criteria.core.ResultatHomeWorkCriteria;
import ma.sir.engflexy.dao.criteria.history.ResultatHomeWorkHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.ResultatHomeWorkDao;
import ma.sir.engflexy.dao.facade.history.ResultatHomeWorkHistoryDao;
import ma.sir.engflexy.dao.specification.core.ResultatHomeWorkSpecification;
import ma.sir.engflexy.service.facade.admin.ResultatHomeWorkAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ResultatHomeWorkAdminServiceImpl extends AbstractServiceImpl<ResultatHomeWork,ResultatHomeWorkHistory, ResultatHomeWorkCriteria, ResultatHomeWorkHistoryCriteria, ResultatHomeWorkDao,
ResultatHomeWorkHistoryDao> implements ResultatHomeWorkAdminService {


    public ResultatHomeWork findByReferenceEntity(ResultatHomeWork t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(ResultatHomeWork.class,ResultatHomeWorkHistory.class, ResultatHomeWorkHistoryCriteria.class, ResultatHomeWorkSpecification.class);
    }

    public ResultatHomeWorkAdminServiceImpl(ResultatHomeWorkDao dao, ResultatHomeWorkHistoryDao historyDao) {
        super(dao, historyDao);
    }

}