/**
 * Represents a smartphone model P8. Extends the Smartphone class
 * and includes methods for taking pictures and talking on the phone.
 *
 * Last Modified: 2/25/24
 * Author: Brendan Lambrecht
 */
 
public class P8 extends Smartphone {
   
   /**
    * Constructs a new P8 smartphone with a battery capacity of 2000 and model name "p8".
    */
   public P8() {
      super(2000,"p8");
   }
   
   /**
    * Takes a picture with the P8 smartphone.
    */
   public void takePicture() {
      System.out.println(model + ": Taking picture at 1200 x 900 pixels");
      currentBatteryAmount -= 200;
      writeToLogFile("\"" + "picture" + "\"");
   }
   
   /**
    * Talks on the phone for a specified number of minutes with the P8 smartphone.
    *
    * @param minutes the number of minutes to talk on the phone
    */
   public void talkOnPhone(int minutes) {
      System.out.println(model + ": Talking on phone for " + minutes + " minutes.");
      currentBatteryAmount -= (20 * minutes);
      writeToLogFile("talk: " + minutes);
   }    
}