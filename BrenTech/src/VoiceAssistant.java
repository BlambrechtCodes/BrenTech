/**
 * Interface VoiceAssistant: Represents a voice assistant. Includes methods for processing
 * speech commands and generating speech output.
 * 
 * Last Modified: 2/25/24
 * Author: Brendan Lambrecht
 */
 
public interface VoiceAssistant {

    /**
     * Processes the speech input.
     *
     * @param speech The speech input to be processed.
     * @throws SpeechNotUnderstoodException If the speech input is not understood.
     */
    public void processSpeech(String speech) throws SpeechNotUnderstoodException;

    /**
     * Generates speech output.
     *
     * @param speech The speech output to be generated.
     */
    public void saySomething(String speech);
}
