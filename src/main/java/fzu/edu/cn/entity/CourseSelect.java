package fzu.edu.cn.entity;

public class CourseSelect {
    private Integer classid;
    private String sid;

    @Override
    public String toString() {
        return "CourseSelect{" +
                "classid=" + classid +
                ", sid='" + sid + '\'' +
                '}';
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public CourseSelect(Integer classid, String sid) {
        this.classid = classid;
        this.sid = sid;
    }

    public CourseSelect() {
    }
}
