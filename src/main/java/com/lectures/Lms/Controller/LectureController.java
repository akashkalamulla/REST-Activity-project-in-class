package com.lectures.Lms.Controller;

import com.lectures.Lms.Data.LectureData;
import com.lectures.Lms.Service.LectureServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LectureController {

    @Autowired
    private LectureServices lectureServices;

    @GetMapping(path = "/lectures")
    public List<LectureData> getAllectures(){
        return lectureServices.getAllLecture();
    }

    @GetMapping(path = "/lectures/{id}")
    public LectureData getLecturebyId(@PathVariable int id){
        return lectureServices.getLectureById(id);
    }

    @PostMapping("/lectures")
    public String createStudent(@RequestBody LectureData lecture) {
        return lectureServices.addLecture(lecture);
    }

    @PutMapping("/lectures")
    public String updateStudent(@RequestBody LectureData lecture){
        return lectureServices.updateLecture(lecture);
    }

    @DeleteMapping("/lectures/{id}")
    public String deleteLecture(@PathVariable int id) {
        return lectureServices.deleteLecture(id);

    }


}
