package courses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CourseRepository {
	
	protected Map<Long, CourseTopic> courses = new HashMap<Long, CourseTopic>();
	
	public CourseRepository() {
		
		CourseTopic course1 = new CourseTopic(1L,"Spring Framework", "Spring Framework Description", "Brian");
		CourseTopic course2 = new CourseTopic(2L,"Core Java", "Core Java Description", "Alan");
		CourseTopic course3 = new CourseTopic(3L,"Javascript", "Javascript Description", "Donny");
		
		courses.put(course1.getId(), course1);
		courses.put(course2.getId(), course2);
		courses.put(course3.getId(), course3);
		
	}
	
	public Collection<CourseTopic> findAll(){
		return courses.values();
	}
	
	public CourseTopic findOne(Long id) {
		return courses.get(id);
	}
	
	public void addCourse(CourseTopic course) {
		courses.put(course.getId(), course);
	}
	
	public void removeCourse(CourseTopic course) {
		courses.remove(course.getId(), course);
	}
	

}
