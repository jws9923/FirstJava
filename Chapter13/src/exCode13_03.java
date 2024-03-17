import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
public class Code13_05 {
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
	public static void main(String[] args) {
		String fileName = "c:/photo/picture73.jpg";		
		Mat inImage = Imgcodecs.imread(fileName);
		Mat outImage = new Mat();
		
		int angle=45;
		Point center=new Point(inImage.cols()/2,inImage.rows()/2); 
		Mat rotMat = Imgproc.getRotationMatrix2D(center, angle, 1.0);
		Imgproc.warpAffine(inImage, outImage, rotMat, inImage.size());
		
		HighGui.imshow("원본 이미지", inImage);
		HighGui.imshow("결과 이미지", outImage);
		HighGui.waitKey(0);	
		System.exit(0);;
	}
}