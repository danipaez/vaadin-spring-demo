package org.a2lpo.vemo.routes;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.a2lpo.vemo.components.MessageBinder;
import org.a2lpo.vemo.repos.MessageRepo;

@Route
public class MessageView extends VerticalLayout {

    private final MessageRepo messageRepo;
    private final MessageBinder messageBinder;


    public MessageView(MessageRepo messageRepo, MessageBinder messageBinder) {
        this.messageRepo = messageRepo;
        this.messageBinder = messageBinder;

        add(messageBinder);
    }
}
