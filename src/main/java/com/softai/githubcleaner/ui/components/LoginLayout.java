package com.softai.githubcleaner.ui.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;

import java.util.logging.Logger;


public class LoginLayout extends VerticalLayout {

    TextField oauthToken = new TextField("OAuth Token");
    TextField username = new TextField("GitHub Username");
    private final Logger logger = Logger.getLogger(String.valueOf(LoginLayout.class));
    Button submitBtn = new Button("Submit", VaadinIcon.LOCK.create());

    public LoginLayout(){
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        oauthToken.setValueChangeMode(ValueChangeMode.EAGER);
        oauthToken.addValueChangeListener(textFieldStringComponentValueChangeEvent -> {
            oauthToken.setValue(textFieldStringComponentValueChangeEvent.getValue());
        });

        username.setValueChangeMode(ValueChangeMode.EAGER);
        username.addValueChangeListener(textFieldStringComponentValueChangeEvent -> {
           username.setValue(textFieldStringComponentValueChangeEvent.getValue());
        });
        submitBtn.addClickListener(buttonClickEvent -> {
            Notification.show("Authorize to GitHub for " + username.getValue());
        });
        add(oauthToken, username, submitBtn);
    }
}
