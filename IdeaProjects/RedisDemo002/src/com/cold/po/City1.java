package com.cold.po;

/**
 * describe
 * 作者：曾昭武
 */
public class City1 {
    private  String id;
    private  String codeCid;
    private  String name;
    private  String codePid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeCid() {
        return codeCid;
    }

    public void setCodeCid(String codeCid) {
        this.codeCid = codeCid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodePid() {
        return codePid;
    }

    public void setCodePid(String codePid) {
        this.codePid = codePid;
    }

    @Override
    public String toString() {
        return "City1{" +
                "id='" + id + '\'' +
                ", codeCid='" + codeCid + '\'' +
                ", name='" + name + '\'' +
                ", codePid='" + codePid + '\'' +
                '}';
    }
}
