package org.a2lpo.vemo.components;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyNotifier;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import org.a2lpo.vemo.model.Message;
import org.a2lpo.vemo.repos.MessageRepo;

@SpringComponent
@UIScope
public class MessageBinder extends VerticalLayout implements KeyNotifier {
    private final MessageRepo messageRepo;

    private CustomerEditor.ChangeHandler changeHandler;
    TextField text = new TextField("Text");
    TextField tag = new TextField("Tag");
    HorizontalLayout inputForm = new HorizontalLayout(text, tag);

    Button save = new Button("Save", VaadinIcon.CHECK.create());

    Binder<Message> binder = new Binder<>(Message.class);

    public MessageBinder(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
        add(inputForm, save);

        binder.bindInstanceFields(this);
        setSpacing(true);

        save.getElement().getThemeList().add("primary");

        addKeyPressListener(Key.ENTER, e-> save());
        save.addClickListener(e -> save());
    }

    void save() {
        messageRepo.save(new Message(text.getValue(), tag.getValue()));
        text.clear();
        tag.clear();
    }
}
