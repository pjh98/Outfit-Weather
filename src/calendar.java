import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;


class CalendarDataManager{ // 6*7�迭�� ��Ÿ�� �޷� ���� ���ϴ� class
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
		// 1���� ��ġ�� ������ ��¥�� ���� 
		int calStartingPos = (cal.get(Calendar.DAY_OF_WEEK)+7-(cal.get(Calendar.DAY_OF_MONTH))%7)%7;
		if(calMonth == 1) calLastDate = calLastDateOfMonth[calMonth] + leapCheck(calYear);
		else calLastDate = calLastDateOfMonth[calMonth];
		// �޷� �迭 �ʱ�ȭ
		for(int i = 0 ; i<CAL_HEIGHT ; i++){
			for(int j = 0 ; j<CAL_WIDTH ; j++){
				calDates[i][j] = 0;
			}
		}
		// �޷� �迭�� �� ä���ֱ�
		for(int i = 0, num = 1, k = 0 ; i<CAL_HEIGHT ; i++){
			if(i == 0) k = calStartingPos;
			else k = 0;
			for(int j = k ; j<CAL_WIDTH ; j++){
				if(num <= calLastDate) calDates[i][j]=num++;
			}
		}
	}
	private int leapCheck(int year){ // �������� Ȯ���ϴ� �Լ�
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) return 1;
		else return 0;
	}
	public void moveMonth(int mon){ // ����޷� ���� n�� ���ĸ� �޾� �޷� �迭�� ����� �Լ�(1���� +12, -12�޷� �̵� ����)
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

public class calendar extends CalendarDataManager{ // CalendarDataManager�� GUI
	// â ������ҿ� ��ġ��
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
	//���, �޼���
	final String WEEK_DAY_NAME[] = { "SUN", "MON", "TUE", "WED", "THR", "FRI", "SAT" };
	final String title = "�޷�";
	
	public calendar(){ //������� ������ ���ĵǾ� ����. �� �ǳ� ���̿� ���ٷ� ����
		
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
			//���⼭ �����
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
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_23(); // �� â�� ���� ������
                }

            });
			dateButs[3][2].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_24(); // �� â�� ���� ������
                }
			});
			dateButs[3][3].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_25(); // �� â�� ���� ������
                }
			});
			dateButs[3][4].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_26(); // �� â�� ���� ������
                }
			});
			dateButs[3][5].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_27(); // �� â�� ���� ������
                }
			});
			dateButs[3][6].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_28(); // �� â�� ���� ������
                }
			});
			dateButs[4][0].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_29(); // �� â�� ���� ������
                }
			});
			dateButs[4][1].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d11_30(); // �� â�� ���� ������
                }
			});
			dateButs[0][2].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_01(); // �� â�� ���� ������
                }
			});
			dateButs[0][3].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_02(); // �� â�� ���� ������
                }
			});
			dateButs[0][4].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_03(); // �� â�� ���� ������
                }
			});
			dateButs[0][5].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_04(); // �� â�� ���� ������
                }
			});
			dateButs[0][6].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_05(); // �� â�� ���� ������
                }
			});
			dateButs[1][0].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_06(); // �� â�� ���� ������
                }
			});
			dateButs[1][1].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_07(); // �� â�� ���� ������
                }
			});
			dateButs[1][2].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_08(); // �� â�� ���� ������
                }
			});
			dateButs[1][3].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_09(); // �� â�� ���� ������
                }
			});
			dateButs[1][4].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_10(); // �� â�� ���� ������
                }
			});
			dateButs[1][5].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_11(); // �� â�� ���� ������
                }
			});
			dateButs[1][6].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_12(); // �� â�� ���� ������
                }
			});
			dateButs[2][0].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_13(); // �� â�� ���� ������
                }
			});
			dateButs[2][1].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_14(); // �� â�� ���� ������
                }
			});
			dateButs[2][2].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_15(); // �� â�� ���� ������
                }
			});
			dateButs[2][3].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_16(); // �� â�� ���� ������
                }
			});
			dateButs[2][4].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_17(); // �� â�� ���� ������
                }
			});
			dateButs[2][5].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_18(); // �� â�� ���� ������
                }
			});
			dateButs[2][6].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_19(); // �� â�� ���� ������
                }
			});
			dateButs[3][0].addActionListener(new ActionListener() {
                // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Window().d12_20(); // �� â�� ���� ������
                }
			});
			
			
		
				
			calPanel.setLayout(new GridLayout(0,7,2,2));
			calPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
			showCal(); // �޷��� ǥ��
						
//		//calOpPanel, calPanel��  frameSubPanelWest�� ��ġ
		JPanel frameSubPanelWest = new JPanel();
		Dimension calOpPanelSize = calOpPanel.getPreferredSize();
		calOpPanelSize.height = 90;
		calOpPanel.setPreferredSize(calOpPanelSize);
		frameSubPanelWest.setLayout(new BorderLayout());
		frameSubPanelWest.add(calOpPanel,BorderLayout.NORTH);
		frameSubPanelWest.add(calPanel,BorderLayout.CENTER);		
		
//		//frame�� ���� ��ġ
		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(frameSubPanelWest, BorderLayout.WEST);
//		
		mainFrame.setVisible(true);
//
		focusToday(); //���� ��¥�� focus�� �� (mainFrame.setVisible(true) ���Ŀ� ��ġ�ؾ���)
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

