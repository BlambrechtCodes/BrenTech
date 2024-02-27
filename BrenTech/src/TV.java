/**
 * Abstract Class TV: Represents a generic TV.
 * Implements the Logger interface to provide logging functionality.
 * Includes fields for current channel, current volume, and model,
 * as well as methods for increasing/decreasing channel and volume,
 * changing the channel, and logging messages.
 *
 * Last Modified: 2/25/24
 * Author: Brendan Lambrecht
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class TV implements Logger {

    /**
     * The current channel of the TV.
     */
    protected int currentChannel;

    /**
     * The current volume of the TV.
     */
    protected int currentVolume;

    /**
     * The model of the TV.
     */
    protected String model;

    /**
     * Constructs a TV with the specified model.
     *
     * @param carModel The model of the TV.
     */
    public TV(String carModel) {
        currentChannel = 2;
        currentVolume = 10;
        model = carModel;
    }

    /**
     * Increases the channel by 1, if possible.
     * If the channel is already at the maximum value (50), logs an error message.
     */
    public void incChannel() {
        if (currentChannel < 50) {
            currentChannel += 1;
            writeToLogFile("increasing channel to " + currentChannel);
        } else {
            writeToLogFile("cannot increase channel");
        }
    }

    /**
     * Decreases the channel by 1, if possible.
     * If the channel is already at the minimum value (1), logs an error message.
     */
    public void decChannel() {
        if (currentChannel > 1) {
            currentChannel -= 1;
            writeToLogFile("decreasing channel to " + currentChannel);
        } else {
            writeToLogFile("cannot decrease channel");
        }
    }

    /**
     * Changes the channel to the specified value, if within valid range (1-50).
     * If the specified channel is outside the valid range, logs an error message.
     *
     * @param channel The channel to change to.
     */
    public void changeChannel(int channel) {
        if (channel > 1 && channel <= 50) {
            currentChannel = channel;
            writeToLogFile("changing channel to " + channel);
        } else {
            writeToLogFile("cannot change channel to " + channel);
        }
    }

    /**
     * Increases the volume by 1, if possible.
     * If the volume is already at the maximum value (50), logs an error message.
     */
    public void incVolume() {
        if (currentVolume < 50) {
            currentVolume += 1;
            writeToLogFile("increasing volume to " + currentVolume);
        } else {
            writeToLogFile("cannot increase volume");
        }
    }

    /**
     * Decreases the volume by 1, if possible.
     * If the volume is already at the minimum value (1), logs an error message.
     */
    public void decVolume() {
        if (currentVolume > 1) {
            currentVolume -= 1;
            writeToLogFile("decreasing volume to " + currentVolume);
        } else {
            writeToLogFile("cannot decrease volume");
        }
    }

    /**
     * Writes a message to the log file associated with the TV.
     *
     * @param message The message to write to the log file.
     */
    public void writeToLogFile(String message) {
        try {
         FileWriter fw = new FileWriter(new File("./" + model + ".txt"), true);
         PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

         // Prints the text in () to the txt file.
         pw.println(message);

         // Closes and Flushes object as it is no longer needed
         pw.close();
         pw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * A visual string representation of the TV, including its current channel, current volume, and model.
     *
     * @return A string representation of the TV.
     */
    @Override
    public String toString() {
        return "TV [" + "currentChannel = " + currentChannel + ", currentVolume = " + currentVolume + ", model = " + model + "]";
    }
}