import java.awt.*;
import java.awt.event.*;
public class Main  {

    
    public static int partyA=0;
    public static int partyB=0;
    public static void main(String[] args) {
        Frame frame=new Frame("Voting Machine");
        final TextField tf=new TextField();
        Button button=new Button("Party A");
        Button button2=new Button("Party B");
        Button button3=new Button("Clear");
        Button button4=new Button("View Result");
        final TextField tf1=new TextField();
        final TextField tf2=new TextField();
        final TextField tf3=new TextField();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==button){
                    tf1.setText(null);
                    tf.setText("You have given vote to party A");
                    partyA++;
                    System.out.println("No of votes of Party A");
                    System.out.println(partyA);
                    frame.add(tf);
                    
                    
                }
                if(e.getSource()==button2){
                    tf.setText(null);
                    tf1.setText("You have given vote to Party B");
                    partyB++;
                    System.out.println("No of votes of Party B");
                    System.out.println(partyB);
                    frame.add(tf1);
                   //tf.remove(null);
                }
                if(e.getSource()==button3){
                    tf.setText(null);
                    tf1.setText(null);
                    
                }
                if (e.getSource()==button4){
                    if(partyA>partyB){
                        tf3.setText("\t\tParty A is the winner");
                        frame.add(tf3);

                    }
                    if(partyB>partyA){
                        tf3.setText("\t\tParty B is the winner");
                        frame.add(tf3);
                    }
                    if(partyA==partyB){
                        tf3.setText("\t\tResult is tie");
                        frame.add(tf3);
                        
                    }
                }
            }
        };
        button.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button.setBounds(325, 100, 60, 30);
        button2.setBounds(325, 150, 60, 30);
        button3.setBounds(325, 200, 60, 30);
        button4.setBounds(325, 250, 65, 30);
        tf.setBounds(275,350,170,50);
        tf1.setBounds(275, 450 ,170, 50);
        tf3.setBounds(225,550,270,50);
        frame.add(button);
        frame.add(button2);      
        frame.add(button3);      
        frame.add(button4);      
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);        
    }
   
    
}
