/**
 * Class SpeechNotUnderstoodException: Represents an exception thrown when a speech input
 * is not understood by a voice assistant.
 * 
 * Last Modified: 2/25/24
 * Author: Brendan Lambrecht
 */
 
public class SpeechNotUnderstoodException extends Exception {
    /**
     * Constructs a new SpeechNotUnderstoodException with the specified detail message.
     *
     * @param message The detail message.
     */
    public SpeechNotUnderstoodException(String message) {
        super(message);
    }
}
