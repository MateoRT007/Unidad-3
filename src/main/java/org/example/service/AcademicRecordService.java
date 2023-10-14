package org.example.service;

import org.example.model.Grade;

import java.util.List;

public interface AcademicRecordService {
  Double calculateAverage(List<Grade> grades);

  Integer sumNumberOfGrades(List<Grade> grades);
}
