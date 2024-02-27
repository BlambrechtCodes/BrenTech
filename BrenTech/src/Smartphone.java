/**
 * Abstract Class Smartphone: Represents a generic smartphone. Implements the VoiceAssistant
 * and Logger interfaces to provide voice control and logging functionalities. Includes
 * abstract methods for taking pictures and talking on the phone, as well as methods for
 * processing speech commands, logging messages, and recharging the battery.
 *
 * Last Modified: 2/25/24
 * Author: Brendan Lambrecht
 */

import java.io.FileOutputStream;
import java.io.DataOutputStream;

public abstract class Smartphone implements Logger, VoiceAssistant {
   
    /** The maximum capacity of the battery. */
    protected double batteryCapacity;

    /** The current amount of charge in the battery. */
    protected double currentBatteryAmount;

    /** The model of the smartphone. */
    protected String model;
   
   /**
    * Constructs a new Smartphone with the given battery capacity and model.
    *
    * @param batteryCapacity the battery capacity of the smartphone
    * @param model the model of the smartphone
    */
   public Smartphone(double batteryCapacity, String model) {
      this.batteryCapacity = batteryCapacity;
      currentBatteryAmount = batteryCapacity;
      this.model = model;
   }

   /**
    * Abstract method to take a picture with the smartphone.
    */
   public abstract void takePicture();
   
   /**
    * Abstract method to talk on the phone for a specified number of minutes.
    *
    * @param minutes the number of minutes to talk on the phone
    */
   public abstract void talkOnPhone(int minutes);
   
   /**
    * Processes speech commands for the smartphone, including taking pictures
    * and talking on the phone.
    *
    * @param speech the speech command to process
    * @throws SpeechNotUnderstoodException if the speech command is not understood
    */
   @Override
   public void processSpeech(String speech) throws SpeechNotUnderstoodException {
      if (speech.equals("picture")) {
         takePicture();
      }         
      else if (speech.startsWith("talk ")) {
         int val = Integer.parseInt(speech.substring(5));
         talkOnPhone(val);
      }
      else {
         writeToLogFile("exception: " + "\"" + speech + "\"");
         throw new SpeechNotUnderstoodException("\"" + speech + "\"" + " is not understood by the voice assistant for " + model + " smartphones.");
      }
   }

   /**
    * Says something using the smartphone's voice assistant.
    *
    * @param speech the speech to be said
    */
   @Override
   public void saySomething(String speech) {
      System.out.println(speech);
      writeToLogFile("assistant: " + "\"" + speech + "\"");
   }
   
   /**
    * Writes a message to the log file of the smartphone.
    *
    * @param message the message to write to the log file
    */
   public void writeToLogFile(String message) {
      try {
         FileOutputStream fos = new FileOutputStream("./" + model + ".bin");
         DataOutputStream dos = new DataOutputStream(fos);
         
         for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) <= 57 && message.charAt(i) >= 48) {
               dos.writeInt(message.charAt(i));
            } else {
               dos.writeChar(message.charAt(i));
            }
         }

         dos.close();

      } catch (Exception e) {
         // Handles the exception
         e.printStackTrace();
      }
   }

   /**
    * Recharges the smartphone's battery to full capacity.
    */
   public void charge() {
      System.out.println("The phone battery is at " + (int)((currentBatteryAmount / batteryCapacity) * 100) + "%" + "\n" + "Recharging");
      writeToLogFile("\'" + "charging" + "\'");
      currentBatteryAmount = batteryCapacity;
   }
   
   /**
    * A printed string representation of the smartphone object.
    *
    * @return a string representation of the smartphone
    */
   public String toString() {
      return "Smartphone [" + "batteryCapacity = " + batteryCapacity + ", currentBatteryAmount = " + currentBatteryAmount + ", model = " + model + "]";  
   }
}