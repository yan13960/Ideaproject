package com.cold.po;

/**
 * describe
 * 作者：曾昭武
 */
public class Province1 {
    private  String id;
    private  String codePid;
    private  String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodePid() {
        return codePid;
    }

    public void setCodePid(String codePid) {
        this.codePid = codePid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Province1{" +
                "id='" + id + '\'' +
                ", codePid='" + codePid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
