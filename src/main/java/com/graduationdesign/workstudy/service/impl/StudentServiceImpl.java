package com.graduationdesign.workstudy.service.impl;

import com.graduationdesign.workstudy.entity.Student;
import com.graduationdesign.workstudy.mapper.StudentMapper;
import com.graduationdesign.workstudy.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lmt
 * @since 2025-03-30
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
