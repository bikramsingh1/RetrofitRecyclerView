package com.apkglobal.retrofitir.retrofit_fetch;

/**
 * Created by HP on 05-Jan-18.
 */

public class Pojo {
    private String name;
    private String email;
    private String phn;
    public Pojo(String name, String email,String phn) {
        this.name = name;
        this.email = email;
        this.phn=phn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getPhn() {
        return phn;
    }
}
