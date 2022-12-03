package bh7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrm extends JFrame {
    private JPanel pnlMe;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JButton btnGiai;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblC;
    private JLabel lblNghiem;

    public MyFrm() {
        setTitle("Giải phương trình bậc 2");
        setContentPane(pnlMe);
        setSize(400, 200);
        setVisible(true);
        btnGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var a = Double.parseDouble(txtA.getText());
                var b = Double.parseDouble(txtB.getText());
                var c = Double.parseDouble(txtC.getText());
                Nghiem n = new PTB2(a, b, c).giai();
                if (n == null) lblNghiem.setText("Vô nghiệm");
                else
                    lblNghiem.setText("Nghiệm: " + n.toString());
            }
        });
    }

    public static void main(String[] args) {
        MyFrm f = new MyFrm();
    }
}
