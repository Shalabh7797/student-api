package com.student.api.service;
import com.student.api.dto.StudentDTO;
import com.student.api.entity.Student;
import com.student.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = modelMapper.map(studentDTO, Student.class);
        Student saved = studentRepository.save(student);
        return modelMapper.map(saved, StudentDTO.class);
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream()
                .map(student -> modelMapper.map(student, StudentDTO.class))
                .toList();
    }

    @Override
    public StudentDTO getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        return modelMapper.map(student, StudentDTO.class);
    }

    @Override
    public StudentDTO updateStudent(Long id, StudentDTO studentDTO) {
        Student existing = studentRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(studentDTO.getName());
            existing.setEmail(studentDTO.getEmail());
            existing.setCourse(studentDTO.getCourse());
            return modelMapper.map(studentRepository.save(existing), StudentDTO.class);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

