package com.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        // Initialize Jetty server on port 8080
        Server server = new Server(8080);
        server.setHandler(new HelloWorldHandler());

        // Start the server
        server.start();
        server.join(); // Wait for server to finish running (optional)

        // Optional: Connect to MongoDB and perform operations
        connectToMongoDB();
    }

    // Handler class to handle incoming HTTP requests
    static class HelloWorldHandler extends AbstractHandler {
        @Override
        public void handle(String target, org.eclipse.jetty.server.Request baseRequest,
                           HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html; charset=utf-8");
            response.setStatus(HttpServletResponse.SC_OK);
            baseRequest.setHandled(true);
            response.getWriter().println("<h1>Hello, World!</h1>");
        }
    }

    // Method to connect to MongoDB and perform operations (stub)
    private static void connectToMongoDB() {
        // Replace with your MongoDB connection and operations
        System.out.println("Connecting to MongoDB and performing operations...");
    }
}
