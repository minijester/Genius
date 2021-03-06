package projectlibrary.GUI;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import projectlibrary.database.dbLogin;

/**
 *
 * @author Sae
 */
public class Login extends SuperMenu {
    JButton blogin; // login button
    JPanel loginpanel; 
    JTextField txuser; // id textfield
    JPasswordField pass; // password text
    JButton register; // register button
    JLabel username; // id :
    JLabel password; // pass :
    boolean login;
    dbLogin log = new dbLogin();
    
    public Login(){ // constructor
        
        blogin = new JButton("Login");
        loginpanel = new JPanel();
        txuser = new JTextField(15);
        pass = new JPasswordField(15);
        register = new JButton("Register");
        username = new JLabel("ID : ");
        password = new JLabel("Pass : ");
        
        
        // set size and location of login frame
        setSize(300,200);
        setLocation(500,280);
        loginpanel.setLayout (null); 
        
        // set bound
        txuser.setBounds(70,30,150,20);
        pass.setBounds(70,65,150,20);
        blogin.setBounds(110,100,80,20);
        register.setBounds(105,135,90,20);
        username.setBounds(20,28,80,20);
        password.setBounds(20,63,90,20);
        
        // add panel
        loginpanel.add(blogin);
        loginpanel.add(txuser);
        loginpanel.add(pass);
        loginpanel.add(register);
        loginpanel.add(username);
        loginpanel.add(password);
        
        getContentPane().add(loginpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        blogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String str = String.valueOf(pass.getPassword());
                doLogin(txuser.getText(), str);
                /**checkInput(txuser.getText(),str);
                System.out.println(str);
                if(login == true){
                    ArrayList<HashMap> list2 = log.checkID(txuser.getText());
                    String sta = "SELECT * FROM LibrayAccount where ID = '"+ txuser.getText()+ "'";
                    System.out.println(sta);
                    ArrayList<HashMap> list2 = db.queryRows(sta);
                    System.out.println(list2);
                    boolean delSuccess = db.executeQuery(sta);
                    System.out.println(delSuccess); 
                    for(HashMap l : list2){
                        if(l.get("Status").equals("Member")){
                            status = "Member";
                            id = txuser.getText();
                            JOptionPane.showMessageDialog(rootPane, "Login successfully"); 
                            dbLogin.disconnect();
                            dispose();
                            MainMenu menu = new MainMenu(id,status);
                            menu.setVisible(true);
                            break;
                            }
                            else{ // Admin main menu
                                status = "Admin";
                                id = txuser.getText();
                                JOptionPane.showMessageDialog(rootPane, "Login successfully"); 
                                dbLogin.dbConnect();
                                dispose();
                                MainMenuAdmin menu = new MainMenuAdmin(id,status);
                                menu.setVisible(true);
                            } 
                    }
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, checkInput(txuser.getText(),str)); 
                }*/
            }
        });
        register.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dbLogin.disconnect();
                dispose();
                Register r = new Register();
                r.setVisible(true);
            }
        });
        this.setResizable(false);
    }
    
    @Override
    public void createMenu(String status, String id) {
        if(status.equals("Member")){
            MainMenu member = new MainMenu(id,status);
            member.setVisible(true);
        }
        else{
            MainMenuAdmin mainad = new MainMenuAdmin(id,status);
            mainad.setVisible(true);
        }
    }
    
    public void doLogin(String id,String pass){
        checkInput(id,pass);
        if(login == true){
                    ArrayList<HashMap> list2 = log.checkID(id);
                    /**String sta = "SELECT * FROM LibrayAccount where ID = '"+ txuser.getText()+ "'";
                    System.out.println(sta);
                    ArrayList<HashMap> list2 = db.queryRows(sta);
                    System.out.println(list2);
                    boolean delSuccess = db.executeQuery(sta);
                    System.out.println(delSuccess); */
                    for(HashMap l : list2){
                        if(l.get("status").equals("Member")){
                            status = "Member";
                            id = txuser.getText();
                            JOptionPane.showMessageDialog(rootPane, "Login successfully"); 
                            dbLogin.disconnect();
                            dispose();
                            createMenu(status, id);
                            break;
                            }
                            else{ // Admin main menu
                                status = "Admin";
                                id = txuser.getText();
                                JOptionPane.showMessageDialog(rootPane, "Login successfully"); 
                                dbLogin.disconnect();
                                dispose();
                                createMenu(status, id);
                            } 
                    }
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, checkInput(id,pass)); 
                }
    }
 
    public boolean logInSucces(){
        return login;
    }
    
    public String checkInput(String user, String password){
        if(user.length() == 0  ){
            return "Enter user";
        }
        else if(user.length() > 12   || user.length() < 4){
            return "user must be 4 - 12 characters";
        }
        else if (password.length() == 0){
            return "Enter password";
        }
        else if(password.length() > 12 || password.length() < 4  ){
            return "password must be 4 - 12 characters";
        }
        else{
            return checkPassword2(user, password);
        }
    }
    
    public String checkPassword2(String user , String password ){
        String output = "";
        dbLogin.dbConnect();
        ArrayList<HashMap> list = log.checkID(user);
        System.out.println(list);
        if(list.isEmpty()){
                output = "Wrong User , Please register ";
            }
        else{
            for(HashMap l : list){
                if(l.get("pass").equals(password)){
                        output = "Correct password";
                        this.login = true;
                        
                        break;
                    }
                    else{
                        output = "Wrong password";
                        break;
                    }   
                }
            }   
        return output;
    }
} 

