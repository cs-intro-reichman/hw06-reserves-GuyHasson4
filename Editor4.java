import java.awt.Color;

public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];;
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, Runigram.grayScaled(sourceImage), n);
	}
}
