package  ma.sir.engflexy.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.engflexy.zynerator.util.ListUtil;

import ma.sir.engflexy.bean.core.Centre;

import ma.sir.engflexy.zynerator.util.StringUtil;
import ma.sir.engflexy.zynerator.converter.AbstractConverter;
import ma.sir.engflexy.zynerator.util.DateUtil;
import ma.sir.engflexy.bean.history.ParcoursHistory;
import ma.sir.engflexy.bean.core.Parcours;
import ma.sir.engflexy.ws.dto.ParcoursDto;

@Component
public class ParcoursConverter extends AbstractConverter<Parcours, ParcoursDto, ParcoursHistory> {

    @Autowired
    private CentreConverter centreConverter ;
    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private GroupeEtudiantConverter groupeEtudiantConverter ;
    @Autowired
    private NiveauEtudeConverter niveauEtudeConverter ;
    @Autowired
    private EtatCoursConverter etatCoursConverter ;
    @Autowired
    private PackStudentConverter packStudentConverter ;
    @Autowired
    private CoursConverter coursConverter ;
    @Autowired
    private StatutSocialConverter statutSocialConverter ;
    @Autowired
    private GroupeEtudiantDetailConverter groupeEtudiantDetailConverter ;
    @Autowired
    private GroupeEtudeConverter groupeEtudeConverter ;
    @Autowired
    private HomeWorkConverter homeWorkConverter ;
    @Autowired
    private LangueConverter langueConverter ;
    @Autowired
    private InteretEtudiantConverter interetEtudiantConverter ;
    @Autowired
    private EtatEtudiantScheduleConverter etatEtudiantScheduleConverter ;
    @Autowired
    private QuizEtudiantConverter quizEtudiantConverter ;
    @Autowired
    private TeacherLocalityConverter teacherLocalityConverter ;
    @Autowired
    private FonctionConverter fonctionConverter ;
    @Autowired
    private SectionConverter sectionConverter ;
    @Autowired
    private SkillConverter skillConverter ;
    private boolean centre;
    private boolean courss;
    private boolean etudiants;

    public  ParcoursConverter(){
        super(Parcours.class, ParcoursDto.class, ParcoursHistory.class);
        init(true);
    }

    @Override
    public Parcours toItem(ParcoursDto dto) {
        if (dto == null) {
            return null;
        } else {
        Parcours item = new Parcours();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDatePublication()))
                item.setDatePublication(DateUtil.stringEnToDate(dto.getDatePublication()));
            if(StringUtil.isNotEmpty(dto.getDateCreation()))
                item.setDateCreation(DateUtil.stringEnToDate(dto.getDateCreation()));
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getNumeroOrder()))
                item.setNumeroOrder(dto.getNumeroOrder());
            if(StringUtil.isNotEmpty(dto.getNombreCours()))
                item.setNombreCours(dto.getNombreCours());
            if(dto.getCentre() != null && dto.getCentre().getId() != null){
                item.setCentre(new Centre());
                item.getCentre().setId(dto.getCentre().getId());
            }


            if(this.courss && ListUtil.isNotEmpty(dto.getCourss()))
                item.setCourss(coursConverter.toItem(dto.getCourss()));
            if(this.etudiants && ListUtil.isNotEmpty(dto.getEtudiants()))
                item.setEtudiants(etudiantConverter.toItem(dto.getEtudiants()));

        return item;
        }
    }

    @Override
    public ParcoursDto toDto(Parcours item) {
        if (item == null) {
            return null;
        } else {
            ParcoursDto dto = new ParcoursDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDatePublication()!=null)
                dto.setDatePublication(DateUtil.dateTimeToString(item.getDatePublication()));
            if(item.getDateCreation()!=null)
                dto.setDateCreation(DateUtil.dateTimeToString(item.getDateCreation()));
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getNumeroOrder()))
                dto.setNumeroOrder(item.getNumeroOrder());
            if(StringUtil.isNotEmpty(item.getNombreCours()))
                dto.setNombreCours(item.getNombreCours());
        if(this.centre && item.getCentre()!=null) {
            dto.setCentre(centreConverter.toDto(item.getCentre())) ;
        }
        if(this.courss && ListUtil.isNotEmpty(item.getCourss())){
            coursConverter.init(true);
            coursConverter.setParcours(false);
            dto.setCourss(coursConverter.toDto(item.getCourss()));
            coursConverter.setParcours(true);

        }
        if(this.etudiants && ListUtil.isNotEmpty(item.getEtudiants())){
            etudiantConverter.init(true);
            etudiantConverter.setParcours(false);
            dto.setEtudiants(etudiantConverter.toDto(item.getEtudiants()));
            etudiantConverter.setParcours(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.courss = value;
        this.etudiants = value;
    }

    public void initObject(boolean value) {
        this.centre = value;
    }


    public CentreConverter getCentreConverter(){
        return this.centreConverter;
    }
    public void setCentreConverter(CentreConverter centreConverter ){
        this.centreConverter = centreConverter;
    }
    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public GroupeEtudiantConverter getGroupeEtudiantConverter(){
        return this.groupeEtudiantConverter;
    }
    public void setGroupeEtudiantConverter(GroupeEtudiantConverter groupeEtudiantConverter ){
        this.groupeEtudiantConverter = groupeEtudiantConverter;
    }
    public NiveauEtudeConverter getNiveauEtudeConverter(){
        return this.niveauEtudeConverter;
    }
    public void setNiveauEtudeConverter(NiveauEtudeConverter niveauEtudeConverter ){
        this.niveauEtudeConverter = niveauEtudeConverter;
    }
    public EtatCoursConverter getEtatCoursConverter(){
        return this.etatCoursConverter;
    }
    public void setEtatCoursConverter(EtatCoursConverter etatCoursConverter ){
        this.etatCoursConverter = etatCoursConverter;
    }
    public PackStudentConverter getPackStudentConverter(){
        return this.packStudentConverter;
    }
    public void setPackStudentConverter(PackStudentConverter packStudentConverter ){
        this.packStudentConverter = packStudentConverter;
    }
    public CoursConverter getCoursConverter(){
        return this.coursConverter;
    }
    public void setCoursConverter(CoursConverter coursConverter ){
        this.coursConverter = coursConverter;
    }
    public StatutSocialConverter getStatutSocialConverter(){
        return this.statutSocialConverter;
    }
    public void setStatutSocialConverter(StatutSocialConverter statutSocialConverter ){
        this.statutSocialConverter = statutSocialConverter;
    }
    public GroupeEtudiantDetailConverter getGroupeEtudiantDetailConverter(){
        return this.groupeEtudiantDetailConverter;
    }
    public void setGroupeEtudiantDetailConverter(GroupeEtudiantDetailConverter groupeEtudiantDetailConverter ){
        this.groupeEtudiantDetailConverter = groupeEtudiantDetailConverter;
    }
    public GroupeEtudeConverter getGroupeEtudeConverter(){
        return this.groupeEtudeConverter;
    }
    public void setGroupeEtudeConverter(GroupeEtudeConverter groupeEtudeConverter ){
        this.groupeEtudeConverter = groupeEtudeConverter;
    }
    public HomeWorkConverter getHomeWorkConverter(){
        return this.homeWorkConverter;
    }
    public void setHomeWorkConverter(HomeWorkConverter homeWorkConverter ){
        this.homeWorkConverter = homeWorkConverter;
    }
    public LangueConverter getLangueConverter(){
        return this.langueConverter;
    }
    public void setLangueConverter(LangueConverter langueConverter ){
        this.langueConverter = langueConverter;
    }
    public InteretEtudiantConverter getInteretEtudiantConverter(){
        return this.interetEtudiantConverter;
    }
    public void setInteretEtudiantConverter(InteretEtudiantConverter interetEtudiantConverter ){
        this.interetEtudiantConverter = interetEtudiantConverter;
    }
    public EtatEtudiantScheduleConverter getEtatEtudiantScheduleConverter(){
        return this.etatEtudiantScheduleConverter;
    }
    public void setEtatEtudiantScheduleConverter(EtatEtudiantScheduleConverter etatEtudiantScheduleConverter ){
        this.etatEtudiantScheduleConverter = etatEtudiantScheduleConverter;
    }
    public QuizEtudiantConverter getQuizEtudiantConverter(){
        return this.quizEtudiantConverter;
    }
    public void setQuizEtudiantConverter(QuizEtudiantConverter quizEtudiantConverter ){
        this.quizEtudiantConverter = quizEtudiantConverter;
    }
    public TeacherLocalityConverter getTeacherLocalityConverter(){
        return this.teacherLocalityConverter;
    }
    public void setTeacherLocalityConverter(TeacherLocalityConverter teacherLocalityConverter ){
        this.teacherLocalityConverter = teacherLocalityConverter;
    }
    public FonctionConverter getFonctionConverter(){
        return this.fonctionConverter;
    }
    public void setFonctionConverter(FonctionConverter fonctionConverter ){
        this.fonctionConverter = fonctionConverter;
    }
    public SectionConverter getSectionConverter(){
        return this.sectionConverter;
    }
    public void setSectionConverter(SectionConverter sectionConverter ){
        this.sectionConverter = sectionConverter;
    }
    public SkillConverter getSkillConverter(){
        return this.skillConverter;
    }
    public void setSkillConverter(SkillConverter skillConverter ){
        this.skillConverter = skillConverter;
    }
    public boolean  isCentre(){
        return this.centre;
    }
    public void  setCentre(boolean centre){
        this.centre = centre;
    }
    public boolean  isCourss(){
        return this.courss ;
    }
    public void  setCourss(boolean courss ){
        this.courss  = courss ;
    }
    public boolean  isEtudiants(){
        return this.etudiants ;
    }
    public void  setEtudiants(boolean etudiants ){
        this.etudiants  = etudiants ;
    }
}
