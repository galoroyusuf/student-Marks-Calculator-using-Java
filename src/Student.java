import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtSTname;
    private JTextField txtmarks1;
    private JTextField txtmarks2;
    private JTextField txtmarks3;
    private JTextField txtTotal;
    private JButton calButton;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
    calButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int n1, n2, n3,tot;
            double Avg;
            n1=Integer.parseInt(txtmarks1.getText());
            n2=Integer.parseInt(txtmarks2.getText());
            n3=Integer.parseInt(txtmarks3.getText());

            tot=n1+n2+n3;

            txtTotal.setText(String.valueOf(tot));

            Avg=tot/3;
            txtAvg.setText(String.valueOf(Avg));

            if (Avg>50){
                txtGrade.setText("PASS");
            }else {
                txtGrade.setText("FAIL");
            }


        }
    });
}
}
