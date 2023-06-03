package holy.swing;



import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import holy.dao.TicketDAO;
import holy.vo.HmemberVO;
import holy.vo.TicketListVO;
import holy.vo.TicketingVO;
import java.awt.Color;
import java.awt.SystemColor;

public class TicketCheck {


   HmemberVO v2 = new HmemberVO();
   public JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               TicketCheck window = new TicketCheck();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public TicketCheck() {
      initialize();
   }
   public TicketCheck(HmemberVO hv) {
	   	this.v2 = hv;
	      initialize();
	   }
   private void initialize() {
      TicketDAO td = new TicketDAO();
      List<TicketListVO> list = td.getTicket(v2.getMemId());

     

      frame = new JFrame();
      frame.setTitle("HOLYMOLYCINEMA");
      frame.getContentPane().setBackground(SystemColor.scrollbar);
      frame.getContentPane().setFont(new Font("굴림", Font.PLAIN, 20));
      frame.setBounds(100, 100, 902, 573);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      frame.setLocationRelativeTo(null);
      JLabel lblNewLabel = new JLabel("예매 내역");
      lblNewLabel.setForeground(Color.DARK_GRAY);
      lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(12, 31, 862, 62);
      frame.getContentPane().add(lblNewLabel);

      JPanel panel = new JPanel();
      panel.setBounds(100, 200, 157, 156);
      frame.getContentPane().add(panel);
      String currentDirectory = System.getProperty("user.dir");
      
 
      
      String testpath = currentDirectory + "\\img\\" + list.get(0).getFilmtitle()+ ".png";
     panel.setVisible(true);
      ImagePanel2 imagePanel = new ImagePanel2(testpath);
      panel.add(imagePanel);

      JLabel lblNewLabel_1 = new JLabel("예매한 영화");
      lblNewLabel_1.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));
      lblNewLabel_1.setForeground(Color.DARK_GRAY);
      lblNewLabel_1.setBounds(340, 130, 80, 30);
      frame.getContentPane().add(lblNewLabel_1);

      JLabel lblNewLabel_1_1 = new JLabel("상영 일자");
      lblNewLabel_1_1.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));
      lblNewLabel_1_1.setBounds(340, 200, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_1);

      JLabel lblNewLabel_1_2 = new JLabel("상영관 번호");
      lblNewLabel_1_2.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));
      lblNewLabel_1_2.setBounds(340, 270, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_2);

      JLabel lblNewLabel_1_3 = new JLabel("상영 시간");
      lblNewLabel_1_3.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));
      lblNewLabel_1_3.setBounds(340, 350, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_3);

      JLabel lblNewLabel_1_4 = new JLabel("결제 가격");
      lblNewLabel_1_4.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));
      lblNewLabel_1_4.setBounds(340, 420, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_4);

      JLabel lblNewLabel_1_5 = new JLabel("좌석");
      lblNewLabel_1_5.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));
      lblNewLabel_1_5.setBounds(620, 130, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_5);

      JLabel lblNewLabel_1_5_1 = new JLabel("예매한 날짜");
      lblNewLabel_1_5_1.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));
      lblNewLabel_1_5_1.setBounds(620, 200, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_5_1);

      JLabel lblNewLabel_1_5_2 = new JLabel("러닝 타임");
      lblNewLabel_1_5_2.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 16));
      lblNewLabel_1_5_2.setBounds(620, 270, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_5_2);

      JLabel lblNewLabel_1_5_3 = new JLabel("수량");
      lblNewLabel_1_5_3.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 15));
      lblNewLabel_1_5_3.setBounds(620, 350, 80, 30);
      frame.getContentPane().add(lblNewLabel_1_5_3);

      JLabel filmName = new JLabel("New label");
      filmName.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 16));
      filmName.setBounds(450, 130, 146, 30);
      frame.getContentPane().add(filmName);

      JLabel scheDate = new JLabel("New label");
      scheDate.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 16));
      scheDate.setBounds(450, 199, 146, 30);
      frame.getContentPane().add(scheDate);

      JLabel theaNum = new JLabel("New label");
      theaNum.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 16));
      theaNum.setBounds(450, 270, 146, 30);
      frame.getContentPane().add(theaNum);

      JLabel scheTime = new JLabel("New label");
      scheTime.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 16));
      scheTime.setBounds(450, 350, 146, 30);
      frame.getContentPane().add(scheTime);

      JLabel tickPrice = new JLabel("New label");
      tickPrice.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 16));
      tickPrice.setBounds(450, 420, 146, 30);
      frame.getContentPane().add(tickPrice);

      JLabel seatno = new JLabel("New label");
      seatno.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 16));
      seatno.setBounds(715, 130, 146, 30);
      frame.getContentPane().add(seatno);

      JLabel tickDate = new JLabel("New label");
      tickDate.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 16));
      tickDate.setBounds(715, 200, 146, 30);
      frame.getContentPane().add(tickDate);

      JLabel runTime = new JLabel("New label");
      runTime.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 16));
      runTime.setBounds(715, 270, 146, 30);
      frame.getContentPane().add(runTime);

      JLabel tickCnt = new JLabel("New label");
      tickCnt.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 16));
      tickCnt.setBounds(715, 350, 146, 30);
      frame.getContentPane().add(tickCnt);

      JLabel lblNewLabel_2 = new JLabel("결제 방법");
      lblNewLabel_2.setBounds(340, 490, 80, 30);
      lblNewLabel_2.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 16));
      frame.getContentPane().add(lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel("New label");
      lblNewLabel_3.setFont(new Font("티머니 둥근바람 Regular", Font.PLAIN, 17));
      lblNewLabel_3.setBounds(450, 490, 127, 34);
      frame.getContentPane().add(lblNewLabel_3);
     
      
      
      // 출력
      String b = "";
      // 티켓 수량
      b += list.size();
      tickCnt.setText(b);

      String a = "";
      // 티켓 가격
      a += list.get(0).getTickprice();
      tickPrice.setText(a);
      tickDate.setText(list.get(0).getTickdate().substring(0, 10));
      // 예매한 날짜
      // seatno.setText(list.get(0).getSeatnum()); //좌석 번호 //
      String seat = "";
      for (int i = 0; i < list.size(); i++) {
         seat += list.get(i).getSeatnum() + " ";
      }
      seatno.setText(seat);
      scheTime.setText(list.get(0).getSchetime()); // 상영 시간 //
      theaNum.setText(list.get(0).getTheanum()); // 상영관 번호 //
      scheDate.setText(list.get(0).getSchedate().substring(0, 10)); // 상영 날짜 //
      filmName.setText(list.get(0).getFilmtitle()); // 영화 제목
      runTime.setText(list.get(0).getFilmruntime());
      lblNewLabel_3.setText(list.get(0).getPaymethod()); // 결제수단
      
   }
}