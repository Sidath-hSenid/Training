package com.springone.demoone.service;

import com.springone.demoone.dto.StudentRequestDTO;
import com.springone.demoone.dto.StudentResponseDTO;
import com.springone.demoone.exception.HandleException;
import com.springone.demoone.model.Student;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springone.demoone.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ModelMapper modelMapper;

    // logback implementation
    Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Override
    public StudentRequestDTO addStudent(StudentRequestDTO studentRequestDTO) {
        try{
            logger.info("Inside addStudent() function...");
            String studentName = modelMapper.map(studentRequestDTO, Student.class).getName();
            StudentRequestDTO studentObj = studentRepository.findByName(studentName);
            if(studentObj != null){
                logger.warn("Student already exists!");
                throw new HandleException("Exits without inserting data!!");
            }else{
                studentRepository.save(modelMapper.map(studentRequestDTO, Student.class));
                logger.info("Student added...");
                return studentRequestDTO;
            }
        }
        catch(Exception exception){
            throw exception;
        }
    }

    @Override
    public List<StudentResponseDTO> getStudents() {
        try{
            logger.info("Inside getStudents() function...");
            List<Student> studentList = studentRepository.findAll();
            if(studentList.isEmpty()){
                logger.warn("No students available!");
                throw new HandleException("Exits without displaying data");
            }
            else{
                logger.info("Students are available..." + studentList);
                return modelMapper.map(studentList, new TypeToken<List<StudentRequestDTO>>(){}.getType());
            }
        }catch(Exception exception){
            throw exception;
        }
    }

    @Override
    public StudentResponseDTO getStudentById(int id) {
        try {
            logger.info("Inside getStudentById() function...");
            Optional<Student> studentObj =  studentRepository.findById(id);
            if(studentObj.isPresent()){
                logger.info("Student available..." + studentObj);
                Student student = studentObj.get();
                return modelMapper.map(student, StudentResponseDTO.class);
            }else{
                logger.warn("No Such Student exists!");
                throw new HandleException("Exits without displaying data!!");
            }
        }catch (Exception exception){
            throw exception;
        }
    }

    @Override
    public void deleteStudent(int id) {
        try {
            logger.info("Inside deleteStudent() function...");
            Optional<Student> studentObj =  studentRepository.findById(id);
            if(studentObj.isPresent()){
                logger.info("Student available..." + studentObj);
                studentRepository.deleteById(id);
            }else{
                logger.warn("No Such Student exists!");
                throw new HandleException("Exits without deleting data!!");
            }
        }catch (Exception exception){
            throw exception;
        }
    }
}
