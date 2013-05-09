/*
 * Copyright 2013 Stephan Conrad <stephan.conrad@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.julbrygd.twitter.bootstrap.menu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stephan Conrad <stephan.conrad@gmail.com>
 */
public class MenuItem implements MenuItemInterface{
    
    protected String url;
    protected String label;
    protected List<MenuItemInterface> submenus;

    public MenuItem() {
        this.submenus = new ArrayList<MenuItemInterface>();
    }

    public MenuItem(String label, String url) {
        this();
        this.url = url;
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean hasSubmenus() {
        return !this.submenus.isEmpty();
    }

    public List<MenuItemInterface> getSubmenus() {
        return this.submenus;
    }

    public void setSebmenus(List<MenuItemInterface> items) {
        this.submenus = items;
    }

    public void addSubmenu(MenuItemInterface item) {
        this.submenus.add(item);
    }

    public void addSubmenu(String label, String url) {
        this.submenus.add(new MenuItem(label, url));
    }
  
}
