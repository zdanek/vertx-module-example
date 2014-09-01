package pl.zdanek;


import org.vertx.java.core.Handler;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.platform.Verticle;

public class PongVerticle extends Verticle {

    public static final String PING_ADDRESS = "ping.address";

    public void start() {

    vertx.eventBus().registerHandler(PING_ADDRESS, new Handler<Message<String>>() {
      @Override
      public void handle(Message<String> message) {
        message.reply("pong!");
        container.logger().info("Sent back pong!");
      }
    });

    container.logger().info("PongVerticle started");

  }
}
