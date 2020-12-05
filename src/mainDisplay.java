import java.util.Calendar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

public class mainDisplay extends JPanel implements Runnable {
	private Thread thread;
	Calendar cal = Calendar.getInstance();
	String date[] = {"d1123", "d1124", "d1125", "d1126","d1127","d1128","d1129","d1130","d1201","d1202","d1203","d1204","d1205","d1206","d1207","d1208","d1209",
			"d1210","d1211","d1212","d1213","d1214","d1215","d1216","d1217","d1218","d1219","d1220"};
	
	public mainDisplay() {
		
		this.setBackground(Color.white);
		JButton btn1 = new JButton("Today �ڼ�������");
		JButton btn2=new JButton("�� �������� ���");
		JButton btn3=new JButton("�ٸ� ��¥����");
		
		btn1.setVisible(true);
		btn1.setBackground(SystemColor.menu);
	    btn1.setFont(new Font("���ʷҵ���", Font.PLAIN, 19));
	    btn1.setForeground(new Color(31, 110, 156));
	    btn1.setBounds(300, 300, 400, 200);
		add(btn1);
		
		btn2.setVisible(true);
		btn2.setBackground(SystemColor.menu);
	    btn2.setFont(new Font("���ʷҵ���", Font.PLAIN, 19));
	    btn2.setForeground(new Color(31, 110, 156));
	    btn2.setBounds(300, 500, 200, 200);
		add(btn2);
		
		btn3.setVisible(true);
		btn3.setBackground(SystemColor.menu);
	    btn3.setFont(new Font("���ʷҵ���", Font.PLAIN, 19));
	    btn3.setForeground(new Color(31, 110, 156));
	    btn3.setBounds(500, 500, 200, 200);
		add(btn3);
		
		JLabel lblNewLabel=new JLabel(" O u t f i t & W e a t h e r ");
		lblNewLabel.setForeground(new Color(31, 110, 156));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN ,51));
		lblNewLabel.setBounds(170,50,796,126);
		add(lblNewLabel);
		
		
		JButton btn = new JButton("�˻�");
		JTextField field = new JTextField();
		field.setBounds(300, 180, 317, 40);
		field.setColumns(10);
		
		add(field);
		field.setVisible(true);
		
		btn.setVisible(true);
		btn.setBackground(SystemColor.menu);
        btn.setFont(new Font("���ʷҵ���", Font.PLAIN, 15));
        btn.setForeground(Color.DARK_GRAY);
        btn.setBounds(645, 180, 65, 40);
		add(btn);
		
		btn1.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				today();
			}
		});
		
		btn2.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
		   		new Manage();
			}
		});
		
		btn3.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				new calendar();
			}
		});
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cday=field.getText();
			    int num=-1;
			    int i=0;
			    for(i=0;i<date.length;i++) {
			    	if(cday.equals(date[i])) {
			    		num=i;
			    		break;
			        }
			    }
			    if(num==-1) {
			    	JOptionPane.showMessageDialog(null, "��¥�� �ٽ� �Է��ϼ���!" );
			        }
			        else if(cday.equals(date[i])&&date[i]=="d1123") {
			        	new Window().d11_23();
			        }
			         else if(cday.equals(date[i])&&date[i]=="d1124") {
			        	 new Window().d11_24();
			         }
			  
			         else if(cday.equals(date[i])&&date[i]=="d1125") {
			        	 new Window().d11_25();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1126") {
			        	 new Window().d11_26();
			         } 
			         else if(cday.equals(date[i])&&date[i]=="d1127") {
			        	 new Window().d11_27();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1128") {
			        	 new Window().d11_28();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1129") {
			        	 new Window().d11_29();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1130") {
			        	 new Window().d11_30();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1201") {
			        	 new Window().d12_01();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1202") {
			        	 new Window().d12_02();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1203") {
			        	 new Window().d12_03();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1204") {
			        	 new Window().d12_04();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1205") {
			        	 new Window().d12_05();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1206") {
			        	 new Window().d12_06();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1207"){
			        	 new Window().d12_07();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1208") {
			        	 new Window().d12_08();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1209") {
			        	 new Window().d12_09();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1210") {
			        	 new Window().d12_10();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1211") {
			        	 new Window().d12_11();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1212") {
			        	 new Window().d12_12();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1213") {
			        	 new Window().d12_13();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1214") {
			        	 new Window().d12_14();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1215") {
			        	 new Window().d12_15();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1216") {
			        	 new Window().d12_16();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1217") {
			        	 new Window().d12_17();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1218") {
			        	 new Window().d12_18();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1219") {
			        	 new Window().d12_19();
			         }
			         else if(cday.equals(date[i])&&date[i]=="d1220") {
			        	 new Window().d12_20();
			         }			        			        			    
				}
		});
		
		if(thread == null){
			thread = new Thread(this);
			thread.start();
		}
	}
	
	public void run(){
		while(true){
			String now = "����ð�: " + cal.get(Calendar.YEAR)+"��"+
					(cal.get(Calendar.MONTH)+1)+"��"+
					cal.get(Calendar.DATE)+"��"+
					cal.get(Calendar.HOUR)+"��"+
					cal.get(Calendar.MINUTE)+"��"+
					cal.get(Calendar.SECOND)+"��";
		
				
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	void today() {
		String TestClass = "Window";  // ������ ��Ű�� ��α��� ����� �ϳ� ���� default ��ζ� ����
		String method ="d"+(cal.get(Calendar.MONTH)+1)+"_"+cal.get(Calendar.DATE);
			try {                       
				Class testClass = Class.forName(TestClass); 
				Object newObj = testClass.newInstance(); // Ŭ������ �޾ƿ� ������ ������� ��ü�� ���� 
				Method m = testClass.getMethod(method); // �޼ҵ� �ҷ����� 
				m.invoke(newObj); // �޼ҵ� ȣ��		 				
			} catch (Exception e) {
			}
	}
	
}
