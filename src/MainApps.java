import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApps {
    private JPanel Menu;
    private JButton Supplier;
    private JButton Barang;
    private JButton Order;
    private JPanel SubMenu;
    private JPanel home;
    private JButton SubHome;

    public MainApps() {
        Supplier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Anugrah");
        frame.setContentPane(new MainApps().Menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
