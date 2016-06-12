package org.ligboy.library.stetho;

import com.facebook.stetho.inspector.console.ConsolePeerManager;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.protocol.module.Console;

/**
 * @author Ligboy.Liu ligboy@gmail.com.
 */

final class ConsoleLog {
    private static final String TAG = "CLog";

    public static void writeToConsole(
            ChromePeerManager chromePeerManager,
            Console.MessageLevel logLevel,
            Console.MessageSource messageSource,
            String messageText) {
        // Send to logcat to increase the chances that a developer will notice :)
//        LogRedirector.d(TAG, messageText);

        Console.ConsoleMessage message = new Console.ConsoleMessage();
        message.source = messageSource;
        message.level = logLevel;
        message.text = messageText;
        Console.MessageAddedRequest messageAddedRequest = new Console.MessageAddedRequest();
        messageAddedRequest.message = message;
        chromePeerManager.sendNotificationToPeers("Console.messageAdded", messageAddedRequest);
    }

    public static void writeToConsole(
            Console.MessageLevel logLevel,
            Console.MessageSource messageSource,
            String messageText
    ) {
        ConsolePeerManager peerManager = ConsolePeerManager.getInstanceOrNull();
        if (peerManager == null) {
            return;
        }

        writeToConsole(peerManager, logLevel, messageSource, messageText);
    }
}
