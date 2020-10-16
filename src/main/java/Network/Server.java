package Network;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import database.Datamanager;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.sql.SQLException;

public class Server {

    public void start() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress("192.168.43.68",8080), 0);
        HttpContext context = server.createContext("/");
        context.setHandler(Server::handleRequest);
        server.start();
    }

    private static void handleRequest(HttpExchange exchange) throws IOException {
        try {

            String response = Datamanager.getAllHomos() + " is gay";
            System.out.println(exchange.getRemoteAddress());


            exchange.sendResponseHeaders(200, response.getBytes().length);

            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }





    }

}

