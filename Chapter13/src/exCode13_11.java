import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
public class Code13_13 {
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
	public static void main(String[] args) {
		String fileName = "c:/photo/picture73.jpg";		
		Mat inImage = Imgcodecs.imread(fileName, Imgcodecs.IMREAD_COLOR);
		Mat outImage = new Mat();
		
		double scale = 0.5;
		Size sz = new Size(inImage.cols()*scale, inImage.rows()*scale);
		Imgproc.resize(inImage, outImage, sz);
				 
		HighGui.imshow("원본 이미지", inImage);
		HighGui.imshow("결과 이미지", outImage);
		HighGui.waitKey(0);	
		System.exit(0);;
	}
}