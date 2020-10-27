package com.flipkart.DAO;

import java.util.HashMap;
import java.util.List;

import com.flipkart.exceptions.CourseNotFoundException;
import com.flipkart.model.Course;

public interface ProfessorCoursesDao {

	// Add Courses to List of Professor
	void addCoursesToTeach(int userId, int id) throws CourseNotFoundException;

	//View Student List under Professor
	HashMap<Integer, Integer> viewStudentsList(int userId);


	//Delete Courses from List of Professor
	void deleteCoursesToTeach(int userId, int no) throws CourseNotFoundException;

	//View Enrolled Courses of Professor
	List<Course> viewEnrolledCourses(int userId);

}
