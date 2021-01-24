package com.pabelpm.punkapibeer.presentation.utils;

import android.util.Log;

import androidx.test.rule.UiThreadTestRule;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import okhttp3.mockwebserver.MockWebServer;

public class MockServerRule extends UiThreadTestRule {

    public static final int MOCK_WEBSERVER_PORT = 7878;
    private MockWebServer mServer;

    @Override
    public Statement apply(final Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                startServer();
                try {
                    base.evaluate();
                } finally {
                    stopServer();
                }
            }
        };
    }

    /**
     * Returns the started web server instance
     *
     * @return mock server
     */
    public MockWebServer server() {
        return mServer;
    }

    public void startServer() throws IOException, NoSuchAlgorithmException {
        mServer = new MockWebServer();
        mServer.start(MOCK_WEBSERVER_PORT);
        Log.i("Port Server", String.valueOf(mServer.getPort()));
    }

    public void stopServer() {
        try {
            mServer.shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}