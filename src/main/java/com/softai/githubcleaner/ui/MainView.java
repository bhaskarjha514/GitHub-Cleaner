package com.softai.githubcleaner.ui;

import com.softai.githubcleaner.ui.components.LoginLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.material.Material;

@Route
@Theme(value = Material.class, variant = Material.DARK)
@PageTitle("GitHub Manager")
public class MainView extends VerticalLayout {
    LoginLayout loginLayout = new LoginLayout();
    public MainView(){
        add(loginLayout);
    }
}