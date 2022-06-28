import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.ArrayList;

class Student{
  private String name,usn,address;
  private int age;
  private float sgpa1,sgpa2,sgpa3;
  public Student(String n,String u, int a, String add,float sg1,float sg2,float sg3){

    name=n;
    usn=u;
    age=a;
    address=add;
    sgpa1=sg1;
    sgpa2=sg2;
    sgpa3=sg3;
    
  }
  public String toString()
  {
    return "Name : "+name+"\nUSN :"+usn+"\nAge : "+age+"\nAddress : "+address+"\nCGPA : "+(sgpa1+sgpa2+sgpa3)/3;
  }
}
class StudentDetails implements ActionListener{
  JFrame f = new JFrame("entry page");
  JFrame f2 = new JFrame("display page");
  JLabel name = new JLabel("Name");
  JTextField n = new JTextField();
  JLabel usn = new JLabel("usn");
  JTextField u = new JTextField();
  JLabel age = new JLabel("age");
  JTextField a = new JTextField();
  JLabel address = new JLabel("address");
  JTextField add = new JTextField();
  JLabel sgpa1 = new JLabel("SGPA 1");
  JTextField s1 = new JTextField();
  JLabel sgpa2 = new JLabel("SGPA2");
  JTextField s2 = new JTextField();
  JLabel sgpa3 = new JLabel("SGPA3");
  JTextField s3 = new JTextField();
  JLabel cgpa = new JLabel("CGPA");
  JTextField c = new JTextField();
  JButton compute = new JButton("compute");
  JButton done = new JButton("done");
  JButton submit = new JButton("submit");
  JButton back = new JButton("back");
  JTextArea display = new JTextArea(200,200);

  ArrayList<Student> record = new ArrayList<Student>();

  public StudentDetails(){
    
    f.add(name); f.add(n);
    f.add(usn); f.add(u);
    f.add(age);f.add(a);
    f.add(address); f.add(add);
    f.add(sgpa1); f.add(s1);
    f.add(sgpa2); f.add(s2);
    f.add(sgpa3); f.add(s3);
    f.add(cgpa); f.add(c);
    f.add(compute);
    f.add(done);
    f.add(submit);
    
    f2.add(display);
    f2.add(back);

    compute.addActionListener(this);
    done.addActionListener(this);
    submit.addActionListener(this);
    back.addActionListener(this);
    
    f2.setSize(400,500);
    f.setSize(400,500);
    f.setVisible(true);
    f.setLayout(new GridLayout(10,8));
    f2.setLayout(new GridLayout(2,8));
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==back){
      f2.setVisible(false);
      f.setVisible(true);
    }
    else{
      float v1 = Float.parseFloat(s1.getText());
      float v2 = Float.parseFloat(s2.getText());
      float v3 = Float.parseFloat(s3.getText());
      int ag = Integer.parseInt(a.getText());
      if(v1<1 || v1>10)
      {
        s1.setForeground(Color.RED);
        s1.setText("Enter valid sgpa between 1 and 10");
      }
      else if(v2<1 || v2>10)
      {
        s2.setForeground(Color.RED);
        s2.setText("Enter valid sgpa between 1 and 10");
      }
      else if(v3<1 || v3>10)
      {
        s3.setForeground(Color.RED);
        s3.setText("Enter valid sgpa between 1 and 10");
      }
      
      else if(ag < 18 || ag > 35 ){
        a.setForeground(Color.RED);
        a.setText("Enter valid age");
      }
      else{
        if(e.getSource()==compute)
        {
            float cg=(Float.parseFloat(s1.getText())+Float.parseFloat(s2.getText())+Float.parseFloat(s3.getText()))/3;
            c.setText(Float.toString(cg));
        }
  
        if(e.getSource()==done){
          record.add(new Student(n.getText(),u.getText(),Integer.parseInt(a.getText()),add.getText(),v1,v2,v3));
        }
  
        if(e.getSource()==submit){
          for(Student s : record){
            display.append(s.toString()+"\n\n");
            f.setVisible(false);
            f2.setVisible(true);
          }
        }
        
      }
      
    }
    
    
  }
}
class Main{
  public static void main(String args[]){
    StudentDetails sd = new StudentDetails();
    
  }
}