package cinema;

import java.util.List;


public class MainClass_min {
   public static void main(String[] args) {
      TicketDAO tk = new TicketDAO();
      String id = "werty1111";
      List<TicketListVO> list = tk.getTicket(id);  
      for (TicketListVO t : list) {
         System.out.println(t.getFvo().getFiltitle());
         System.out.println(t.getFvo().getFilmruntime());
         System.out.println(t.getSvo().getSchedate());
         System.out.println(t.getSvo().getSchetime());
         System.out.println(t.getTickvo().getTickcount());
         System.out.println(t.getTickvo().getTickprice());
      }
      
      
   }
}