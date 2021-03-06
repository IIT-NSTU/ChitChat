package ui;
import User.userstructure; 

import filedata.accountdata;
//import filedata.objectread; 
//import  server.serversocket;
import clint.clintsocket;
import filedata.objectread;
import javax.swing.*;
import java.awt.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

public class loginwindow extends JFrame {

    private JPanel jpanel1, jpanel2;
    private JLabel usernamelabel, passwordlabel, loginlabel, newherelabel, backgroundlabel ,welcomelabel1;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton submitButton, createButton;

    public loginwindow() {

        framekeyloginwindow();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 80, 1250, 850);//upor nich weight hight
        setResizable(true);
        Image iconlogo = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/ui/iconlogo.png"));
        Image icon = iconlogo.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        setIconImage(icon);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
//        setUndecorated(true);

    }

    public void framekeyloginwindow() {

        this.getContentPane().setBackground(Color.BLACK);
        jpanel1 = new JPanel();
        jpanel2 = new JPanel();

        Font fieldfont = new Font("Arial", Font.PLAIN, 20);
        Font fontbutton = new Font(Font.SERIF, Font.BOLD, 15);
        Font fieldfont2 = new Font(Font.SERIF, Font.BOLD, 20);
        Image backgroundlogo = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/ui/logo.png"));

        //elements
        usernameField = new JTextField();
        usernameField.setFont(fieldfont);
        usernameField.setBackground(Color.white);
        usernameField.setForeground(Color.black);
        //usernameField.setColumns(15);
        usernameField.setBorder(BorderFactory.createCompoundBorder(
                new CustomeBorder(), new EmptyBorder(new Insets(10, 10, 10, 10)
                )));

        passwordField = new JPasswordField();
        passwordField.setFont(fieldfont);
        passwordField.setBackground(Color.white);
        passwordField.setForeground(Color.black);
        //passwordField.setColumns(15);
        passwordField.setBorder(BorderFactory.createCompoundBorder(
                new CustomeBorder(), new EmptyBorder(new Insets(10, 10, 10, 10)
                )));

        submitButton = new JButton("Log In");
        submitButton.setFont(fontbutton);
        submitButton.setBorder(BorderFactory.createCompoundBorder(
                new CustomeBorder(), new EmptyBorder(new Insets(10, 10, 10, 10)
                )));

        createButton = new JButton("Sign up");
        createButton.setFont(fontbutton);
        createButton.setForeground(Color.BLACK);
        //createButton.setBackground(new Color(191, 230, 255));
        createButton.setBorder(BorderFactory.createCompoundBorder(
                new CustomeBorder(), new EmptyBorder(new Insets(10, 10, 10, 10)
                )));

        //layout for total jframe
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridbagconstrain2 = new GridBagConstraints();
        gridbagconstrain2.weightx=1;
        gridbagconstrain2.weighty=1;
        
         gridbagconstrain2.ipadx=1000;
         gridbagconstrain2.ipady=1000;
          

        gridbagconstrain2.gridx = 0;
        gridbagconstrain2.gridwidth = 1;
        this.add(jpanel2, gridbagconstrain2);

        gridbagconstrain2.gridx = 1;
        gridbagconstrain2.gridwidth = 1;
       // gridbagconstrain2.insets = new Insets(0,0, 0, 0);
        this.add(jpanel1, gridbagconstrain2);

        //<<<<<<<<<<<<<<<<<<<<<<<<<layout of jpanel login sight
        jpanel1.setLayout(new GridBagLayout());
        GridBagConstraints gridbagconstrain = new GridBagConstraints();
 
        jpanel1.setBackground(new Color(28, 73, 102));//new Color(int,int,int) -rgb new mix color hoi
        
        
        gridbagconstrain.gridy = 0;
        gridbagconstrain.gridx = 2;
        gridbagconstrain.gridwidth = 2;
        gridbagconstrain.insets = new Insets(140, 0, 40, 0);
        loginlabel = new JLabel("Log in");
        loginlabel.setForeground(Color.white);
        loginlabel.setFont(new Font(Font.SERIF, Font.BOLD, 40));
        jpanel1.add(loginlabel, gridbagconstrain);
 
        gridbagconstrain.gridy = 1;
        gridbagconstrain.gridx = 1;
        gridbagconstrain.gridwidth = 1;
        gridbagconstrain.fill = GridBagConstraints.BOTH;
        gridbagconstrain.insets = new Insets(50, 50, 20, 0);
         
        usernamelabel = new JLabel();
        usernamelabel.setFont(fieldfont2);
        usernamelabel.setText("Username");
        usernamelabel.setForeground(Color.WHITE);
 
        jpanel1.add(usernamelabel, gridbagconstrain);

        gridbagconstrain.gridy = 1;
        gridbagconstrain.gridwidth = 3;
        gridbagconstrain.gridx = 2;
        gridbagconstrain.fill = GridBagConstraints.BOTH;
        gridbagconstrain.insets = new Insets(50, 15, 20, 50);
        gridbagconstrain.ipadx=10;
        gridbagconstrain.ipady=10;
        
        jpanel1.add(usernameField, gridbagconstrain);

        gridbagconstrain.gridy = 2;
        gridbagconstrain.gridwidth = 1;
        gridbagconstrain.gridx = 1;
        gridbagconstrain.fill = GridBagConstraints.BOTH;
        gridbagconstrain.insets = new Insets(10, 50, 20, 05);
        passwordlabel = new JLabel();
        passwordlabel.setFont(fieldfont2);
        passwordlabel.setText("Password");
        passwordlabel.setForeground(Color.WHITE);
 
        jpanel1.add(passwordlabel, gridbagconstrain);

        gridbagconstrain.gridy = 2;
        gridbagconstrain.gridx = 2;
        gridbagconstrain.gridwidth = 3;
        gridbagconstrain.fill = GridBagConstraints.BOTH;
        gridbagconstrain.insets = new Insets(10, 15, 20, 50);
        jpanel1.add(passwordField, gridbagconstrain);

        gridbagconstrain.gridy = 3;
        gridbagconstrain.gridx = 2;
        gridbagconstrain.gridwidth = 1;
        gridbagconstrain.insets = new Insets(20, 40, 250, 40);//uldr upur theke,left theke,nich theke,right theke.
        gridbagconstrain.ipadx = 60;
        jpanel1.add(submitButton, gridbagconstrain);

        gridbagconstrain.gridy = 3;
        gridbagconstrain.gridx = 3;
        gridbagconstrain.gridwidth = 1;
        gridbagconstrain.insets = new Insets(20, 0, 250, 0);//uldr upur theke,left theke,nich theke,right theke
        newherelabel = new JLabel();
        newherelabel.setText("New here ?");
        newherelabel.setForeground(Color.WHITE);
        gridbagconstrain.ipadx = 5;
        jpanel1.add(newherelabel, gridbagconstrain);

        gridbagconstrain.gridy = 3;
        gridbagconstrain.gridx = 4;
        gridbagconstrain.gridwidth = 1;
        gridbagconstrain.ipadx = 0;
        gridbagconstrain.ipady = 5;
        gridbagconstrain.insets = new Insets(20, 0, 250, 50);
        jpanel1.add(createButton, gridbagconstrain);

        //label2 logo layout 
        jpanel2.setLayout(new GridBagLayout());
        GridBagConstraints gridbagconstrain3 = new GridBagConstraints();
        
        jpanel2.setBackground(new Color(237, 234, 222));
        
        gridbagconstrain3.gridy = 0;
        gridbagconstrain3.gridwidth = 3;
        backgroundlabel = new JLabel();
        Image logoscaled = backgroundlogo.getScaledInstance(350, 350, Image.SCALE_SMOOTH); //image resizer jonno
        ImageIcon logo = new ImageIcon(logoscaled);
        backgroundlabel.setIcon(logo);
        gridbagconstrain3.insets = new Insets(0, 0,40, 0);
        jpanel2.add(backgroundlabel, gridbagconstrain3);

        gridbagconstrain3.gridy = 1;
        gridbagconstrain3.gridwidth = 3;
        welcomelabel1 = new JLabel(" Welcome Back!");
        welcomelabel1.setForeground(new Color(28, 73, 102));
        welcomelabel1.setFont(new Font(Font.SERIF, Font.BOLD, 60));
        gridbagconstrain3.insets = new Insets(0, 0,20, 0);
        jpanel2.add(welcomelabel1, gridbagconstrain3);
 

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                createaccountWindow crw = new createaccountWindow();
                setVisible(false);
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//*****************************************************************************************************************************

                accountdata aaccountdata = new accountdata();
                boolean exist;

                exist = aaccountdata.checkCredentials(usernameField.getText(), String.valueOf(passwordField.getPassword()));

                if (exist != false) {
                    File filepath = new File(usernameField.getText() + ".txt");
                    if(filepath.exists()){
                    objectread user = new objectread(filepath.getAbsolutePath());
                    personalchatroomui userchatroom = new personalchatroomui(user.username + " " + user.nickname, filepath);
                    //Sharefilechatroomui userchatroom=new Sharefilechatroomui( user.dp,user.username+" "+user.nickname,filepath );
                    //clintsocket clint=new clintsocket(user.dp,user.username+" "+user.nickname,filepath); 
                    setVisible(false);
                    //clintsocket clint=new clintsocket(usernameField.getText(),filepath); 
                    //serversocket serve=new serversocket(null);
                    }else{
                        JOptionPane.showMessageDialog(jpanel1, "This account doesnot exits!Please create new account with no space in username"); 
                    }
                    

                } else {
                    JOptionPane.showMessageDialog(jpanel1, "Incorrect username or password.");
                }
//************************************************************************************************************************************************************
            }
        });
    }

    //design of the borders
    private static class CustomeBorder extends AbstractBorder {

        public void paintBorder(Component c, Graphics g, int x, int y,
                int width, int height) {
            // TODO Auto-generated method stubs
            super.paintBorder(c, g, x, y, width, height);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(12));
            g2d.setColor(new Color(28, 73, 102));
            g2d.drawRoundRect(x, y, width - 1, height - 1, 25, 25);
        }
    }

}
