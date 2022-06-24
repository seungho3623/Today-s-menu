package random_select;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class random_select 
{
	static String cate;
	static String changed;
	static String cate_name;
	
	public static void main_Frame() 
	{
		JFrame f = new JFrame("오늘 뭐 먹지?");
		f.setSize(500, 200);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		
		JButton korea = new JButton("한식");
		JButton china = new JButton("중식");
		JButton america = new JButton("양식");
		JButton japen = new JButton("일식");
		
		korea.setFont(korea.getFont().deriveFont(30.0f));
		china.setFont(china.getFont().deriveFont(30.0f));
		america.setFont(america.getFont().deriveFont(30.0f));
		japen.setFont(japen.getFont().deriveFont(30.0f));


		Container contentPane = f.getContentPane();
		
		contentPane.setLayout(new GridLayout(1,4));
		
		f.getContentPane().add(korea);
		f.getContentPane().add(china);
		f.getContentPane().add(america);
		f.getContentPane().add(japen);
		
		f.setVisible(true);
		
		korea.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("한식")) 
				{
					cate = "한식";
					System.out.println(cate);
					sub_Frame(cate);
					f.dispose();
				}
			}
		});
		
		china.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("중식")) 
				{
					cate = "중식";
					System.out.println(cate);
					sub_Frame(cate);
					f.dispose();
				}
			}
		});
		
		america.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("양식")) 
				{
					cate = "양식";
					System.out.println(cate);
					sub_Frame(cate);
					f.dispose();
				}
			}
		});
		
		japen.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("일식")) 
				{
					cate = "일식";
					System.out.println(cate);
					sub_Frame(cate);
					f.dispose();
				}
			}
		});
	}
	
	public static void sub_Frame(String cate) {
		JFrame f2 = new JFrame("오늘의 " + cate + " 추천 메뉴는 ??");
		JPanel p2 = new JPanel();
		
		f2.setSize(500, 200);
		f2.setLocationRelativeTo(null);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.getContentPane().setLayout(null);
		
		Container contentPane = f2.getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		
		JLabel label = new JLabel();
		label.setForeground(Color.black);
		label.setFont(label.getFont().deriveFont(30.0f));
		
		switch(cate) 
		{
			case "한식":
				label.setText("★ "+(select("한식") + " ★"));
				p2.add(label);
				break;
			case "중식":
				label.setText("★ "+(select("중식") + " ★"));
				p2.add(label);
				break;
			case "양식":
				label.setText("★ "+(select("양식") + " ★"));
				p2.add(label);
				break;
			case "일식":
				label.setText("★ "+(select("일식") + " ★"));
				p2.add(label);
				break;
		}

		f2.add(p2);
		f2.setVisible(true);
	}
	
	public static String select(String sel_menu) 
	{
		//System.out.println(sel_menu);
		
		Random random = new Random();
		
		String[] korea = new String[]{"된장찌개", "김치찌개", "국밥", "제육볶음", "생선구이"};
		String[] china = new String[]{"짜장면", "짬뽕", "볶음밥", "마라탕", "탕수육"};
		String[] america = new String[]{"토스트", "파스타", "필라프", "스테이크", "샐러드"};
		String[] japen = new String[]{"초밥", "라멘", "돈까스", "카레", "우동"};
		String data = new String();
		
		switch(sel_menu) 
		{
			case "한식":
				data = korea[random.nextInt(5)];
				break;
			case "중식":
				data = china[random.nextInt(5)];
				break;
			case "양식":
				data = america[random.nextInt(5)];
				break;
			case "일식":
				data = japen[random.nextInt(5)];
				break;
		}
		
		return data;
	}
	
	public static void main(String[] args) 
	{
		main_Frame();
	}
}
