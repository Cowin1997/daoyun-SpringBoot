package fzu.edu.cn.entity;

public class ClasS {
    private Integer cid;
    private String cname;
    private String tid;
    private String site;
    private String schoolcode;
    private String majorcode;

    public ClasS() {
    }

    @Override
    public String toString() {
        return "ClasS{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", tid='" + tid + '\'' +
                ", site='" + site + '\'' +
                ", schoolcode='" + schoolcode + '\'' +
                ", majorcode='" + majorcode + '\'' +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
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

    public ClasS(Integer cid, String cname, String tid, String site, String schoolcode, String majorcode) {
        this.cid = cid;
        this.cname = cname;
        this.tid = tid;
        this.site = site;
        this.schoolcode = schoolcode;
        this.majorcode = majorcode;
    }
}
