import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
public class Code13_08 {
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
	public static void main(String[] args) {
		String fileName = "c:/photo/picture06.jpg";		
		Mat inImage = Imgcodecs.imread(fileName);
		Mat outImage = new Mat();

		Imgproc.cvtColor(inImage, outImage, Imgproc.COLOR_RGB2GRAY);
		
		HighGui.imshow("원본 이미지", inImage);
		HighGui.imshow("결과 이미지", outImage);
		HighGui.waitKey(0);	
		System.exit(0);;
	}
}