package edu.csusm;

public class DeletePasswordCommand extends AbstractPasswordCommand {
    private String namePass;
    private String password;
    private int encryptType;
    //private String[] oldInfo;
    DeletePasswordCommand(String name){
        this.namePass = name;
    }
    public void doIt() {
        String[] oldInfo = UserDAO.deleteSiteInfo(this.namePass);
        this.encryptType = Integer.parseInt(oldInfo[1]);
        this.password = oldInfo[2];
    }

    public void undoIt() {
        UserDAO.addSiteInfo(this.namePass, this.password, this.encryptType);
    }
    public void redoIt() {
        UserDAO.deleteSiteInfo(this.namePass);
    }
}
