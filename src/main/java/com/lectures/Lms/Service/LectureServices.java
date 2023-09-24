package com.lectures.Lms.Service;

import com.lectures.Lms.Data.LectureData;
import com.lectures.Lms.Data.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LectureServices {

    @Autowired
    private LectureRepository lectureRepository;

    public List<LectureData> getAllLecture(){
        return lectureRepository.findAll();
    }
    public LectureData getLectureById(int id) {
        Optional<LectureData> lecture = lectureRepository.findById(id);
        return lecture.orElse(null);
    }
    public String addLecture(LectureData lecture) {
        lectureRepository.save(lecture);
        return lecture.getName() + " has been successfully added";
    }

    public String updateLecture(LectureData lecture) {
        lectureRepository.save(lecture);
        return lecture.getName() + "'s contents has been updated successfully";
    }

    public String deleteLecture(int id) {
        lectureRepository.deleteById(id);
        return "Lecture with id " + id + " has been successfully deleted";
    }



}
