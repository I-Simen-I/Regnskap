package no.regnskap.pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CommonAction {
    private String user;

    public void onload() {

    }

    public String getFormId() {
        return "formId";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
