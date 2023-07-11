package wy.streamoutput.msg;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @Author:王艺
 * @Project:learn
 * @File:SendMsgProducer
 * @Date:2023/7/11 13:15
 */
@EnableBinding(Sink.class)
public class SendMsgProducer {
    public void sendMsg(String msg) {
        MessageBuilder.withPayload(msg).build();
    }

}
