import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;


class CalendarDataManager{ // 6*7배열에 나타낼 달력 값을 구하는 class
	static final int CAL_WIDTH = 7;
	final static int CAL_HEIGHT = 6;
	int calDates[][] = new int[CAL_HEIGHT][CAL_WIDTH];
	int calYear;
	int calMonth;
	int calDayOfMon;
	final int calLastDateOfMonth[]={31,28,31,30,31,30,31,31,30,31,30,31};
	int calLastDate;
	Calendar today = Calendar.getInstance();
	Calendar cal;
	
	public CalendarDataManager(){ 
		setToday(); 
	}
	public void setToday(){
		calYear = today.get(Calendar.YEAR); 
		calMonth = today.get(Calendar.MONTH);
		calDayOfMon = today.get(Calendar.DAY_OF_MONTH);
		makeCalData(today);
	}
	private void makeCalData(Calendar cal){
		// 1일의 위치와 마지막 날짜를 구함 
		int calStartingPos = (cal.get(Calendar.DAY_OF_WEEK)+7-(cal.get(Calendar.DAY_OF_MONTH))%7)%7;
		if(calMonth == 1) calLastDate = calLastDateOfMonth[calMonth] + leapCheck(calYear);
		else calLastDate = calLastDateOfMonth[calMonth];
		// 달력 배열 초기화
		for(int i = 0 ; i<CAL_HEIGHT ; i++){
			for(int j = 0 ; j<CAL_WIDTH ; j++){
				calDates[i][j] = 0;
			}
		}
		// 달력 배열에 값 채워넣기
		for(int i = 0, num = 1, k = 0 ; i<CAL_HEIGHT ; i++){
			if(i == 0) k = calStartingPos;
			else k = 0;
			for(int j = k ; j<CAL_WIDTH ; j++){
				if(num <= calLastDate) calDates[i][j]=num++;
			}
		}
	}
	private int leapCheck(int year){ // 윤년인지 확인하는 함수
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) return 1;
		else return 0;
	}
	public void moveMonth(int mon){ // 현재달로 부터 n달 전후를 받아 달력 배열을 만드는 함수(1년은 +12, -12달로 이동 가능)
		calMonth += mon;
		if(calMonth>11) while(calMonth>11){
			calYear++;
			calMonth -= 12;
		} else if (calMonth<0) while(calMonth<0){
			calYear--;
			calMonth += 12;
		}
		cal = new GregorianCalendar(calYear,calMonth,calDayOfMon);
		makeCalData(cal);
	}
}

public class calendar extends CalendarDataManager{ // CalendarDataManager의 GUI
	// 창 구성요소와 배치도
		JFrame mainFrame;
		JPanel calOpPanel;
		JButton todayBut;
		JLabel todayLab;
		JButton lMonBut;
		JLabel curMMYYYYLab;
		JButton nMonBut;
		
		ListenForCalOpButtons lForCalOpButtons = new ListenForCalOpButtons();
	
		JPanel calPanel;
		JButton weekDaysName[];
		JButton dateButs[][] = new JButton[6][7];
	//상수, 메세지
	final String WEEK_DAY_NAME[] = { "SUN", "MON", "TUE", "WED", "THR", "FRI", "SAT" };
	final String title = "달력";
	
	public calendar(){ //구성요소 순으로 정렬되어 있음. 각 판넬 사이에 빈줄로 구별
		
		mainFrame = new JFrame(title);
		//mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(500,500);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		
		calOpPanel = new JPanel();
			todayBut = new JButton("Today");
			todayBut.setToolTipText("Today");
			todayBut.addActionListener(lForCalOpButtons);
			todayLab = new JLabel(today.get(Calendar.MONTH)+1+"/"+today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR));
			
			lMonBut = new JButton("<");
			lMonBut.setToolTipText("Previous Month");
			lMonBut.addActionListener(lForCalOpButtons);
			curMMYYYYLab = new JLabel("<html><table width=100><tr><th><font size=5>"+((calMonth+1)<10?"&nbsp;":"")+(calMonth+1)+" / "+calYear+"</th></tr></table></html>");
			nMonBut = new JButton(">");
			nMonBut.setToolTipText("Next Month");
			nMonBut.addActionListener(lForCalOpButtons);
			
			calOpPanel.setLayout(new GridBagLayout());
			GridBagConstraints calOpGC = new GridBagConstraints();
			calOpGC.gridx = 1;
			calOpGC.gridy = 1;
			calOpGC.gridwidth = 2;
			calOpGC.gridheight = 1;
			calOpGC.weightx = 1;
			calOpGC.weighty = 1;
			calOpGC.insets = new Insets(5,5,0,0);
			calOpGC.anchor = GridBagConstraints.WEST;
			calOpGC.fill = GridBagConstraints.NONE;
			calOpPanel.add(todayBut,calOpGC);
			calOpGC.gridwidth = 3;
			calOpGC.gridx = 2;
			calOpGC.gridy = 1;
			calOpPanel.add(todayLab,calOpGC);
			calOpGC.anchor = GridBagConstraints.CENTER;
			calOpGC.gridwidth = 1;
			calOpGC.gridx = 1;
			calOpGC.gridy = 2;
			
			calOpGC.gridwidth = 1;
			calOpGC.gridx = 2;
			calOpGC.gridy = 2;
			calOpPanel.add(lMonBut,calOpGC);
			calOpGC.gridwidth = 2;
			calOpGC.gridx = 3;
			calOpGC.gridy = 2;
			calOpPanel.add(curMMYYYYLab,calOpGC);
			calOpGC.gridwidth = 1;
			calOpGC.gridx = 5;
			calOpGC.gridy = 2;
			calOpPanel.add(nMonBut,calOpGC);
			calOpGC.gridwidth = 1;
			calOpGC.gridx = 6;
			calOpGC.gridy = 2;
			
		
		calPanel=new JPanel();
			weekDaysName = new JButton[7];
			for(int i=0 ; i<CAL_WIDTH ; i++){
				weekDaysName[i]=new JButton(WEEK_DAY_NAME[i]);
				weekDaysName[i].setBorderPainted(false);
				weekDaysName[i].setContentAreaFilled(false);
				weekDaysName[i].setForeground(Color.WHITE);
				if(i == 0) weekDaysName[i].setBackground(new Color(200, 50, 50));
				else if (i == 6) weekDaysName[i].setBackground(new Color(50, 100, 200));
				else weekDaysName[i].setBackground(new Color(150, 150, 150));
				weekDaysName[i].setOpaque(true);
				weekDaysName[i].setFocusPainted(false);
				calPanel.add(weekDaysName[i]);
			}
			//여기서 만드거
			for(int i=0 ; i<CAL_HEIGHT ; i++){
				for(int j=0 ; j<CAL_WIDTH ; j++){
					dateButs[i][j]=new JButton();
					dateButs[i][j].setBorderPainted(false);
					dateButs[i][j].setContentAreaFilled(false);
					dateButs[i][j].setBackground(Color.WHITE);
					dateButs[i][j].setOpaque(true);
					calPanel.add(dateButs[i][j]);
				}
			}
			
			dateButs[3][1].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_23(); // 새 창을 새로 만들어낸다
                }

            });
			dateButs[3][2].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_24(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[3][3].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_25(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[3][4].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_26(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[3][5].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_27(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[3][6].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_28(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[4][0].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_29(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[4][1].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_30(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[0][2].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_01(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[0][3].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_02(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[0][4].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_03(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[0][5].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_04(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[0][6].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_05(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[1][0].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_06(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[1][1].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_07(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[1][2].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_08(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[1][3].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_09(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[1][4].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_10(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[1][5].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_11(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[1][6].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_12(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[2][0].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_13(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[2][1].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_14(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[2][2].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_15(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[2][3].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_16(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[2][4].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_17(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[2][5].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_18(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[2][6].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_19(); // 새 창을 새로 만들어낸다
                }
			});
			dateButs[3][0].addActionListener(new ActionListener() {
                // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_20(); // 새 창을 새로 만들어낸다
                }
			});
			
			
		
				
			calPanel.setLayout(new GridLayout(0,7,2,2));
			calPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
			showCal(); // 달력을 표시
						
//		//calOpPanel, calPanel을  frameSubPanelWest에 배치
		JPanel frameSubPanelWest = new JPanel();
		Dimension calOpPanelSize = calOpPanel.getPreferredSize();
		calOpPanelSize.height = 90;
		calOpPanel.setPreferredSize(calOpPanelSize);
		frameSubPanelWest.setLayout(new BorderLayout());
		frameSubPanelWest.add(calOpPanel,BorderLayout.NORTH);
		frameSubPanelWest.add(calPanel,BorderLayout.CENTER);		
		
//		//frame에 전부 배치
		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(frameSubPanelWest, BorderLayout.WEST);
//		
		mainFrame.setVisible(true);
//
		focusToday(); //현재 날짜에 focus를 줌 (mainFrame.setVisible(true) 이후에 배치해야함)
//		
		
		
	}	
	
	 
	private void focusToday(){
		if(today.get(Calendar.DAY_OF_WEEK) == 1)
			dateButs[today.get(Calendar.WEEK_OF_MONTH)][today.get(Calendar.DAY_OF_WEEK)-1].requestFocusInWindow();
		else
			dateButs[today.get(Calendar.WEEK_OF_MONTH)-1][today.get(Calendar.DAY_OF_WEEK)-1].requestFocusInWindow();
	}
	
	private void showCal(){
		for(int i=0;i<CAL_HEIGHT;i++){
			for(int j=0;j<CAL_WIDTH;j++){
				String fontColor="black";
				if(j==0) fontColor="red";
				else if(j==6) fontColor="blue";
				
				File f =new File("MemoData/"+calYear+((calMonth+1)<10?"0":"")+(calMonth+1)+(calDates[i][j]<10?"0":"")+calDates[i][j]+".txt");
				if(f.exists()){
					dateButs[i][j].setText("<html><b><font color="+fontColor+">"+calDates[i][j]+"</font></b></html>");
				}
				else dateButs[i][j].setText("<html><font color="+fontColor+">"+calDates[i][j]+"</font></html>");

				JLabel todayMark = new JLabel("<html><font color=green>*</html>");
				dateButs[i][j].removeAll();
				if(calMonth == today.get(Calendar.MONTH) &&
						calYear == today.get(Calendar.YEAR) &&
						calDates[i][j] == today.get(Calendar.DAY_OF_MONTH)){
					dateButs[i][j].add(todayMark);
					dateButs[i][j].setToolTipText("Today");
				}
				if(calDates[i][j] == 0) dateButs[i][j].setVisible(false);
				else dateButs[i][j].setVisible(true);
			}
		}
	}
	private class ListenForCalOpButtons implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == todayBut){
				setToday();
				focusToday();
			}
			else if(e.getSource() == lMonBut) moveMonth(-1);
			else if(e.getSource() == nMonBut) moveMonth(1);
			
			curMMYYYYLab.setText("<html><table width=100><tr><th><font size=5>"+((calMonth+1)<10?"&nbsp;":"")+(calMonth+1)+" / "+calYear+"</th></tr></table></html>");
			showCal();
		}
	}
	
}

