import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.io.*;

public class myjaava{

  private JFrame MainFrame;
  private JButton bAdd;
  private JButton bSub;
  private JButton bMenu;
  private JPanel bMenuPanel;
  private String nameField;
  private JTextField textField;
  
  
  public void setNameField(String nameField){
  
    this.nameField = nameField;  
  }
  
  public String getNameField(){    
    return nameField;    
  }
  
  public JButton getBMenu(){
    return bMenu;
  }
  
  
  public myjaava(){
    UserDisplay();
  }


  public static void main(String[] args){
     myjaava app = new myjaava();
     app.show();
  }
  
  public void UserDisplay(){
     MainFrame = new JFrame("Home-Automation Application");
     MainFrame.setSize(300,400);
     MainFrame.setLayout(new GridLayout(1,50));
     
     //create WindowOnClose Listener
     MainFrame.addWindowListener(new WindowAdapter(){
	  public void WindowClose(WindowEvent windowEvent){
	    System.exit(0);
	  }
     });
     
     textField = new JTextField(20);
     textField.setLayout(new FlowLayout());
     
     //create  button and its container using panel
     bMenuPanel = new JPanel();
     bMenu = new JButton("Print");
     
     bMenuPanel.setLayout(new BoxLayout(bMenuPanel, BoxLayout.LINE_AXIS));
     bMenuPanel.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
     bMenuPanel.add(Box.createHorizontalGlue());     
     bMenuPanel.add(bMenu);
     
     Container contentPane = getContentPane();
     contentPane.add(bMenuPanel.BorderLayout.PAGE_END);
     
  }
  
  
  
  
  public void show(){
     MainFrame.add(textField);
     MainFrame.add(bMenu);
     MainFrame.setVisible(true);
  }

  
}


/*
//Lay out the buttons from left to right.
JPanel buttonPane = new JPanel();
buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
buttonPane.add(Box.createHorizontalGlue());
buttonPane.add(cancelButton);
buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
buttonPane.add(setButton);

//Put everything together, using the content pane's BorderLayout.
Container contentPane = getContentPane();
contentPane.add(listPane, BorderLayout.CENTER);
contentPane.add(buttonPane, BorderLayout.PAGE_END);

*/