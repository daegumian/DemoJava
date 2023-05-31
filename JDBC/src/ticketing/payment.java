package ticketing;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class payment {
	private static JTextField textField;
    public static void main(String[] args) {
        // JFrame 및 JPanel 생성
        JFrame frame = new JFrame("ComboBox Example");
        JPanel panel = new JPanel();

        // JComboBox 인스턴스 생성
        JComboBox<String> comboBox = new JComboBox<>();

        // 콤보 박스에 항목 추가
        comboBox.addItem("신용카드");
        comboBox.addItem("현금");
        comboBox.addItem("홀리몰리시네마 예매권");
        SpringLayout sl_panel = new SpringLayout();
        sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 450, SpringLayout.NORTH, panel);
        sl_panel.putConstraint(SpringLayout.WEST, comboBox, 160, SpringLayout.WEST, panel);
        sl_panel.putConstraint(SpringLayout.SOUTH, comboBox, -66, SpringLayout.SOUTH, panel);
        sl_panel.putConstraint(SpringLayout.EAST, comboBox, -144, SpringLayout.EAST, panel);
        panel.setLayout(sl_panel);

        // 패널에 콤보 박스 추가
        panel.add(comboBox);

        // 프레임에 패널 추가
        frame.getContentPane().add(panel);
        
        textField = new JTextField();
        sl_panel.putConstraint(SpringLayout.NORTH, textField, 450, SpringLayout.NORTH, panel);
        sl_panel.putConstraint(SpringLayout.WEST, textField, 50, SpringLayout.WEST, panel);
        sl_panel.putConstraint(SpringLayout.SOUTH, textField, -66, SpringLayout.SOUTH, panel);
        sl_panel.putConstraint(SpringLayout.EAST, textField, -434, SpringLayout.EAST, panel);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setText("결제방법");
        panel.add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton = new JButton("결제하기");
        sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 450, SpringLayout.NORTH, panel);
        sl_panel.putConstraint(SpringLayout.WEST, btnNewButton, 450, SpringLayout.WEST, panel);
        sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, -66, SpringLayout.SOUTH, panel);
        sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, -34, SpringLayout.EAST, panel);
        panel.add(btnNewButton);

        // 프레임 설정 및 표시
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}