package com.softai.githubcleaner.ui.components;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
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
        oauthToken.setValueChangeMode(ValueChangeMode.LAZY);
        username.setValueChangeMode(ValueChangeMode.EAGER);
        submitBtn.addClickListener(buttonClickEvent -> {
            UI.getCurrent().navigate("repo");
        });

        add(oauthToken, username, submitBtn);
    }
}
