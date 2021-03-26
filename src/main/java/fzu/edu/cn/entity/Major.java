package fzu.edu.cn.entity;

public class Major {
    private Integer id;
    private String name;
    private String schoolcode;
    private String majorcode;

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", schoolcode='" + schoolcode + '\'' +
                ", majorcode='" + majorcode + '\'' +
                '}';
    }

    public String getMajorcode() {
        return majorcode;
    }

    public void setMajorcode(String majorcode) {
        this.majorcode = majorcode;
    }

    public Major(Integer id, String name, String schoolcode, String majorcode) {
        this.id = id;
        this.name = name;
        this.schoolcode = schoolcode;
        this.majorcode = majorcode;
    }

    public Major() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolcode() {
        return schoolcode;
    }

    public void setSchoolcode(String schoolcode) {
        this.schoolcode = schoolcode;
    }


}
