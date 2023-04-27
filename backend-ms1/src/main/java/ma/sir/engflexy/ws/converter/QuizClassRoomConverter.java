package  ma.sir.engflexy.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.engflexy.bean.core.ClassRoom;
import ma.sir.engflexy.bean.core.Quiz;

import ma.sir.engflexy.zynerator.util.StringUtil;
import ma.sir.engflexy.zynerator.converter.AbstractConverter;
import ma.sir.engflexy.zynerator.util.DateUtil;
import ma.sir.engflexy.bean.history.QuizClassRoomHistory;
import ma.sir.engflexy.bean.core.QuizClassRoom;
import ma.sir.engflexy.ws.dto.QuizClassRoomDto;

@Component
public class QuizClassRoomConverter extends AbstractConverter<QuizClassRoom, QuizClassRoomDto, QuizClassRoomHistory> {

    @Autowired
    private QuizConverter quizConverter ;
    @Autowired
    private ClassRoomConverter classRoomConverter ;
    private boolean classRoom;
    private boolean quiz;

    public  QuizClassRoomConverter(){
        super(QuizClassRoom.class, QuizClassRoomDto.class, QuizClassRoomHistory.class);
    }

    @Override
    public QuizClassRoom toItem(QuizClassRoomDto dto) {
        if (dto == null) {
            return null;
        } else {
        QuizClassRoom item = new QuizClassRoom();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(dto.getClassRoom() != null && dto.getClassRoom().getId() != null){
                item.setClassRoom(new ClassRoom());
                item.getClassRoom().setId(dto.getClassRoom().getId());
            }

            if(dto.getQuiz() != null && dto.getQuiz().getId() != null){
                item.setQuiz(new Quiz());
                item.getQuiz().setId(dto.getQuiz().getId());
            }



        return item;
        }
    }

    @Override
    public QuizClassRoomDto toDto(QuizClassRoom item) {
        if (item == null) {
            return null;
        } else {
            QuizClassRoomDto dto = new QuizClassRoomDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
        if(this.classRoom && item.getClassRoom()!=null) {
            dto.setClassRoom(classRoomConverter.toDto(item.getClassRoom())) ;
        }
        if(this.quiz && item.getQuiz()!=null) {
            dto.setQuiz(quizConverter.toDto(item.getQuiz())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.classRoom = value;
        this.quiz = value;
    }


    public QuizConverter getQuizConverter(){
        return this.quizConverter;
    }
    public void setQuizConverter(QuizConverter quizConverter ){
        this.quizConverter = quizConverter;
    }
    public ClassRoomConverter getClassRoomConverter(){
        return this.classRoomConverter;
    }
    public void setClassRoomConverter(ClassRoomConverter classRoomConverter ){
        this.classRoomConverter = classRoomConverter;
    }
    public boolean  isClassRoom(){
        return this.classRoom;
    }
    public void  setClassRoom(boolean classRoom){
        this.classRoom = classRoom;
    }
    public boolean  isQuiz(){
        return this.quiz;
    }
    public void  setQuiz(boolean quiz){
        this.quiz = quiz;
    }
}
