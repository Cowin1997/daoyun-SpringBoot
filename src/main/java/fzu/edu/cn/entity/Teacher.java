package fzu.edu.cn.entity;

public class Teacher {
    private String tid;
    private String tname;
    private String phone;
    private String schoolcode;
    private String majorcode;
    private String edu;
    private String rank;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", phone='" + phone + '\'' +
                ", schoolcode='" + schoolcode + '\'' +
                ", majorcode='" + majorcode + '\'' +
                ", edu='" + edu + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    public Teacher(String tid, String tname, String phone, String schoolcode, String majorcode, String edu, String rank) {
        this.tid = tid;
        this.tname = tname;
        this.phone = phone;
        this.schoolcode = schoolcode;
        this.majorcode = majorcode;
        this.edu = edu;
        this.rank = rank;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
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


    public Teacher() {
    }
}
