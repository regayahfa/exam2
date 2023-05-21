package com.example.exam2.Controller;

import com.example.exam2.model.Student;
import com.example.exam2.model.Teacher;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/school")
@RequiredArgsConstructor
public class SchoolController {
    ArrayList<Student>students=new ArrayList<>();

    @PostMapping("/get")
    public ArrayList<Student>getStudent(){
        return students;
    }
   public ResponseEntity addstudent(@RequestBody Student student, Errors errors){
        if(errors.hasErrors()){
            String massege=students.set(student.getId();

            return errors.getFieldError.stutes(200).body(massege);
        }
        students.add(student);
        return errors.getFieldError().stutes(400).body("not faund");
   }
   public ResponseEntity updateStudent(@Valid @RequestBody Student student, Errors errors){
        if(errors.hasErrors()){
            return errors.getFieldError().getField();


        }
        students.set(student.getId(), student.getName());
        return errors.getFieldError().stutes(200).body("not allowd");}




   }
   public ResponseEntity deleteStudent(@Valid @RequestBody Student student,Errors errors){
        if (errors.hasErrors()){
            return student.getName();
        }
        return deleteStudent();
   }


    ArrayList<Teacher>teachers=new ArrayList<>();

    @PostMapping("/get")
    public ArrayList<Teacher>getteachar(){
        return teachers;
    }
    public String addteachar(@RequestBody Teacher teacher, Errors errors){
        if(errors.hasErrors()){
            String massege=teachers.set(teacher.getId(){
                return errors.getFieldError.stutes(200).body(massege);
            }
            teachers.add(teacher);
            return errors.getFieldError().stutes(400).body("not faund");

        }

        public String updateteacher( @RequestBody Teacher teacher, Errors errors){
            if(errors.hasErrors()){
                return errors.getFieldError().getField();


            }
            students.set(teacher.getId(), teacher.getName());
            return errors.getFieldError().stutes(200).body("not allowd");}




    }
    public ResponseEntity deleteteacher(@Valid @RequestBody Teacher teacher, @PathVariable int id, Errors errors){
        if (errors.hasErrors()){
            return teachers.remove(id);
        }
        return deleteStudent(id);

    }

//    private ResponseEntity deleteStudent(int id) {
//        return null;
//    }

}



