package pl.zdanek;

import org.vertx.java.platform.Verticle;


/**
 * Ping Pong with modules starter Verticle.
 */
public class StarterVerticle extends Verticle {


    public void start() {

        container.logger().info("PingPong Example - starting!!!");

        container.deployVerticle(PingVerticle.class.getName());
        container.deployVerticle(PongVerticle.class.getName());

        container.logger().info("PingPong Example - started");
    }
}
