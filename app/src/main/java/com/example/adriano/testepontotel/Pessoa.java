package com.example.adriano.testepontotel;

import java.io.Serializable;

public class Pessoa implements Serializable {

    /**
     * POJO
     */
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String pws;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPws() { return pws; }

    public void setPws(String pws) { this.pws = pws; }

    @Override
    public String toString() {
        return  name;
    }


}
