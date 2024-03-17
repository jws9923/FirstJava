import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Code12_19 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("메시지 출력");
		frame.setLayout(null);			
		frame.setSize(300, 300);
		frame.setVisible(true);		

		JOptionPane.showMessageDialog(frame, "내용입니다", "제목", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frame, "내용입니다", "제목", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(frame, "내용입니다", "제목", JOptionPane.INFORMATION_MESSAGE);
	}
}
