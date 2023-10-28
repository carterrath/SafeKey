package edu.csusm;

public class EditPasswordCommand extends AbstractPasswordCommand{
    private String namePass;
    private String[] oldInfo;
    private String password;
    private String oldPassword;
    private int encryptMethod;
    EditPasswordCommand(String name, String password){
        this.namePass = name;
        this.password = password;
    }
    public void doIt() throws Exception {
        this.oldInfo = UserDAO.editSiteInfo(this.namePass, this.password);
        this.oldPassword = oldInfo[2];
        this.encryptMethod = Integer.parseInt(oldInfo[1]);
    }

    public void undoIt() throws Exception {
        this.password = KeyManager.getInstance().encryption(this.oldPassword, this.encryptMethod, 2);
        this.oldInfo = UserDAO.editSiteInfo(this.namePass, this.password);
        this.oldPassword = oldInfo[2];
    }
    public void redoIt() throws Exception {
        this.password = KeyManager.getInstance().encryption(this.oldPassword, this.encryptMethod, 2);
        this.oldInfo = UserDAO.editSiteInfo(this.namePass, this.password);
        this.oldPassword = oldInfo[2];
    }
}
