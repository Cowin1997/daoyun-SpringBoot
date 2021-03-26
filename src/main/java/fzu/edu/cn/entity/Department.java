package fzu.edu.cn.entity;

public class Department {
    private Integer id;
    private Integer schoolId;
    private String name;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", schoolId=" + schoolId +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(Integer id, Integer schoolId, String name) {
        this.id = id;
        this.schoolId = schoolId;
        this.name = name;
    }

    public Department() {
    }
}
