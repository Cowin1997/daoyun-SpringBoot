package fzu.edu.cn.entity;

public class Student {
    private String sid;
    private String sname;
    private String phone;
    private String sex;
    private String schoolcode;
    private Integer clocktimes;
    private Integer clockscore;
    private String lastclocktime;
    private String lastclocksite;

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", schoolcode='" + schoolcode + '\'' +
                ", clocktimes=" + clocktimes +
                ", clockscore=" + clockscore +
                ", lastclocktime='" + lastclocktime + '\'' +
                ", lastclocksite='" + lastclocksite + '\'' +
                '}';
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchoolcode() {
        return schoolcode;
    }

    public void setSchoolcode(String schoolcode) {
        this.schoolcode = schoolcode;
    }

    public Integer getClocktimes() {
        return clocktimes;
    }

    public void setClocktimes(Integer clocktimes) {
        this.clocktimes = clocktimes;
    }

    public Integer getClockscore() {
        return clockscore;
    }

    public void setClockscore(Integer clockscore) {
        this.clockscore = clockscore;
    }

    public String getLastclocktime() {
        return lastclocktime;
    }

    public void setLastclocktime(String lastclocktime) {
        this.lastclocktime = lastclocktime;
    }

    public String getLastclocksite() {
        return lastclocksite;
    }

    public void setLastclocksite(String lastclocksite) {
        this.lastclocksite = lastclocksite;
    }

    public Student(String sid, String sname, String phone, String sex, String schoolcode, Integer clocktimes, Integer clockscore, String lastclocktime, String lastclocksite) {
        this.sid = sid;
        this.sname = sname;
        this.phone = phone;
        this.sex = sex;
        this.schoolcode = schoolcode;
        this.clocktimes = clocktimes;
        this.clockscore = clockscore;
        this.lastclocktime = lastclocktime;
        this.lastclocksite = lastclocksite;
    }

    public Student() {
    }
}
