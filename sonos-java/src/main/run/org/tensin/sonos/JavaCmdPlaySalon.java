package org.tensin.sonos;

import org.tensin.sonos.commander.JavaController;

/**
 * The Class CmdPlaySalon.
 */
public class JavaCmdPlaySalon {

    /**
     * The main method.
     * 
     * @param args
     *            the arguments
     * @throws SonosException
     *             the sonos exception
     */
    public static void main(final String[] args) throws SonosException {
        new JavaController().execute("salon", "play");
    }
}
