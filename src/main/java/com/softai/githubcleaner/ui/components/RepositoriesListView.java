package com.softai.githubcleaner.ui.components;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("repo")
public class RepositoriesListView extends VerticalLayout {
    public RepositoriesListView(){

        add(new H1("Repository list view"));
    }
}
