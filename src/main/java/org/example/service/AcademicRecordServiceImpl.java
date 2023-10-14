package org.example.service;

import java.util.List;
import org.example.model.Grade;
import org.example.repository.GradeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AcademicRecordServiceImpl implements AcademicRecordService {

  private static final Logger logger = LoggerFactory.getLogger(AcademicRecordServiceImpl.class);
  private final GradeRepository gradeRepository;

  public AcademicRecordServiceImpl(GradeRepository gradeRepository) {
    this.gradeRepository = gradeRepository;
  }

  @Override
  public Double calculateAverage(List<Grade> grades) {
    double averageGrades = 0;
    if (!grades.isEmpty()) {
      for (Grade grade : grades) {
        averageGrades = averageGrades + grade.grade();
      }
      logger.info("El calculo de promedio fue realizado correctamente: ");
      return averageGrades/grades.size();
    }
    else {
      return null;
    }
  }

  @Override
  public Integer sumNumberOfGrades(List<Grade> grades) {
    /*
    System.out.println("Sumando el número de calificaciones");
    logger.info("Sumando el número de calificaciones");
    logger.warn("Sumando el número de calificaciones");
    logger.error("Sumando el número de calificaciones");

    List<Grade> gradeList = this.gradeRepository.findAllGrades();
    // TODO sum number of grades and return the summation*/
    int numberOfGrades = 0;
    if(!grades.isEmpty()) {
      for (Grade grade : grades) {
        numberOfGrades ++;
      }
      logger.info("La suma del número de calificaciones fue realizada correctamente :");
      return numberOfGrades;
    }
    return null;
  }
}
