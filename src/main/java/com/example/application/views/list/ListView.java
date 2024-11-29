package com.example.application.views.list;

import com.example.application.entity.Children;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Family")
@Route(value = "")
public class ListView  extends VerticalLayout {
    Grid<Children> grid = new Grid<>(Children.class);
    TextField filterText = new TextField();


}
