import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
public class exCode13_01 {
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
	public static void main(String[] args) {
		String fileName = "c:/photo/picture11.jpg";		
		Mat inImage = Imgcodecs.imread(fileName);
		Mat outImage = new Mat();
		
		Core.flip(inImage, outImage, 0);  // 0:상하, 1:좌우
		
		HighGui.imshow("원본 이미지", inImage);
		HighGui.imshow("결과 이미지", outImage);
		HighGui.waitKey(0);	
		System.exit(0);;
	}
}