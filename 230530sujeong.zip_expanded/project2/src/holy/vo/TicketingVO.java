package holy.vo;

public class TicketingVO {
	/*
	 * TORDERNO   NOT NULL VARCHAR2(99) 
	HID                 VARCHAR2(99) 
	PAYNUM              NUMBER(15)   
	TORDERSEAT          VARCHAR2(99) 
	 */
	
	private String tickNo;
	private String tickSeat;
	private String tickDate;
	private int tickCount;
	private int tickPrice;
	private String payMethod;
	private String scheNum;
	private String memId;
	
	public TicketingVO() {
		// TODO Auto-generated constructor stub
	}

	public TicketingVO(String tickNo, String tickSeat, String tickDate, int tickCount, int tickPrice, String payMethod,
			String scheNum, String memId) {
		super();
		this.tickNo = tickNo;
		this.tickSeat = tickSeat;
		this.tickDate = tickDate;
		this.tickCount = tickCount;
		this.tickPrice = tickPrice;
		this.payMethod = payMethod;
		this.scheNum = scheNum;
		this.memId = memId;
	}

	public String getTickNo() {
		return tickNo;
	}

	public void setTickNo(String tickNo) {
		this.tickNo = tickNo;
	}

	public String getTickSeat() {
		return tickSeat;
	}

	public void setTickSeat(String tickSeat) {
		this.tickSeat = tickSeat;
	}

	public String getTickDate() {
		return tickDate;
	}

	public void setTickDate(String tickDate) {
		this.tickDate = tickDate;
	}

	public int getTickCount() {
		return tickCount;
	}

	public void setTickCount(int tickCount) {
		this.tickCount = tickCount;
	}

	public int getTickPrice() {
		return tickPrice;
	}

	public void setTickPrice(int tickPrice) {
		this.tickPrice = tickPrice;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getScheNum() {
		return scheNum;
	}

	public void setScheNum(String scheNum) {
		this.scheNum = scheNum;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	
	
}
