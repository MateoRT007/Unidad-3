package org.example;

import java.text.MessageFormat;
import org.example.repository.GradeInMemoryRepositoryImpl;
import org.example.repository.GradeRepository;
import org.example.service.AcademicRecordService;
import org.example.service.AcademicRecordServiceImpl;

public class ApplicationRunner {
  public static void main(String[] args) {

    AcademicRecordService academicRecordService =
        new AcademicRecordServiceImpl(new GradeInMemoryRepositoryImpl());

    GradeRepository gradeRepositoy = new GradeInMemoryRepositoryImpl();

    System.out.println(
        MessageFormat.format(
            "Suma de número calificaciones: {0}", academicRecordService.sumNumberOfGrades(gradeRepositoy.findAllGrades())));

    System.out.println(
        MessageFormat.format("Promedio: {0}", academicRecordService.calculateAverage(gradeRepositoy.findAllGrades())));
  }
}
