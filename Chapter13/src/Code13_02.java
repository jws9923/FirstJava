import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

public class Code13_02 {
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
	public static void main(String[] args) {
		String fileName = "c:/photo/picture01.jpg";		
		Mat inImage = Imgcodecs.imread(fileName);
		Mat outImage = new Mat();
		
		outImage = inImage.clone();
		
		HighGui.imshow("원본 이미지", inImage);
		HighGui.imshow("결과 이미지", outImage);		
		HighGui.waitKey(0);	
		Imgcodecs.imwrite("c:/photo/picture01_out.jpg", outImage);
		System.exit(0);
		
	}
}