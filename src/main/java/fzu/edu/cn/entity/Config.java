package fzu.edu.cn.entity;

public class Config {
    private Integer id;
    private String name;
    private String value;
    private String info;

    @Override
    public String toString() {
        return "Config{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Config(Integer id, String name, String value, String info) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.info = info;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



    public Config() {
    }
}
