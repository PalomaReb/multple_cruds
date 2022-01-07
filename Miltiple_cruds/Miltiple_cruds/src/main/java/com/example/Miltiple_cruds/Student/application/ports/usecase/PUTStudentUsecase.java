package com.example.Miltiple_cruds.Student.application.ports.usecase;

import com.example.Miltiple_cruds.Student.application.ports.PUTStudentPort;

public class PUTStudentUsecase implements PUTStudentPort {

   /* @Autowired
    StudentJPA studentJPA;

    public StudentOUTPUT updateStudent(StudentINPUT studentINPUT, String id) throws Exception {
        if(studentJPA.findById(id).isEmpty()){throw new NotFoundException("No existe estudiante con id:" + id);}
        Student student = StudentINPUT.toOutput();
        student.setId_student(id);
        studentJPA.saveAndFlush(student);

        return new StudentOUTPUT(student);
    }*/
}
