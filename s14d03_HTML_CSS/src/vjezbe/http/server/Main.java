package vjezbe.http.server;

public class Main {
	public static void main(String[] args) {
		HttpServer.startServer();
		HttpServer.loadWebsite();
		while(true) {
			HttpServer.waitForClients();
		}
	}
}
