/**
 * Interface Logger: Represents a logger. Includes a method for writing a message to a log file.
 * 
 * Last Modified: 2/25/24
 * Author: Brendan Lambrecht
 */
 
public interface Logger {
    
    /**
     * Writes a message to a log file.
     *
     * @param message The message to be written to the log file.
     */
    public void writeToLogFile(String message);
}