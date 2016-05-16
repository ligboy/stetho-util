package org.ligboy.library.stetho;

import timber.log.Timber;

/**
 * Stetho Timber Util
 * @author Ligboy.Liu ligboy@gmail.com.
 */
public class StethoTree extends Timber.Tree {

    /**
     * Write a log message to its destination. Called for all level-specific methods by default.
     *
     * @param priority Log level. See {@link android.util.Log} for constants.
     * @param tag      Explicit or inferred tag. May be {@code null}.
     * @param message  Formatted log message. May be {@code null}, but then {@code t} will not be.
     * @param t        Accompanying exceptions. May be {@code null}, but then {@code message} will not be.
     */
    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        /* no-op */
    }
}
