import java.util.Random;

public class OnlineCourse extends Course {
    Random r = new Random();
    private String website;

    public OnlineCourse() {
    }
    public OnlineCourse(String CourseName, String TeacherName, String website) {
        this.website = website;
        this.TeacherName = TeacherName;
        this.CourseName = CourseName;
        this.id = r.nextLong();
    }
    public String getWebsite() {
        return this.website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    @Override
    public String toString() {
        return CourseName+" - "+TeacherName+" - "+website;
    }
    
}
