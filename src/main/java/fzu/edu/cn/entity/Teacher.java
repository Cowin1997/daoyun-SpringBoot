package fzu.edu.cn.entity;

public class Teacher {
    private String tid;
    private String tname;
    private String phone;
    private String schoolcode;
    private String majorcode;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", phone='" + phone + '\'' +
                ", schoolcode='" + schoolcode + '\'' +
                ", majorcode='" + majorcode + '\'' +
                '}';
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchoolcode() {
        return schoolcode;
    }

    public void setSchoolcode(String schoolcode) {
        this.schoolcode = schoolcode;
    }

    public String getMajorcode() {
        return majorcode;
    }

    public void setMajorcode(String majorcode) {
        this.majorcode = majorcode;
    }

    public Teacher(String tid, String tname, String phone, String schoolcode, String majorcode) {
        this.tid = tid;
        this.tname = tname;
        this.phone = phone;
        this.schoolcode = schoolcode;
        this.majorcode = majorcode;
    }

    public Teacher() {
    }
}
