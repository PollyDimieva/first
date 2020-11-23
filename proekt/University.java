package proekt;
import java.util.*;

import oop.Chapter;


public class University {
String name;
int yearEstablished;
Country country;
studyProgram studyProgram;
List<studyProgram> studyProgrammes;
List<levelOfDegree> levelsOfDegree;


University() {
    levelsOfDegree = Arrays.asList(
        new levelOfDegree(this, "Bachelor's"),
        new levelOfDegree(this, "Master's"),
        new levelOfDegree(this, "Doctoral"));
}
}
