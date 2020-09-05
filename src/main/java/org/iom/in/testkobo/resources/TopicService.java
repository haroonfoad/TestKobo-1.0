package org.iom.in.testkobo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.iom.in.testkobo.models.Topic;
import org.springframework.stereotype.Service;

/**
 *
 * @author HNASHER
 */
@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "Al-Jalalin", "description"),
            new Topic("2", "أغنى رجل في بابل", "description"),
            new Topic("3", "Book3", "description"),
            new Topic("4", "Book4", "description"))
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id))
                .findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    
    public void deleteTopic(String id) {
        topics.removeIf(t-> t.getId().equals(id));
    }
}
