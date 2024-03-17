import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;

import org.opencv.core.Core;
import org.opencv.core.Mat;

public class Code13_03 {
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
	static String fileName;
	static Mat inImage, outImage;
	static int inH, inW, outH, outW;
	static JFrame frame;
	static Container contentPane;
	static MyPanel panel;
	static JMenuBar menuBar;
	
	static class MyPanel extends JPanel {
	}
	
	public static void main(String[] args) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("포토 에디터(Ver 0.1)");
		frame.setLayout(new CardLayout());	
		
		panel = new MyPanel();
		frame.add(panel, BorderLayout.CENTER);		
		contentPane = frame.getContentPane();	
					
		addMenu();		
		
		frame.setSize(400, 500); //초기 윈도창 크기
		frame.setResizable(false);
		frame.setVisible(true);        
	}
	
	static void addMenu() {
		Font f = new Font("맑은고딕", Font.PLAIN, 12);
		UIManager.put("Menu.font", f);
		UIManager.put("MenuItem.font", f);
		
		menuBar = new JMenuBar();	
		frame.setJMenuBar(menuBar);
		
		// 파일 메뉴
		JMenu fileMenu = new JMenu("파일");
		JMenuItem openItem = new JMenuItem("이미지 열기");
		JMenuItem saveItem = new JMenuItem("이미지 저장");
		JMenuItem closeItem = new JMenuItem("프로그램 종료");
				
		menuBar.add(fileMenu);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.addSeparator();
		fileMenu.add(closeItem);
		
		// 사진 효과(1) 메뉴
		JMenu Photo1Menu = new JMenu("사진 효과(1)");
		JMenuItem zoomItem = new JMenuItem("확대/축소");
		JMenuItem reverseUpItem = new JMenuItem("상하 반전");
		JMenuItem reverseLeftItem = new JMenuItem("좌우 반전");
		JMenuItem rotate90Item = new JMenuItem("90도 회전");
		JMenuItem rotate180Item = new JMenuItem("180도 회전");
		JMenuItem rotate270Item = new JMenuItem("270도 회전");
		JMenuItem rotateFreeItem = new JMenuItem("자유 회전");
		
		menuBar.add(Photo1Menu);
		Photo1Menu.add(zoomItem);
		Photo1Menu.add(reverseUpItem);
		Photo1Menu.add(reverseLeftItem);
		Photo1Menu.add(rotate90Item);
		Photo1Menu.add(rotate180Item);
		Photo1Menu.add(rotate270Item);
		Photo1Menu.add(rotateFreeItem);
		
		// 사진 효과(2) 메뉴
		JMenu Photo2Menu = new JMenu("사진 효과(2)");
		JMenuItem addItem = new JMenuItem("밝게/어둡게");
		JMenuItem grayscaleItem = new JMenuItem("회색 영상");
		JMenuItem blackWhiteItem = new JMenuItem("흑백 영상");
		JMenuItem blurItem = new JMenuItem("블러링");
		JMenuItem cannyItem = new JMenuItem("경계선 추출");
		JMenuItem equalItem = new JMenuItem("평활화");
		
		menuBar.add(Photo2Menu);
		Photo2Menu.add(addItem);
		Photo2Menu.add(grayscaleItem);
		Photo2Menu.add(blackWhiteItem);
		Photo2Menu.add(blurItem);
		Photo2Menu.add(cannyItem);
		Photo2Menu.add(equalItem);	
		
		// 메뉴 선택시 실행하는 메서드
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		saveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
			}			
		});
		
		closeItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}			
		});
		
		zoomItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			}			
		});
		
		reverseUpItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		reverseLeftItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		rotate90Item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		rotate180Item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		rotate270Item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		rotateFreeItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		addItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		grayscaleItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		blackWhiteItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		blurItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		cannyItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
		
		equalItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}			
		});
	}
}