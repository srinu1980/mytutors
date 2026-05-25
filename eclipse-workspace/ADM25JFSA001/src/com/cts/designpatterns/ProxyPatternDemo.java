package com.cts.designpatterns;

//proxyPattern

//Step 1: Define the interface
interface Image {
	void display();
}

//Step 2: Implement the RealObject
class RealImage implements Image {
	private String filename;

	public RealImage(String filename) {
		this.filename = filename;
		loadFromDisk();
	}

	private void loadFromDisk() {
		System.out.println("Loading " + filename);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + filename);
	}
}

//Step 3: Implement the Proxy
class ProxyImage implements Image {
	private RealImage realImage;
	private String filename;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(filename);
		}
		realImage.display();
	}
}

//Client code
public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("testImage.jpg");

		// Image will be loaded from disk
		image.display();
		System.out.println("");

		// Image will not be loaded from disk
		image.display();
	}
}