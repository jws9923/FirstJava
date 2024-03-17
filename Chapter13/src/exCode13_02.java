import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
public class Code13_04 {
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
	public static void main(String[] args) {
		String fileName = "c:/photo/picture13.jpg";		
		Mat inImage = Imgcodecs.imread(fileName);
		Mat outImage = new Mat();
		
		Core.rotate (inImage, outImage, Core.ROTATE_90_COUNTERCLOCKWISE); 
		
		HighGui.imshow("원본 이미지", inImage);
		HighGui.imshow("결과 이미지", outImage);
		HighGui.waitKey(0);	
		System.exit(0);;
	}
}