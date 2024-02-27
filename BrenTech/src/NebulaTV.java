/**
 * Represents a TV from the Nebula brand. Implements the VoiceAssistant interface
 * to provide voice control functionality. Includes methods for handling voice commands related
 * to channel changing, volume adjustment, and processing speech inputs.
 *
 * Last Modified: 2/25/24
 * Author: Brendan Lambrecht
 */

public class NebulaTV extends TV implements VoiceAssistant {
   
   /**
    * Constructs a new NebulaTV object.
    */
   public NebulaTV() {
      super("nebula");
   }
   
   /**
    * Generates speech output for the TV.
    *
    * @param speech The speech output to generate.
    */
   public void saySomething(String speech) {
      System.out.println(speech);
      writeToLogFile("assistant: " + "\"" + speech + "\"");
   }
   
   /**
    * Processes speech inputs to control the TV.
    *
    * @param speech The speech input to process.
    * @throws SpeechNotUnderstoodException If the speech input is not understood.
    */
   public void processSpeech(String speech) throws SpeechNotUnderstoodException {
      if (speech.equals("increase channel")) {
         if (currentChannel < 50) { 
            saySomething("increasing channel");
            incChannel();
         } else {
            saySomething("invalid channel, cannot increase");
         }
      }         
      else if (speech.equals("decrease channel")) {
         if (currentChannel > 1) { 
            saySomething("decreasing channel");
            decChannel();
         } else {
            saySomething("invalid channel, cannot decrease");
         }
      }
      else if (speech.equals("increase volume")) {
         if (currentVolume < 50) { 
            saySomething("increasing volume");
            incVolume();
         } else {
            saySomething("invalid volume, cannot increase");
         }
      }
      else if (speech.equals("decrease volume")) {
         if (currentVolume > 1) { 
            saySomething("decreasing volume");
            decVolume();
         } else {
            saySomething("invalid volume, cannot decrease");
         }
      }
      else if (speech.startsWith("change ")) {
         int val = Integer.parseInt(speech.substring(7));
         saySomething("changing channel to " + val);
         if (val > 0 && val <= 50) {
            changeChannel(val);
         } else if (val < 1) {
            saySomething("invalid channel, cannot decrease");
         } else {
            saySomething("invalid channel, cannot increase");
         }
      }
      else {
         saySomething("exception occurred");
         writeToLogFile("exception: " + speech);
         throw new SpeechNotUnderstoodException("\"" + speech + "\"" + " is not understood by the voice assistant for " + model + " tvs."); 
      }
   }
}