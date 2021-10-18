package whz.pti.eva.praktikum_02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whz.pti.eva.praktikum_02.domain.Grade;
import whz.pti.eva.praktikum_02.domain.GradeRepository;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    GradeRepository gradeRepository;

    @Override
    public List<Grade> listAllGrades() {
        return gradeRepository.findAll();
    }

    @Override
    public void addGrade(String lecture, String grade) {
        gradeRepository.save(new Grade(lecture, grade));
    }

    @Override
    public double calculcateAverage() {
        int average =0;
        List<Grade> gradeList = gradeRepository.findAll();
        for (int i = 0; i < gradeList.size(); i++) {
            average = average + Integer.parseInt(gradeList.get(i).getGrade());
        }
        return (average/gradeList.size());
    }


}
