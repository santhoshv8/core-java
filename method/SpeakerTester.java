class SpeakerTester
{
    public static void main(String speaker[])
	{
	    System.out.println("main method is started");
		
		Speaker.brand = "Noise" ;
		Speaker.color = "Black" ;
		Speaker.price = 2500 ;
		Speaker.onOrOff();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		
		Speaker.onOrOff();
		Speaker.increaseVolume();
		Speaker.decreaseVolume();
		
		System.out.println("main method is ended");
	}
}