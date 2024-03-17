import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
public class Code13_06 {
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
	public static void main(String[] args) {
		String fileName = "c:/photo/picture20.jpg";		
		Mat inImage = Imgcodecs.imread(fileName);
		Mat outImage = new Mat();

		Rect rect=new Rect(50, 100, 250, 250);
		outImage = new Mat(inImage ,rect);

		HighGui.imshow("원본 이미지", inImage);
		HighGui.imshow("결과 이미지", outImage);
		HighGui.waitKey(0);	
		System.exit(0);;
	}
}