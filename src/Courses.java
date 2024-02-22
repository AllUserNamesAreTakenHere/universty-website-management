public abstract class Courses {
    public String courseTitle;
    public String professorName ;
    public  String presenterCollege;
    public String courseType;
    public int courseCode;
    // courseCode= presenterCollegeCode + a randaom number
    public int courseVahed;
    public int courseCapacity;
    public int enrolledStudents;
    public String[] classDays;
    public double classBeginingHour;
    public double classEndingHour;
    public String finalExamMonth;
    public int finalExamDay;
    public double finalExamHour;



    public Courses(String courseTitle,String professorName, String presenterCollege,String courseType,int courseCode,int courseVahed,int courseCapacity,
                  int enrolledStudents,String[] classDays,double classBeginingHour,double classEndingHour,String finalExamMonth,int finalExamDay,double finalExamHour) {
        this.courseTitle=courseTitle;
        this.professorName = professorName;
        this.presenterCollege=presenterCollege;
        this.courseType = courseType;
        this.courseCode=courseCode;
        this.courseVahed=courseVahed;
        this.courseCapacity=courseCapacity;
        this.enrolledStudents=enrolledStudents;
        this.classBeginingHour=classBeginingHour;
        this.classEndingHour=classEndingHour;
        this.finalExamMonth=finalExamMonth;
        this.finalExamDay=finalExamDay;
        this.finalExamHour=finalExamHour;
        this.classDays=classDays;
    }

}
