import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
public class Code13_07 {
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
	public static void main(String[] args) {
		String fileName = "c:/photo/picture69.jpg";		
		Mat inImage = Imgcodecs.imread(fileName);
		Mat outImage = new Mat();

		inImage.convertTo(outImage, -1, 1, 150); // 마지막 값 : -255 ~ 255

		HighGui.imshow("원본 이미지", inImage);
		HighGui.imshow("결과 이미지", outImage);
		HighGui.waitKey(0);	
		System.exit(0);;
	}
}