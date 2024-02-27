/**
 * Represents a smartphone model P10. Extends the Smartphone class
 * and includes methods for taking pictures, recording videos, talking on the phone,
 * and processing speech commands specific to the P10 model.
 *
 * Last Modified: 2/25/24
 * Author: Brendan Lambrecht
 */
 
public class P10 extends Smartphone {
   
   /**
    * Constructs a new P10 smartphone with a battery capacity of 2900 and model name "p10".
    */
   public P10() {
      super(2900,"p10");
   }
   
   /**
    * Takes a picture with the P10 smartphone.
    */
   @Override
   public void takePicture() {
      System.out.println(model + ": Taking picture at 1500 x 1125 pixels");
      currentBatteryAmount -= 150;
      writeToLogFile("\"" + "picture" + "\"");
   }
   
   /**
    * Talks on the phone for a specified number of minutes with the P10 smartphone.
    *
    * @param minutes the number of minutes to talk on the phone
    */
   public void talkOnPhone(int minutes) {
      System.out.println(model + ": Talking on phone for " + minutes + " minutes.");
      currentBatteryAmount -= (10 * minutes);
      writeToLogFile("talk: " + minutes);
   }
   
   /**
    * Records a video with the P10 smartphone for a specified number of seconds.
    *
    * @param seconds the number of seconds to record the video
    */
   public void takeVideo(int seconds) {
      System.out.println(model + ": Taking video on phone for " + seconds + " seconds.");
      currentBatteryAmount -= (5 * seconds);
      writeToLogFile("video: " + seconds);
   }
   
   /**
    * Processes speech commands for the P10 smartphone, including taking pictures,
    * recording videos, and talking on the phone.
    *
    * @param speech the speech command to process
    * @throws SpeechNotUnderstoodException if the speech command is not understood
    */
   @Override
   public void processSpeech(String speech) throws SpeechNotUnderstoodException {
      if (speech.startsWith("video ")) {
         int vidVal = Integer.parseInt(speech.substring(6));
         takeVideo(vidVal);
      } else if (speech.equals("picture")) {
         super.processSpeech("picture");
      } else if (speech.startsWith("talk ")) {
         int vidVal = Integer.parseInt(speech.substring(5));
         super.processSpeech("talk " + vidVal);
      } else {
         writeToLogFile("exception: " + "\"" + speech + "\"");
         throw new SpeechNotUnderstoodException("\"" + speech + "\"" + " is not understood by the voice assistant for " + model + " smartphones.");
      }
   }
}