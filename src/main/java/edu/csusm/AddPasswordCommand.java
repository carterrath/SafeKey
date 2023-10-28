package edu.csusm;

public class AddPasswordCommand extends AbstractPasswordCommand{
    private String namePass;
    private String password;
    private int encryptMethod;
    AddPasswordCommand(String name, String password, int method){
        this.namePass = name;
        this.password = password;
        this.encryptMethod = method;
    }
    public void doIt() {
        UserDAO.addSiteInfo(namePass, password, encryptMethod);
    }

    public void undoIt() {
        UserDAO.deleteSiteInfo(namePass);
    }
    public void redoIt() {
        UserDAO.addSiteInfo(this.namePass, this.password, this.encryptMethod);
    }
}
