package whz.pti.eva.praktikum_02.grade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import whz.pti.eva.praktikum_02.grade.domain.Grade;
import whz.pti.eva.praktikum_02.grade.domain.GradeRepository;

@Service
public class GradeServiceImpl implements GradeService {

	@Autowired
	private GradeRepository gradeRepository;

	@Override
	public List<Grade> listAllGrades() {
		// TODO Auto-generated method stub
		return gradeRepository.findAll();
	}

	@Override
	public void addGrade(String lecture, String grade) {
		// TODO Auto-generated method stub
		gradeRepository.save(new Grade(lecture, grade));
	}

	@Override
	public double calculcateAverage() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
