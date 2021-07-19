package pub;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.nio.charset.StandardCharsets;

/**
 * @Author: ruan
 * Date: 2021/7/16 15:53
 * @Description: 发送队列
 */
public class Send {

    private final static String EXCHANGE_NAME = "exchange_fanout";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("8.140.16.6");
        factory.setUsername("admin");
        factory.setPassword("password");
        factory.setVirtualHost("/dev");
        factory.setPort(5672);
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {
            //绑定交换机,fanout扇形，即广播
            channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.FANOUT);
            String msg = "这里是西安财经大学广播-上下上下左右左右BABA";
            channel.basicPublish(EXCHANGE_NAME,"",null,msg.getBytes(StandardCharsets.UTF_8));
            System.out.println("广播消息发送成功:"+msg);
        }
    }
}
