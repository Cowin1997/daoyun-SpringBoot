package fzu.edu.cn.entity;

public class School {
    private Integer id;
    private String name;
    private String code;

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public School(Integer id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public School() {
    }
}
