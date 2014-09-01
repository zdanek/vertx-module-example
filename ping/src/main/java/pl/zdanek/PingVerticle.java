package pl.zdanek;

import org.vertx.java.core.Handler;
import org.vertx.java.platform.Verticle;

public class PingVerticle extends Verticle {

    public static final String PING_ADDRESS = "ping.address";
    private static final long PING_PERIOD = 3000L;

    @Override
    public void start() {

        vertx.setPeriodic(PING_PERIOD, new Handler<Long>() {
            @Override
            public void handle(Long aLong) {
                container.logger().info("Sending PING");
                vertx.eventBus().publish(PING_ADDRESS, "Ping!");
            }
        });

    container.logger().info("PingVerticle started");

  }
}
