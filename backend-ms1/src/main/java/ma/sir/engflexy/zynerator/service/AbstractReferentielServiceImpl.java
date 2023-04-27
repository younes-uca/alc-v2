package ma.sir.engflexy.zynerator.service;

import ma.sir.engflexy.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.engflexy.zynerator.criteria.BaseCriteria;
import ma.sir.engflexy.zynerator.history.HistBusinessObject;
import ma.sir.engflexy.zynerator.history.HistCriteria;
import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}